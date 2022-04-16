package com.javaex.test01;

public class T04 {
	
	public static void main(String[] args) {
		String str = "geeksforgeeeks";
		int cnt = 0;
		
		for(int i = 0; i < str.length(); i++) {
			
			if(str.indexOf(str.charAt(i)) == i) {
				
				cnt = cntLetter(str, str.charAt(i));
				
				//1번이상 중복되는 문자만 출력
				if(cnt > 1) {
					System.out.println(str.charAt(i) +" = "+ cnt);
				}
			}
		}
	}
	
	//중복된 갯수 리턴해주는 함수
	public static int cntLetter(String str, char letter) {
		
		int cnt = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == letter) {
				cnt++;
			}
		}
		return cnt;
	}
	
}
