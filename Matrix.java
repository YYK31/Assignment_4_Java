package javaassignment3;

import java.util.Scanner;

public class Matrix {
       public int[][] getMatrix() {
    	   Scanner sc=new Scanner(System.in);
    	   int col,row;
    	   System.out.println("enter the number of rows:");
    	   row=sc.nextInt();
    	   System.out.println("enter the number of colum");
    	   col=sc.nextInt();
    	   int mat[][]=new int[row][col];
    	   System.out.println("enter matrix:");
    	   for (int i = 0; i < row; i++) {
    		   for (int j = 0; j < col; j++) {
    			   mat[i][j]=sc.nextInt();
    		   }
		   }
    	   return mat;
    	  }
       
       public int[][] addMatrix( int m1[][],int m2[][]) {
    	   int row=m1.length;
    	   int col=m1[0].length;
    	   int matadd[][]=new int[row][col];
    	   for (int i = 0; i < row; i++) {
    		   for (int j = 0; j < col; j++) {
    			   matadd[i][j]=m1[i][j]+m2[i][j];
    		   }
		   }
    	   
    	   return matadd; 
       }
       
       
       
}
