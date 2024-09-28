package org.example;


import java.util.Arrays;

public class Sorting {
    public static void main(String[] args){
        int[] array={10,27,38,15,99,4,84,5,12};

        selectionSort(array);
        bubbleSort(array);
        System.out.println("Before Quick Sort:: "+Arrays.toString(array));
        quickSort(array,0,array.length-1);
        System.out.println("Quick Sort:: "+Arrays.toString(array));
    }
    public static void bubbleSort(int[] array){
        int n= array.length;
        System.out.println("Before Bubble Sort:: "+Arrays.toString(array));
        for (int i=0; i<n; i++){
            for(int j=0; j<(n-i-1); j++){
                if(array[j]<array[j+1]){
                   int temp =array[j];
                   array[j]=array[j+1];
                   array[j+1]=temp;
                }
            }
        }
        System.out.println("Bubble Sort:: "+Arrays.toString(array));
    }

    public static void selectionSort(int[] array){
        int n= array.length;
        System.out.println(Arrays.toString(array));
        for(int i=0; i<n; i++){
            int index=i;
            for(int j=i+1;j<n;j++){
                if(array[j]<array[index]){
                    index=j;
                }
            }
            int temp=array[i];
            array[i]=array[index];
            array[index]=temp;
        }
        System.out.println(Arrays.toString(array));
    }
    public static void quickSort(int[] array, int low, int high){
        if (low<high){
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex-1);
            quickSort(array, pivotIndex+1, high);
        }
    }
    public static int partition(int[] array, int low, int high){
        int pivot = array[high];
        int i=low-1;
        for (int j=low; j<high; j++){
            if(array[j]<pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }
        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;
        return i+1;
    }

}
