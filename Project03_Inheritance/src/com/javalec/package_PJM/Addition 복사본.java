package com.javalec.package_PJM;

import java.util.Scanner;

public class Addition {
	// Field
	public int num1 = 0;
	public int num2 = 0;
	public int num3 = 0;
	public int num4 = 0;
	
	
	// Construction
	public Addition() {
	} 
	public Addition(int num1, int num2, int num3, int num4) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.num4 = num4;
		System.out.println(addAction2());
	}
	// Method
	//Field 를 사용한 Method
	public int addAction2() {
		return (num1 + num2);
	}
	public int addAction3() {
		return (num1 + num3 + num4);
	}
	// Method 를 사용한 Method
	public int addAction(int num1 , int num2 , int num4) {
		return num1 + num2 + num4;
	}
}
