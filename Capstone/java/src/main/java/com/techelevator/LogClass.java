package com.techelevator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LogClass {

	public static void main(String[] args) throws IOException {
	
	String fileName = "log.txt";
	File inputLog = new File(fileName);
	inputLog.createNewFile();
	String toBeInserted = "";
	
	
	PrintWriter writer = new PrintWriter(new FileOutputStream(inputLog.getAbsoluteFile(), true));
	writer.println(toBeInserted);
	
}
}