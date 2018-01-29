package Lab10;

import java.awt.*;
import java.io.*;
import java.util.Scanner;

public class Lab10task2 {

    public static void printAsHTML(String content) {


        String filename = "out/page.html";






        try {
            PrintWriter  writer = new PrintWriter(filename, "UTF-8");
            writer.println("<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "<meta charset=\"utf-8\"/>\n" +
                    "<head/>\n" +
                    "<body>\n" +
                    "<h1>Мой первый векторный рисунок</h1>\n" +
                    "\n" +
                    "<svg width=\"800\" height=\"600\">\n" +
                    "\t<"+ content  +"\" fill=\"yellow\" />\n" +
                    "</svg>\n" +
                    "</body>\n" +
                    "</html>");
            writer.close();

            Desktop.getDesktop().open(new File(filename));


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }






}
