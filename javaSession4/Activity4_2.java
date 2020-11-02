package javaSession4;

import java.io.*;
import org.apache.commons.*;
import org.apache.commons.io.FileUtils;

public class Activity4_2 {

	public static void main(String[] args) throws IOException {

		try {
            File file = new File("src/javaSession4/newfile.txt");
            boolean fStatus = file.createNewFile();
            if(fStatus) {
                System.out.println("File created successfully!");
            } else {
                System.out.println("File already exists at this path.");
            }

            File fileUtil = FileUtils.getFile("src/javaSession4/newfile.txt");
            System.out.println("Data in file: " + FileUtils.readFileToString(fileUtil, "UTF8"));
            File dir = new File("resources");
            FileUtils.copyFileToDirectory(file, dir);
            File newFile = FileUtils.getFile(dir, "newfile.txt");
            String newFileData = FileUtils.readFileToString(newFile, "UTF8");
            System.out.println("Data in new file: " + newFileData);
        } catch(IOException e) {
            System.out.println(e);
        }

	}

}
