package com.javalec.base;

import java.util.Scanner;

import com.javalec.package_PDG.AddSubMulDivRemainder;
import com.javalec.package_PJM.Addition;

public class Main {
	
	
	public static void main(String[] args) {
		
		
		//AddSubMulDivRemainder calc = new AddSubMulDivRemainder();
		Scanner scanner = new Scanner(System.in);
		
		int [] numArray = new int[4];
		
		

		AddSubMulDivRemainder calc = new AddSubMulDivRemainder();
		
		
		
		
		for(int i = 0 ; i <=3; i++) {
			System.out.print(String.format("%d번의 숫자를 입력하세요 : ",i+1));
			numArray[i] = scanner.nextInt();
			
		}
		

		

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
		
		
		System.out.println(" >>> Constructor 를 사용 ");
		
		System.out.println("3번과 4번의 덧셈, 뺄셈, 곱셈의 결과는 ");
		Addition add  = new Addition(numArray[2],numArray[3]);
		
		
		System.out.println(String.format(
				"2. 1번과 3번, 4번의 덧셈 뺄셈 곱셈 눗셈의 결과는 \n "
						+ " 덧셈 :  %d ,"
						+ " 뺄셈 :  %d ,"
						+ " 곱셈 :  %d ,"
						+ " 나눗셈 : %.2f ",
						calc.addAction3(),
						calc.subAction2(),
						calc.mulAction3(),
						calc.divAction3()
						
				));
		
		
		
		
		
		
		
		
		System.out.println(">>> Method를 사용");
		
		System.out.println(String.format(
				  "1. 3번과 4번 의 덧셈, 뺄셈, 곱셈의 결과는"
				+ " 덧셈 : %d, "
				+ " 뺄셈 : %d, "
				+ " 곱셈 : %d, ",
						(calc.addAction(numArray[2],numArray[3]))));
		System.out.println(String.format(
				 "2. 1,2,4번의 덧셈 뺄셈 곱셈 나눗셈, 나머지의  결과는 \n "
						+ " 덧셈 :  %2d, "
						+ " 뺄셈 :  %2d,"
						+ " 곱셈 :  %2d,"
						+ " 나눗셈 : %.2f "
						+ " 나머지 : %2d ",
						calc.addAction(numArray[0],numArray[2],numArray[3]),
						calc.subAction(numArray[0],numArray[2],numArray[3]),
						calc.mulAction(numArray[0],numArray[2],numArray[3]),
						calc.divAction(numArray[0],numArray[2],numArray[3])
						calc.remainderAction(numArray[0],numArray[2],numArray[3])
				));
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
	}

}
