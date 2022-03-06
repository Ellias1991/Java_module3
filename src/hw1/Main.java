package hw1;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {

   }

    public static void changeIndex (int[]arr, int index1, int index2 ){
    int obj= arr[index1];
    arr[index1]=arr[index2];
    arr[index2]=obj;

    }


    public static <T> ArrayList<T> arrayToList(T[] array){
        return new ArrayList<>(Arrays.asList(array));
    }
}
