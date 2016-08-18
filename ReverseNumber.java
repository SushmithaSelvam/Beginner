package guviBeginner;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a number");
		int number=scanner.nextInt();
		String str="";
		for(;number!=0;){
			str+=number%10;
			number=number/10;
		}
		System.out.println("the reversed number is"+Integer.parseInt(str));
	}

}
