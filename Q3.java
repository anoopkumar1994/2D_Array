/*
 * Q3: write a program to print the elements of both the diagonals in a user inputted square matrix 
    in any order.
    
    Input : 
    1 2 3 
    4 5 6
    7 8 9

    Output: 1 3 5 7 9
 */

 import java.util.*;
public class Q3 {

    public static void bothDiagonals(int arr[][]){
        for(int i = 0; i <arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                int sumOfiJ = i + j;
                if(sumOfiJ  == arr.length -1){
                    System.out.print(arr[i][j] + "  ");
                } else if(i == j){
                    System.out.print(arr[i][j] + "  ");
                }
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
        bothDiagonals(arr);
    }
}
