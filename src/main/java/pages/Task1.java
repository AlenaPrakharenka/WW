package pages;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
	
	private static Scanner scanner;

    public static boolean checkFileExist(String path){
            File file = new File(path);
        try {
             scanner = new Scanner(file);
            System.out.println("File is found");
            return true;
        } catch (FileNotFoundException e) {
            System.out.println("File with path: \""+path+"\"not found");
            return false;
        }
    }

    public static void readingFromFile(String path){
        if(checkFileExist(path)){
            while (scanner.hasNextLine()) {
               String string = scanner.nextLine();
               String[] firstSplit= string.split("-");
                String[] secondSplit = firstSplit[1].split(",");
                System.out.println(firstSplit[0]);
                for(int i =0; i<secondSplit.length; i++){
                    System.out.println(secondSplit[i].trim());
                }
                System.out.println();

            }
        }
    }

	public static void main(String[] args) {
		readingFromFile("data.txt");
	}

}
