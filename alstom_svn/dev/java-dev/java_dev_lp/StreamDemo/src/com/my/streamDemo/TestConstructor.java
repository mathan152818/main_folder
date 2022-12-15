package com.my.streamDemo;

public class TestConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Processor p = new Processor();
		

		
	}
}

class MainProcessor{
	
	int name;
	int p_id;
	public MainProcessor() {
		System.out.println("main processor");
	}
	public MainProcessor(int name, int p_id) {
		super();
		this.name = name;
		this.p_id = p_id;
	}
	
}
	class Processor extends MainProcessor{
		int id;
		int name;
		
		public Processor() {
			// TODO Auto-generated constructor stub
			System.out.println("DEFAULT");
		}

		public Processor(int id, int name) {
			super();
			this.id = id;
			this.name = name;
		}
		
		
	}
