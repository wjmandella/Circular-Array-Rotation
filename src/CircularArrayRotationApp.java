// My solution to the HackerRank.com problem "Circular Array Rotation."
// https://www.hackerrank.com/challenges/circular-array-rotation/problem

import java.util.Scanner;

public class CircularArrayRotationApp {

	static int[] circularArrayRotation(int[] a, int[] m, int k) {
		  int[] result = new int[m.length];
		  int[] tempArray = new int[a.length];
		  
		  for(int i = 0; i < a.length; i++) {
			  tempArray[(i + k)%(a.length)] = a[i];
		  }		  
	    	for(int idx2 = 0; idx2 < m.length; idx2++) {
	    		result[idx2] = tempArray[m[idx2]];
	    	}
		  return result;
	}
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of array elements, n (integer 1-100000): ");
        int n = in.nextInt();
        System.out.print("Enter number of array rotations, k (integer 1-100000): ");
        int k = in.nextInt();
        System.out.print("Enter number of queries, q (integer 1-100000): ");
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            System.out.print("Enter a number element of the 'original' array (integer 1-100000): ");
            a[a_i] = in.nextInt();
        }
        
        int[] m = new int[q];
        for(int m_i = 0; m_i < q; m_i++){
            System.out.print("Enter an element of the query array (integer 0 to (n-1)): ");
            m[m_i] = in.nextInt();
        }
        int[] result = circularArrayRotation(a, m, k);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}
