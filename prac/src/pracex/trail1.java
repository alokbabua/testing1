package pracex;

import java.util.Scanner;

public class trail1 {
//	public static void reverse() {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the name which should be reversed");
//		String a=sc.nextLine();
////		String a="alok";
//		int s=a.length();
//		char b[]=a.toCharArray();
//		for(int i=s-1;i>=0;i--) {
//		System.out.print(b[i]);
//	}
//	}
//	public static void reverse() {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the name which should be reversed");
//		String a=sc.nextLine();
////		String a="alok";
//		int s=a.length();
//		String w="";
//		for(int i=s-1;i>=0;i--) {
//		 w=w+ a.charAt(i);
//		
//		
//	}
//		System.out.print(w);
////	}
//	public static void reverse() {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the name which should be reversed");
//		String a=sc.nextLine();
////		String a="alok";
//		int s=a.length();
//		StringBuffer sb=new StringBuffer(a);
//		StringBuffer z=sb.reverse();
//		System.out.println(z);
//		
//	}
	
//	public static void palindrome() {
//		Scanner sc =new Scanner(System.in);
//		System.out.println("enter integer number:");
//		String a=sc.nextLine();
//	    String z="";
//		System.out.println(a);
//		char b[]=a.toCharArray();
//		for(int i=a.length()-1;i>=0;i--) {
//		z=z+b[i];
//		
//		}
//		System.out.print(z);
		
//		if(z.equals(a)) {
//			System.out.println("entered number is a palindrome");
//		}
//		else {
//			System.out.println("entered number is not a palindrome" );
//		}
//	}
	public static void numberofdigits() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number which should be counted");
	int a=sc.nextInt();
	int	count=0;
	while(a!=0) {
	
		 a=a/10;
		 count++;
	}
	System.out.println(count + "  is the no of digits");
	}
	public static void main(String[] args) {
		numberofdigits();
	}

}
