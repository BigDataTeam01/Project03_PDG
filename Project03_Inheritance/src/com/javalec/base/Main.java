package com.javalec.base;

import java.util.Scanner;

import com.javalec.package_PDG.AddSubMulDivRemainder;
import com.javalec.package_PJH.AddSubMul;
import com.javalec.package_PJM.AddSub;
import com.javalec.package_PJM.Addition;

public class Main {
	public static void main(String[] args) {
		
		
		// Property
		Scanner scanner = new Scanner(System.in);
		int [] numArray = new int[4];
		AddSubMulDivRemainder calc = new AddSubMulDivRemainder();
		
		
		// Input
		for(int i = 0 ; i <=3; i++) {
			System.out.print(String.format("%d번의 숫자를 입력하세요 : ",i+1));
			numArray[i] = scanner.nextInt();
		}
		// Output
		// Addition 에 있는 field 의 변수를 이용하여 각각의 클래스에서 method() 를 사용해 결과값을 리턴
		// 리턴 받은 값들을 출력함. 

		System.out.println(" >>> Field를 사용 ");
		System.out.println(String.format(
				 "1. 1번과 2번 의 숫자의 합은 %d 입니다.  ",
				 calc.addAction2()));
		System.out.println(String.format(
				  "2. 1번과 3번, 4번의 덧셈 뺄셈 곱셈 눗셈의 결과는 \n "
				+ " 덧셈 :  %d ,"
				+ " 뺄셈 :  %d ,"
				+ " 곱셈 :  %d ,"
				+ " 나눗셈 : %.2f ",
				calc.addAction3(),
				calc.subAction2(),
				calc.mulAcion(),
				calc.divAction()
				
				));
		
		// Constructor의 파라미터에 숫자를 입력하여 생성되는 순간 output  print 가 되도록 함.  
		System.out.println(" >>> Constructor 를 사용 ");
		System.out.println("3번과 4번의 덧셈, 뺄셈, 곱셈의 결과는 ");
		
		
		Addition  add  	= new Addition( numArray[2],numArray[3]);
		AddSub    sub 	= new AddSub(   numArray[2],numArray[3]);
		AddSubMul mul 	= new AddSubMul(numArray[2],numArray[3]);
		
		System.out.println("1,2,3번의 뺄셈과 곱셈의 결과는 ");
		AddSub    sub3  = new AddSub(numArray[0],numArray[1],numArray[2]);
		AddSubMul mul3  = new AddSubMul(numArray[0],numArray[1],numArray[2]);
		
		// Method 를 호출하고 Method 에 파라미터를 입력하여 입력한 파라미터를 계산해서 리턴함. 
		// 리턴한 값들을 출력함.  
		System.out.println(">>> Method를 사용");
		System.out.println(String.format(
				  "1. 1,2,4번의 덧셈 뺄셈 곱셈 나눗셈, 나머지의  결과는 \n "
				+ " 덧셈 :   %2d, "
				+ " 뺄셈 :   %2d,"
				+ " 곱셈 :   %2d,"
				+ " 나눗셈 :  %.2f "
				+ " 나머지 :  %2d ",
				calc.addAction(		  numArray[0],numArray[2],numArray[3]),
				calc.subAction(		  numArray[0],numArray[2],numArray[3]),
				calc.mulAcion(		  numArray[0],numArray[2],numArray[3]),
				calc.divAction(		  numArray[0],numArray[2],numArray[3]),
				calc.remainderAction( numArray[0],numArray[2],numArray[3])
				
				));
		System.out.println(String.format(
				  "2. 2번과 4번 의 뺄셈, 나셈의 결과는"
				+ " 뺄셈 : %d, "
				+ " 나눗셈 : %2f, ",
				//calc.subAction(numArray[1],numArray[3]),
				calc.divAction(numArray[1],numArray[3])));
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
	}

}
