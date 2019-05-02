/**
 * 
 */
package practice.java.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * @author apobits@gmail.com
 *
 */
public class ScannerExample {

	public static void fromInputStream() {
		try (Scanner scanner = new Scanner(System.in);
				FileWriter fw = new FileWriter("C:\\Users\\Administrador\\Desktop\\test\\serialized.java");
				BufferedWriter br = new BufferedWriter(fw)) {
			String line;
			while (!(line = scanner.nextLine()).equalsIgnoreCase("Exit")) {
				br.write(line);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public static void fromPath() {
		try (Scanner scanner = new Scanner(Paths.get("C:\\Users\\Administrador\\Desktop\\test\\serialized.java"))) {
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public static void fromFile() {
		try (Scanner scanner = new Scanner(new File("C:\\Users\\Administrador\\Desktop\\test\\serialized.java"))) {
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public static void fromString() {
		try (Scanner scanner = new Scanner("Hello there ...")) {
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
		}
	}

	public static void tokens() {
		try (Scanner scanner = new Scanner(System.in)) {
			Stream<String> stream = scanner.tokens();
			stream.forEach(t -> System.out.print(t + " "));
		}
	}

	public static void findAll() {
		try (Scanner scanner = new Scanner(System.in)) {
			Stream<MatchResult> stream = scanner.findAll(Pattern.compile("^*.java"));
			stream.forEach(t -> System.out.print(t.group() + " "));
		}
	}

	public static void main(String[] args) {
		findAll();
		System.exit(1);
		tokens();

		fromString();

		try (Scanner scanner = new Scanner(System.in)) {

			scanner.hasNext();
			scanner.hasNextLine();
			scanner.hasNextInt();

			scanner.next();
			scanner.nextLine();
			scanner.nextInt();

			scanner.findInLine("Hello");
			scanner.next();
		}
	}

}
