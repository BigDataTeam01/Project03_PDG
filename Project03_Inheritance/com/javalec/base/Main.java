package com.javalec.base;

import java.util.Scanner;

import com.javalec.package_PDG.AddSubMulDivRemainder;
import com.javalec.package_PJH.AddSubMul;
import com.javalec.package_PJM.AddSub;
import com.javalec.package_PJM.Addition;

public class Main {
	public static void main(String[] args) {
		
		
		/*
		 * Description: Field, Constructor, Method 를 사용하여 Data 를 전달 
		 * Author : DongGeun Park
		 * Date : 2023.12.07
		 */
		
		
		// ========= Property =========
		Scanner scanner = new Scanner(System.in);
		int [] numArray = new int[4];
		AddSubMulDivRemainder calc = new AddSubMulDivRemainder();
		
		// Input
			System.out.print("1번의 숫자를 입력하세요 : ");
			calc.num1 = scanner.nextInt();
			System.out.print("2번의 숫자를 입력하세요 : ");
			calc.num2 = scanner.nextInt();
			System.out.print("3번의 숫자를 입력하세요 : ");
			calc.num3 = scanner.nextInt();
			System.out.print("4번의 숫자를 입력하세요 : ");
			calc.num4 = scanner.nextInt();
		
		
		//========= Output =========
		
		//[Field 로 데이터전달]
		// Addition 에 있는 field 의 변수를 이용하여 각각의 클래스에서 method() 를 사용해 결과값을 리턴
		// 리턴 받은 값들을 출력함. 	
		
		
		
		System.out.println("\n >>> Field를 사용 ");
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
				calc.mulAcion_3(),
				calc.divAction()
				));
		// [Constructor 로 데이터 전달]
		// Constructor의 파라미터에 숫자를 입력하여 생성되는 순간 output  print 가 되도록 함.  
		System.out.println("\n >>> Constructor 를 사용 ");
		System.out.println("3번과 4번의 덧셈, 뺄셈, 곱셈의 결과는 ");
		Addition  add  	= new Addition( calc.num3,calc.num4);
		AddSub    sub 	= new AddSub(   calc.num3,calc.num4);
		AddSubMul mul 	= new AddSubMul(calc.num3,calc.num4);
		
		System.out.println("1,2,3번의 뺄셈과 곱셈의 결과는 ");
		AddSub    sub3  = new AddSub(calc.num1,calc.num2,calc.num3);
		AddSubMul mul3  = new AddSubMul(calc.num1,calc.num2,calc.num3);
		
		
		// [Method 로 데이터 전달]
		// Method 를 호출하고 Method 에 파라미터를 입력하여 입력한 파라미터를 계산해서 리턴함. 
		// 리턴한 값들을 출력함.  
		System.out.println("\n>>> Method를 사용");
		System.out.println(String.format(
				  "1. 1,2,4번의 덧셈 뺄셈 곱셈 나눗셈, 나머지의  결과는 \n "
				+ " 덧셈 :   %2d, "
				+ " 뺄셈 :   %2d,"
				+ " 곱셈 :   %2d,"
				+ " 나눗셈 :  %.2f "
				+ " 나머지 :  %2d ",
				calc.addAction(		  calc.num1,calc.num3,calc.num4),
				calc.subAction(		  calc.num1,calc.num3,calc.num4),
				calc.mulAcion(		  calc.num1,calc.num3,calc.num4),
				calc.divAction(		  calc.num1,calc.num3,calc.num4),
				calc.remainderAction( calc.num1,calc.num3,calc.num4)
				));
		System.out.println(String.format(
				  "2. 2번과 4번 의 뺄셈, 나셈의 결과는"
				+ " 뺄셈 : %d, "
				+ " 나눗셈 : %2f, ",
				calc.subAction(calc.num2,calc.num4),
				calc.divAction(calc.num2,calc.num4)));
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
	}

}
