package com.my.streamDemo;

public class PassByTeat {

//	static Double d1;
//	static int i = d1.intValue();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int data = 100;
//		System.out.println( data + " " );
//		processData(data);
		System.out.print( "hello");
		String userDirectory = System.getProperty("user.dir");
		System.out.println(userDirectory);
		
		}
	

		private static void processData(int data) {
		data=data * 2;
		System.out.println("inner : " + data);
		}

	}


