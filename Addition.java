package com.javalec.package_PJM;

import java.util.Scanner;


/*
 * Description : Addition
 * Author: PJM
 * Date : 2023.12.07(Thur)
 * 
 */


public class Addition {
	// Field
	public int num1 = 0;
	public int num2 = 0;
	public int num3 = 0;
	public int num4 = 0;
	
	
	// Construction
	public Addition() {
	} 
	public Addition(int num3, int num4) {
		this.num3 = num3;
		this.num4 = num4;
		System.out.println("덧셈 : " + addAction2());
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
