package practice_Questions;


public class Matrix_Row_Column_Sorted {
    public static int[] search(int[][] matrix,int target)
    {
        int first=0;
        int last= matrix[0].length-1;
        while(last>=0 && first < matrix.length)
        {
            if(matrix[first][last]==target)
                return new int[]{first,last};
            if (matrix[first][last]>target)
            {
                last--;
            }
            else if (matrix[first][last]<target)
            {
                first++;
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[][] matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[] result=search(matrix,9);
        for (int n:result){
            System.out.print(n+" ");
        }
    }
}
