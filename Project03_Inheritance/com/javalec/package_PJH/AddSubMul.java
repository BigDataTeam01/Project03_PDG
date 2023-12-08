package com.javalec.package_PJH;

import com.javalec.package_PJM.AddSub;

public class AddSubMul extends AddSub {
	/*
	 * Description : Multiply calculation
	 * Author: PJH
	 * Date : 2023.12.04
	 * 
	 */
	
	//Field
	
	
	
	
	//construction
	
	public  AddSubMul() {
		
	}
	// 
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
	//method에 파라미터를 입력해서 Main에 전달하는 Method
	public int mulAcion(int num1,int num2, int num4) {  	
	
	return num1*num2*num4; 
//	
	}
	//Field용 Method(1,3,4)
	public int mulAcion() {								
		return num1*num3*num4;
	}
	
	
	
}
