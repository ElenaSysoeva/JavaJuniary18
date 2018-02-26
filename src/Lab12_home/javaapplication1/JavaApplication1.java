/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.*;
import java.util.Arrays;

/**
 *
 * @author home
 */
public class JavaApplication1 {
    
    public static void main (String[] args){
        //PrintOut();
        //PrintArray();
        System.out.println(GetArray());
    }

    public static int GetItem() {
        int item = (int) (Math.random() * 10);
        return item;   
    }
            
    static void PrintOut(){
        System.out.println("Item:" + GetItem());
    }
    static void PrintArray(){
        System.out.println("array:" + GetArray());
    }

    @SuppressWarnings("empty-statement")
    private static int[] GetArray() {
        int size = GetItem();       
        int [] array = new int [size];
        int x = 0;
        while (x<array.length){
            int index = GetItem();
           //System.out.println("index " +index);
          
          Arrays.fill(array, index);
            System.out.println("array " + array[x]);
           
         x++;  
       }
      
       return array;   
       //return array.length; 
    }

    

}
 