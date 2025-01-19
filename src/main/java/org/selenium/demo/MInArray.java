package org.selenium.demo;

public class MInArray {
    public static void main(String[] args) {


        int[] arr={6,5,7,8,0,1};
        int min=arr[0];


        for (int i=0;i<arr.length;i++){

            if (arr[i]<min){

                min=arr[i];

            }


        }
        System.out.println(min);

    }


}
