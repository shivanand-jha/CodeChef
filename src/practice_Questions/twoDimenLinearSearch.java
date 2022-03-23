package practice_Questions;

import java.util.Scanner;

public class twoDimenLinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = { {1,2,3},
                        {4,5,6},
                        {7,4,9}
        };
       int[] r = linear(arr,9);
        for (int i:r) {
            System.out.println(i);
        }
    }
    static int[] linear(int[][] matrix,int target){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]==target)
                {
//                    System.out.println("row "+i+" "+"column "+j);
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
}}
