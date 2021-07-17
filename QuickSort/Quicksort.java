import java.io.*;
import java.util.*;

class Quick{
    static void printArray(int[] array){
        for (int i=0;i<array.length ;i++ ){
            System.out.println(array[i]+ " ");
        } 
    }
    static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    /* Partition */
    static int partition(int[] array,int low,int high){
            int pivot = array[high];
            int i = (low-1);
            for(int j = low; j <= high - 1; j++){
                if(array[j] < pivot){
                    i++;
                    swap(array, i, j);
                }
            }
        swap(array, i+1, high);
        return i+1;
    }
    /* Quick Sort */
    static void sort(int[] array, int low, int high){
        if(low<high){
            
            int pivot = partition(array, low, high);
            
            sort(array, low, pivot-1);
            sort(array, pivot+1, high);
            
            
        }
        
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i=0;i<n ;i++ ){
            array[i] = sc.nextInt();
        } 
        Quick.sort(array, 0, array.length-1);
        printArray(array);
    }
}