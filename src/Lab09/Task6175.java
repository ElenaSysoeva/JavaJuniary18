package Lab09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task6175 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();

        String fileName = "Tasks/files/task6175/test" + i + ".txt";
        File target = new File(fileName);
        if (!target.exists()){
            System.out.println("File not found");
            System.out.println(target.getAbsolutePath());
        }
        else
        {
            System.out.println("Hi");
            try {
                Scanner reader = new Scanner(target);  //открытие файла
                String line = reader.nextLine();
                while (reader.hasNext()){
                    line = reader.nextLine();
                    System.out.printf(line+'\n');
                }


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }


    }


}
