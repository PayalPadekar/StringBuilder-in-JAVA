package com.String;

public class SBuilder {
	public static void main(String[] args) {
		
		String s = "Good";
		System.out.println("Orignal : " + s);
		
		String s3 = s.concat("Morning");
		s.toUpperCase();
		System.out.println("Updated : " + s);
		
		System.out.println("-------------------------------");
		  //Important - StringBuilder- 
		StringBuilder sb = new StringBuilder("Good");
		System.out.println("Orignal : " + sb);
		sb.append("Morning");
		System.out.println("Updated :" + sb);
		
	}
}
