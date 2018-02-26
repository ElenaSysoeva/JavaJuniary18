/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import Interfaces.IRead;
import java.util.Scanner;
/**
 *
 * @author home
 */
  class Read implements IRead {

    @Override
    public String read() {
        Scanner Scdep = new Scanner (System.in);
        String departure = Scdep.nextLine();
        Scanner Scarri = new Scanner (System.in);
        String arrival = Scarri.nextLine();
        // System.out.println("departure " + departure);
         //System.out.println("arrival " + arrival);
        return departure+"|"+arrival;
    }

      

    
}
