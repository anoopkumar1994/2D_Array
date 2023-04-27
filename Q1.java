/*
 * Q1: Take m and n input from the user and m * n integer inputs from user and print the following:
 			 
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
number of 0.

Input : 
1 2 -3 4
0 0 -4 2
1 -1 2 3
-4 -5 -7 0

Output : 

number of positive numbers = 7
number of negative numbers = 6
number of odd numbers = 7
number of even numbers = 9
number of 0 = 3
 */

 import java.util.Scanner;

 public class Q1{

    public static void count(int arr[][], int positive, int negative, int odd, int even, int zero){

        for(int i = 0; i<arr.length; i++){
            for(int j =0; j<arr.length; j++){

                if(arr[i][j] > 0 ){
                   positive++;
                }else if(arr[i][j] < 0){
                    negative++;
                }else{
                    zero++;
                }
                if(arr[i][j] % 2 == 0){
                    even++;
                }else{
                    odd++;
                }
            }
        }
        System.out.println("number of positive numbers = " + positive);
        System.out.println("number of negative numbers = " + negative);
        System.out.println("number of odd numbers = " + odd);
        System.out.println("number of even numbers = " + even);
        System.out.println("number of 0 = " + zero);

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter row size : ");
        int r = s.nextInt();
        System.out.print("Enter column size : ");
        int c = s.nextInt();

        int arr[][] = new int[r][c];

        System.out.println("Enter total " + r * c + " elements");

        for(int i = 0; i<r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = s.nextInt();
            }
        }

        int positive = 0, negative = 0, odd = 0, even = 0, zero = 0;

        count(arr, positive, negative, odd, even,zero );



    }
 }