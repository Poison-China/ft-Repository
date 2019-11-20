package test;

import java.util.Scanner;

public class StringTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符串:");
		String textString = sc.next();
		System.out.println("请输入字符串的长度:");
		int textLen=sc.nextInt();
		for (int i = 0; i < textLen; i++) {
			String str1 =textString.substring(i);
			String str2 =textString.substring(i+1);
			if (str1.equals(str2)) {
				
			}
		}
	}

}
