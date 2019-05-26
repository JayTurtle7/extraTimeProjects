package org.academia.bootcamp;

import java.util.Scanner;

public class Input {


    public static int[] askForArrayWithNFixedSize(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Length of the array");
        int sizeOfArr=scanner.nextInt();
        System.out.println("Insert "+ sizeOfArr +" numbers");
        int[] array= new int[sizeOfArr];
        for(int i=0;i<sizeOfArr;i++){
            array[i]=scanner.nextInt();
        }
        return array;
    }

    public static Algorithms askForOption(){
        Scanner scanner = new Scanner(System.in);
        int option=scanner.nextInt();
        return Algorithms.values()[0];
    }
}
