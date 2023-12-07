package com.javalec.package_PDG;

import com.javalec.package_PJH.AddSubMulDiv;
import com.javalec.package_PJM.Addition;

public class AddSubMulDivRemainder extends AddSubMulDiv{
	
	/*
	 * Description : Remainder calculation
	 * Author: PDG
	 * Date : 2023.12.04
	 * 
	 */
	// Field
	// Constructor
	public AddSubMulDivRemainder() {
	}

	// Method
	//field 용 method
	public int remainderAction() {
		return num1 % num2% num3;
	}
	// method 용 method
	public int remainderAction(int num1, int num2, int num3 ) {
		return num1 % num2 % num3;
	}
}
