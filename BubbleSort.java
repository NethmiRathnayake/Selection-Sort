/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

/**
 *
 * @author HP
 */
public class BubbleSort {

     void sort(int arr[]) {

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < (arr.length- i - 1); j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }

    void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        BubbleSort B = new BubbleSort();
        int arr[]={10,75,83,7,43,58};
        B.sort(arr);
        System.out.println("--Sorted Array--");
        B.print(arr);
    }


}
