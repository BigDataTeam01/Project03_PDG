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
		System.out.println("곱셈 : "+ mulAcion_3());
	}
	public AddSubMul(int num3, int num4) {
		this.num3 = num3;
		this.num4 = num4;
		System.out.println("곱셈 : "+ mulAcion_2());
	}
	
	//Method
	//method에 파라미터를 입력해서 Main에 전달하는 Method
	public int mulAcion(int num1,int num2, int num4) {  	
	
	return num1*num2*num4; 
//	
	}
	//Field용 Method
	public int mulAcion_3() {								
		return num1*num2*num3;
	}
	public int mulAcion_2() {								
		return num3*num4;
	}
	
	
	
}
