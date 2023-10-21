package practice.program.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ConvertCommaToSpace {
	public static void main(String[] args) {
		String[] inputFiles = {
				"D:\\Projects\\Java Repos\\ParadiseOfDsa\\JavaDSA\\practice\\program\\service\\expected.txt",
				"D:\\Projects\\Java Repos\\ParadiseOfDsa\\JavaDSA\\practice\\program\\service\\mine.txt",
				"D:\\Projects\\Java Repos\\ParadiseOfDsa\\JavaDSA\\practice\\program\\service\\input2.txt" };

		for (String inputFile : inputFiles) {
			commaSeperated(inputFile);
		}
		String input = "D:\\Projects\\Java Repos\\ParadiseOfDsa\\JavaDSA\\practice\\program\\service\\input.txt";
		customSeperator(input, ",[", "\n[");
	}

	public static void commaSeperated(String inputFile) {

		String outputFile = inputFile.replace(".txt", "_output.txt");

		try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
				BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

			String line;
			while ((line = reader.readLine()) != null) {
				String[] values = line.split(",");
				for (String value : values) {
					writer.write(value);
					writer.newLine(); // Add a newline after each value
				}
			}

			System.out.println("Conversion completed for " + inputFile + ". Output written to " + outputFile);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void customSeperator(String inputFile, String replace, String withReplace) {

		String outputFile = inputFile.replace(".txt", "_output.txt");

		try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
				BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

			String line;
			while ((line = reader.readLine()) != null) {
				String value = line.replace(replace, withReplace);
				writer.write(value);
				writer.newLine(); // Add a newline after each value
			}

			System.out.println("Conversion completed for " + inputFile + ". Output written to " + outputFile);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/*
	 * 
	 * String[] inputFiles = {
	 * "D:\\Projects\\Java Repos\\ParadiseOfDsa\\JavaDSA\\practice\\program\\service\\expected.txt"
	 * ,
	 * "D:\\Projects\\Java Repos\\ParadiseOfDsa\\JavaDSA\\practice\\program\\service\\mine.txt"
	 * ,
	 * "D:\\Projects\\Java Repos\\ParadiseOfDsa\\JavaDSA\\practice\\program\\service\\input.txt"
	 * ,
	 * "D:\\Projects\\Java Repos\\ParadiseOfDsa\\JavaDSA\\practice\\program\\service\\input2.txt"
	 * };
	 * 
	 * for (String inputFile : inputFiles) { String outputFile =
	 * inputFile.replace(".txt", "_output.txt");
	 * 
	 * try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
	 * BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
	 * 
	 * String line; while ((line = reader.readLine()) != null) { String value =
	 * line.replace(",[", "\n[") ; // for (String value : values) {
	 * writer.write(value); writer.newLine(); // Add a newline after each value // }
	 * }
	 * 
	 * System.out.println("Conversion completed for " + inputFile +
	 * ". Output written to " + outputFile); } catch (IOException e) {
	 * e.printStackTrace(); } }
	 * 
	 */

}
