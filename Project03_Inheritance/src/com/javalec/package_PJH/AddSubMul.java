package com.javalec.package_PJH;

import com.javalec.package_PJM.AddSub;

public class AddSubMul extends AddSub {
	//Field
	//선언부터
	
	
	
	//construction
	
	public  AddSubMul() {
		
	}
	public AddSubMul(int num1, int num2, int num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		System.out.println("곱셈 : "+ mulAcion());
	}
	public AddSubMul(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		System.out.println("곱셈 : "+ mulAcion());
	}
	
	//Method
	public int mulAcion(int num1,int num2, int num4) {  	//method 용 Method(1,2,4)
	
	return num1*num2*num4; 
//	
	}
	public int mulAcion() {								//Field용 Method(1,3,4)
		return num1*num3*num4;
	}
	
	
	
}
