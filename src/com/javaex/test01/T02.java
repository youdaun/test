package com.javaex.test01;

public class T02 {

	public static void main(String[] args) {
		
		String str = "There is no best choice, but only a choice not to regret. THE LIFE is only once.";
		
		String word[] = str.split(" ");
		
		for(int i=0; i<word.length; i++) {
			//첫번째 글자 자르기
			String firstLetter = word[i].substring(0,1);
			
			//나머지 글자 자르기
			String outerLetter = word[i].substring(1);
			
			//첫번째 글자 대문자변환
			firstLetter = firstLetter.toUpperCase();
			
			//첫글자 + 나머지글자 붙이기
			String newStr = firstLetter + outerLetter + " ";
	
			System.out.print(newStr);
		}

	}

}
