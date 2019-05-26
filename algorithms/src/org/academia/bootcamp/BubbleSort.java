package org.academia.bootcamp;

public class BubbleSort {
    private int[] arrayToSolve;
    

    public BubbleSort(){
        this.arrayToSolve= Input.askForArrayWithNFixedSize();

    }
    public int[] getArray(){
        return arrayToSolve;
    }

    public void solve(){
        Boolean check=false;
        int temp;


            for(int j=arrayToSolve.length;j>=0;j--){
                if(check==true){
                    break;
                }
                check=true;
                for(int i=0;i<j-1;i++){
                    if(arrayToSolve[i+1]<arrayToSolve[i]){
                        temp=arrayToSolve[i];
                        arrayToSolve[i]=arrayToSolve[i+1];
                        arrayToSolve[i+1]=temp;
                        check=false;
                    }
                }

            }
    }
}
