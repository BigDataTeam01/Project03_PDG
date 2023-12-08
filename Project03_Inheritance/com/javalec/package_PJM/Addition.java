package com.javalec.package_PJM;

import java.util.Scanner;


/*
 * Description : Addition
 * Author: PJM
 * Date : 2023.12.07(Thursday)
 * 
 */


public class Addition {
	// Field
	public int num1 ;
	public int num2 ;
	public int num3 ;
	public int num4 ;
	
	
	// Construction
	public Addition() {
	} 
	public Addition(int num3, int num4) {
		this.num3 = num3;
		this.num4 = num4;
		System.out.print("덧셈 : " + addAction_const()+" ");
	}
	// Method
	//Field 를 사용한 Method
	public int addAction2() {
		return (num1 + num2);
	}
	
	public int addAction_const() {
		return (num3 + num4);
	}
	public int addAction3() {
		return (num1 + num3 + num4);
	}
	// Method 를 사용한 Method
	public int addAction(int num1 , int num2 , int num4) {
		return num1 + num2 + num4;
	}
}
