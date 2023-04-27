/*
 * Q5: Write a function which accepts a 2D array of integers and its size as arguments and 
 displays the elements of middle row and the elements of middle column. Printing can be done in any order.
[Assuming the 2D Array to be a square matrix with odd dimensions i.e. 3x3, 5x5, 7x7 etc...]

    Input :
    1 2 3 4 5
    3 4 5 6 7
    7 6 5 4 3
    8 7 6 5 4
    1 2 37 8 0

    Output : 3 5 5 6 37 7 6 4 3
 */

import java.util.*;
public class Q5 {
    public static void printMidRowCol(int arr[][], int size){
        int mid = size / 2;
  
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i][mid] + " ");
        }
      
        for (int i = 0; i < size; i++) {
            System.out.print(arr[mid][i] + " ");
        }
    
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter row size : ");
        int r = s.nextInt();
        int arr[][] = new int[r][r];

        System.out.println("Enter total elements : ");

        for(int i =0; i<r; i++){
            for(int j = 0; j<r; j++){
                arr[i][j] = s.nextInt();
            }
        }
        printMidRowCol(arr, r);
       
    }
    
}
