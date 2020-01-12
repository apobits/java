package practice.java.concurrency;

import java.io.IOException;
import java.nio.file.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Stream;

public class LinkedBlockingQueueExample {

    public static void main(String args[]) throws InterruptedException {
	LinkedBlockingQueue<Path> linkedBlockingQueue = new LinkedBlockingQueue<>(2);

	Runnable fileCreationRunnable = () -> {
	    Path path = Paths.get("C:\\Users\\aposo\\Desktop\\source");
	    path = path.resolve(new SimpleDateFormat("yyyyMMddHHMMSSss").format(new Date()) + ".txt");
	    try {
		if (!Files.exists(path)) {
		    System.out.println(Thread.currentThread().getName() + " Creating file: " + path);
		    Files.createFile(path);
		    String data = "Created by " + Thread.currentThread().getName();
		    Files.write(path, data.getBytes(), StandardOpenOption.APPEND);
		    linkedBlockingQueue.put(path);
		}
	    } catch (IOException | InterruptedException e) {
		e.printStackTrace();
	    }
	};

	Runnable fileTransferingRunnable = () -> {
	    try {
		Path targetPath = Paths.get("C:\\Users\\aposo\\Desktop\\target");
		Path path = linkedBlockingQueue.take();
		targetPath = targetPath.resolve(path.getFileName());
		System.out.println(Thread.currentThread().getName() + " Moving file: " + path);
		Files.move(path, targetPath, StandardCopyOption.REPLACE_EXISTING);
		String data = "\nMoved by " + Thread.currentThread().getName();
		Files.write(targetPath, data.getBytes(), StandardOpenOption.APPEND);
	    } catch (InterruptedException | IOException e) {
		e.printStackTrace();
	    }
	};

	var scheduledExecutorService = Executors.newScheduledThreadPool(10);
	scheduledExecutorService.scheduleAtFixedRate(fileCreationRunnable, 0, 20, TimeUnit.SECONDS);
	scheduledExecutorService.scheduleAtFixedRate(fileCreationRunnable, 30, 20, TimeUnit.SECONDS);
	scheduledExecutorService.scheduleAtFixedRate(fileTransferingRunnable, 20, 20, TimeUnit.SECONDS);
	scheduledExecutorService.scheduleAtFixedRate(fileTransferingRunnable, 40, 20, TimeUnit.SECONDS);

    }
}
