/*
 * Q4: Write a program to find the largest element of a given 2D array of integers. 
    
    Input :
    1 2 4 0
    2 5 7 -1
    4 2 6 9

    Output : 9
 */

import java.util.*;
public class Q4 {

    public static int largestEle(int arr[][]){
        int largest = arr[0][0];
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                if(arr[i][j] > 0){
                    largest = arr[i][j];
                }
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter row size : ");
        int r = s.nextInt();
        System.out.println("Enter column size : ");
        int c = s.nextInt();
        int arr[][] = new int[r][c];

        System.out.println("Enter total elements : ");

        for(int i =0; i<r; i++){
            for(int j = 0; j<c; j++){
                arr[i][j] = s.nextInt();
            }
        }
       int result = largestEle(arr);
       System.out.println(result);
    }
}
