package org.academia.bootcamp;

public class SelectionSort {
    private int[] arrayToSolve;

    public SelectionSort(){
        arrayToSolve=Input.askForArrayWithNFixedSize();
    }

    public int[] getArray(){
        return arrayToSolve;
    }

    public void solve(){
        int initPos,initValue,newMinPos,newMinValue,temp ;

        for(int i=0;i<arrayToSolve.length;i++){
            initPos=i;
            initValue=arrayToSolve[i];
            newMinPos=initPos;
            newMinValue=initValue;
            for(int j=i;j<arrayToSolve.length;j++){
                if (arrayToSolve[j]<newMinValue){
                    newMinPos=j;
                    newMinValue=arrayToSolve[j];
                }
            }
            temp = initValue;
            arrayToSolve[initPos]=arrayToSolve[newMinPos];
            arrayToSolve[newMinPos]=temp;

        }
    }
}
