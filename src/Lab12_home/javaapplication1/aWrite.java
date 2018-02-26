/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import Interfaces.IWrite;
import java.util.Scanner;


/**
 *
 * @author home
 */
 class Write implements IWrite {
    
     
     public static void main (String[] args){
        /*
        Scanner Scdep = new Scanner (System.in);
        String departure = Scdep.nextLine();
        Scanner Scarri = new Scanner (System.in);
        String arrival = Scarri.nextLine();
         System.out.println("departure " + departure);
         System.out.println("arrival " + arrival);
         */
    }
   
     
       Scanner Scdep = new Scanner (System.in);
       private String departure = Scdep.nextLine();
        Scanner Scarri = new Scanner (System.in);
       private String arrival = Scarri.nextLine();

     
     
    @Override
    public String write (String departure, String arrival) {
           // this.departure; Error ?

      
        return "jjj";
    }
    
}
