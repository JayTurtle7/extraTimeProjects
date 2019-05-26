package org.academia.bootcamp;

public class InsertionSort {
    private int[] arrayToSolve;

    public InsertionSort(){
        this.arrayToSolve= Input.askForArrayWithNFixedSize();
    }

    public void solve(){
        int temp;
        for(int i=1;i<arrayToSolve.length;i++){
            for(int j=i;j<=0;j++){
                if(arrayToSolve[j-1]<=arrayToSolve[i]){
                    break;
                }
                temp=arrayToSolve[j-1];
                arrayToSolve[j-1]=arrayToSolve[j];
                arrayToSolve[j]=temp;
            }
        }
    }

    public int[] getArray(){
        return arrayToSolve;
    }
}
