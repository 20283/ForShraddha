package com.daulat.assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

	private static BufferedReader br, br1;
	private static BufferedWriter bw;
	private static String str;
	private static int fileCount;

	public static void main(String[] args) throws IOException {

		// Counting number of files exist in the directory
		fileCount = new File("D:\\NewPractice\\Assignments\\Assignments\\test").listFiles().length;
		

		// Reading data from file
		br = new BufferedReader(new FileReader("reports.html"));
		br1 = new BufferedReader(new FileReader("reports.html"));

		// Creating backup file
		File file = new File("D:\\NewPractice\\Assignments\\Assignments\\test\\file" + (fileCount + 1) + ".html");
		file.createNewFile();

		// Taking back up
		if (br1.readLine() != null) {
			bw = new BufferedWriter(new FileWriter(file));
			while ((str = br.readLine()) != null) {
				bw.write(str + "\n");
				bw.flush();
				// bw.close();
			}
		}
		br.close();
		br1.close();
		// }
	}
}
