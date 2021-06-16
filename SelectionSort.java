/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;

/**
 *
 * @author HP
 */
public class SelectionSort {

    void sort(int arr[]) {

        for (int i = 0; i < (arr.length - 1); i++) {

            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }

                int temp = arr[min_index];
                arr[min_index] = arr[i];
                arr[i] = temp;
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
        SelectionSort S = new SelectionSort();
        int arr[]= {10,5,12,50,85,31};
        S.sort(arr);
        System.out.println("--Sorted Array--");
        S.print(arr);

    }

}
