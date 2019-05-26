package org.academia.bootcamp;

public class Output {

    public static void printArray(int[] array){
        String stringArray="[" ;
        for(int i=0;i<array.length;i++){
            if(i==array.length-1){
                stringArray=stringArray + array[i] + "]";
                System.out.println(stringArray);
                return;
            }
            stringArray= stringArray + array[i] + ",";
        }

    }

    public static void printMenu(){
        System.out.println("-----------------");
        for(Algorithms algorithms : Algorithms.values()){
            System.out.println(""+ algorithms +" "+ algorithms.getOption());
        }
        System.out.println("-----------------");


    }
}
