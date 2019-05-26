package org.academia.bootcamp;

public enum Algorithms {
    BUBBLESORT(0),
    INSERTIONSORT(1),
    SELECTIONSORT(2);

    public int option;
    Algorithms(int option){
        this.option = option;
    }
    public int getOption(){
        return option;
    }
}
