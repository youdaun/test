package com.javaex.test01;

public class T01 {
	
	public static void main(String[] args) {
		
		int [][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {20, 20, 20, 20, 20}, {30, 30, 30, 30, 30}};
		int total = 0;
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				total = total + arr[i][j];
				count++;
			}
		}
		
		double average = (double)total/count;
		
		System.out.print("total = " + total + ", "); //총합
		System.out.print("average = " + average + ", "); //평균
		System.out.print("count = " + count); //카운트
	}

}
