/*package com.daulat.assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Tester {

	private static List<File> fileList = new ArrayList<>();
	private static List<File> backupFileList = new ArrayList<>();
	private static BufferedReader br, br1;
	private static BufferedWriter bw;
	private static String str;
	private static int size;
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		// Taking input as number of files user wants to create
		
		System.out.println("Number of files you want to create: ");
		size = scan.nextInt();

		// Creating files
		for (int i = 0; i < size; i++) {
			fileList.add(new File("file" + (i + 1) + ".txt"));
			fileList.get(i).createNewFile();
			br = new BufferedReader(new FileReader(fileList.get(i)));
			br1 = new BufferedReader(new FileReader(fileList.get(i)));

			// Creating back up files at a specified location
			backupFileList.add(new File("D:\\NewPractice\\Assignments\\Assignments\\Backup\\file" + (i + 1) + ".txt"));
			backupFileList.get(i).createNewFile();

			// Taking back up
			if (br1.readLine() != null) {
				bw = new BufferedWriter(new FileWriter(backupFileList.get(i)));
				while ((str = br.readLine()) != null) {
					bw.write(str);
					bw.flush();
					bw.close();
				}
			}
			br.close();
			br1.close();
		}
	}
}
*/