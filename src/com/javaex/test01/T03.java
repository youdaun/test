package com.javaex.test01;

public class T03 {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9 ,10};
		int d = 4;
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(d+i<arr.length) {
				System.out.print(arr[d+i] + " ");
			} else {
				System.out.print(arr[count] + " ");
				count++;
			}
		}

	}

}
