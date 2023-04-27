/*
 * Q2: write a program to print the elements above the secondary diagonal in a user inputted 
    square matrix.
    
    Input: 
    1 2 3
    4 5 6
    7 8 9

    Output : 1 2 4
 */

import java.util.Scanner;

public class Q2 {

    public static void secDiagonal(int arr[][]){
        

        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                int sumOfiJ = i + j;
                if(sumOfiJ < arr.length-1)
                System.out.print(arr[i][j] + " ");
            }
        }

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

        secDiagonal(arr);
    }    
}
