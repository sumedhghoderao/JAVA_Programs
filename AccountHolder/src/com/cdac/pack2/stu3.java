package com.cdac.pack2;



public class stu3
{

	private String coursename;
	private int batchstrength;
	
	
	
	public stu3() {
		
	}



	public stu3(String coursename, int batchstrength) {
		
		this.coursename = coursename;
		this.batchstrength = batchstrength;
	}

	public void display()
	{
		System.out.println(coursename+" "+batchstrength);
	}

}
	