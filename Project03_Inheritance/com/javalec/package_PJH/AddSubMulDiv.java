package com.javalec.package_PJH;


public class AddSubMulDiv extends AddSubMul{
	/*
	 * Description : division calculation
	 * Author: PJH
	 * Date : 2023.12.04
	 * 
	 */
			//Field.
	
			//construction
			public AddSubMulDiv() {
			
			}
		
			//Method
			public double divAction(int num1,int num2,int num4) {			//method 용 Method(1,2,4)

				return ((double)num1/num2/num4); 
				
				}
			public double divAction() {									//Field용 Method(1,3,4)
				return ((double)num1/num3/num4);
			}
			
			public double divAction(int num2,int num4) {			//method 용 Method(1,2,4)
				
				return ((double)num2/num4); 
				
			}
}
