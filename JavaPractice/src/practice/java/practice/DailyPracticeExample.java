/**
 *
 */
package practice.java.practice;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.concurrent.*;
import java.util.stream.Collectors;

interface A {
    String a = "A";
}

/**
 * @author apobits@gmail.com
 *
 *
 */

public class DailyPracticeExample implements A {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
	Runnable runnable = () -> System.out.println("something printed");
	Callable<String> callable = () -> "Hello there";
	var executorService = Executors.newSingleThreadExecutor();
	Future<String> future = executorService.submit(callable);
	while (!future.isDone()) {
	    System.out.println("Waiting for task to complete");
	}
	System.out.println(future.get());
    }

    private static void getCallIds() throws IOException {
	var gt = new HashSet<>(Files.readAllLines(Paths.get("C:\\Users\\aposo\\Desktop\\jira91prod\\GTCallId")));
	var click = new HashSet<>(Files.readAllLines(Paths.get("C:\\Users\\aposo\\Desktop\\jira91prod\\ClickCallId")));
	gt.retainAll(click);
	Files.write(Paths.get("C:\\Users\\aposo\\Desktop\\jira91prod\\Tasks.txt"),
			gt.stream().collect(Collectors.joining("\n")).getBytes());
    }

    private static void consume() {
	try {
	    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(
			    "http://localhost:8081/LearningWeb/servletTwo").openConnection();
	    httpURLConnection.setRequestMethod("GET");
	    httpURLConnection.connect();
	    String line;
	    try (BufferedReader bufferedReader = new BufferedReader(
			    new InputStreamReader(httpURLConnection.getInputStream()))) {
		while ((line = bufferedReader.readLine()) != null) {
		    System.out.println(line);
		}
	    }
	    httpURLConnection.disconnect();
	} catch (IOException e) {
	    System.out.println(e);
	}
    }

    private void frame() {
	var jFrame = new JFrame();
	var jPanel = new JPanel();
	var jLabel = new JLabel();
	var jTextField = new JTextField();
	var jButton = new JButton();

	jFrame.add(jPanel);
	jPanel.add(jLabel);
	jPanel.add(jTextField);
	jPanel.add(jButton);

	jFrame.setVisible(true);
	jFrame.setSize(500, 500);

	jLabel.setText("Testing");

	jTextField.setColumns(5);

	jButton.addActionListener(new ButtonListener(jPanel));
	JOptionPane jOptionPane = new JOptionPane();

	System.out.println(jTextField.getText());
    }

}
