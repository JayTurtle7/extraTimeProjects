package org.academia.bootcamp;

public class Menu {



    public static void menu(){

        Output.printMenu();
        Algorithms option=Input.askForOption();
        switch(option){
            case BUBBLESORT:
                BubbleSort bubble= new BubbleSort();
                bubble.solve();
                Output.printArray(bubble.getArray());
                break;
            case INSERTIONSORT:
                InsertionSort insertion= new InsertionSort();
                insertion.solve();
                Output.printArray(insertion.getArray());
                break;
            case SELECTIONSORT:
                SelectionSort selection= new SelectionSort();
                selection.solve();
                Output.printArray(selection.getArray());
                break;
        }
    }
}
