package urok7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UTFDataFormatException;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Logger;

import javax.sound.sampled.AudioFormat.Encoding;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {
	public static ArrayList<String> wordsContainer;
	public static File fileFile;
	public static HashMap<Map<Integer, Character>, Character> Chars;

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:\\Users\\cpt2egi\\Desktop");
		Path file = path.resolve("TestFolder2");

		fileFile = new File(file.toString() + "\\bg_utf8.txt");
		wordsContainer = new ArrayList<String>();
		readLargerTextFile(fileFile, wordsContainer);
		ArrayList<String> test = new ArrayList<String>();
		test = getByPrefix("а");
		for (int i = 0; i < test.size(); i++) {
			System.out.println(test.get(i));
		}
	}

	static void readLargerTextFile(File aFileName, ArrayList<String> words)
			throws IOException {
		try (Scanner scanner = new Scanner(aFileName, "UTF8")) {
			while (scanner.hasNextLine()) {
				words.add(scanner.nextLine());
			}
		}
	}

	public static void define() {
		int i2=0;
		for(int i=0;i<wordsContainer.size();i++)
		{
			i2=0;
			char word = wordsContainer.get(i).charAt(i2);
			for(;i2<wordsContainer.get(i).length();i2++)
			{
				
			}
		}
	}

	public static ArrayList<String> getByPrefix(String prefix) {
		ArrayList<String> temp = new ArrayList<String>();
		
		for (String s : wordsContainer) {
			if (s.startsWith(prefix))
				temp.add(s);
		}
		return temp;
	}

	public static void addWord(String word) throws IOException {
		Writer out = new BufferedWriter(new OutputStreamWriter(
			    new FileOutputStream(fileFile), "UTF8"));
		Scanner scanner = new Scanner(fileFile).useDelimiter("\n");
		String line = scanner.next();
		int wordsLenght=0, red=0;
			for(int i=0;i<wordsContainer.size();i++)
			{
				wordsLenght+=wordsContainer.get(i).length();
				red++;
				if(wordsContainer.get(i).contains(word.charAt(1)+""))
				{
			try {
				String newLine = line.substring(red, wordsLenght) + word + line.substring(wordsLenght);
			    out.write(newLine);
			    break;
			} finally {
			    out.close();
			}
				}
			}
		// VLADIMIR.PANOV@SAP.COM
	}
}
