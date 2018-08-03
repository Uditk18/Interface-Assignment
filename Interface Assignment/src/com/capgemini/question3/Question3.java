package com.capgemini.question3;

//Program defining interface Vehicle with start() function
//TwoWheeler, ThreeWheeler, FourWheeler implements this interface
class Question3{
	public static void main(String[] args) {
		TwoWheeler two=new TwoWheeler();
		ThreeWheeler three=new ThreeWheeler();
		FourWheeler four=new FourWheeler();
		Vehicle [] vehicle= {two,three,four};
		for(int i=0;i<3;i++)
		{
			if (vehicle[i]==three)
			{
				vehicle[i].start();
			}
				
		}
		
	}
}