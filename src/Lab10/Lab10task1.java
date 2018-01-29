package Lab10;

import java.awt.*;
import java.io.*;
import java.util.Scanner;

public class Lab10task1 {

    public static void main(String[] args) {
        String filename = "out/page.html";

        Scanner s = new Scanner(System.in);
        int cx= s.nextInt();
        int cy= s.nextInt();
        int r= s.nextInt();
        int sw= s.nextInt();




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
                        "\t<circle cx=\""+cx+"\" cy=\""+cy+"\" r=\""+r+"\" stroke=\"green\" stroke-width=\""+sw+"\" fill=\"yellow\" />\n" +
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
