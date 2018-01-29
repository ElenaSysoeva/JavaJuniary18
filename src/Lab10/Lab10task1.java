package Lab10;

import java.awt.*;
import java.io.*;
import java.util.Scanner;

public class Lab10task1 {

    public static void main(String[] args) {
        String filename = "out/page.html";

        Scanner s = new Scanner(System.in);
        int x= s.nextInt();
        int y= s.nextInt();
        int height= s.nextInt();
        int width= s.nextInt();
        String sh ="rect";

        Lab10task2.printAsHTML(sh+" x=\""+x+"\" y=\""+y+"\" height=\""+height+"\" width=\""+width+"\" stroke=\"green\" stroke-width=\"2\"");


    }


}
