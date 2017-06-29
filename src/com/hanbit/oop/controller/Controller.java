package com.hanbit.oop.controller;


import java.util.Scanner;

import com.hanbit.oop.service.CalcService;
import com.hanbit.oop.service.test;
import com.hanbit.oop.service.DividService;
import com.sun.org.apache.bcel.internal.generic.SWITCH;
public class Controller {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		CalcService s2=new CalcService();	//외부에서 입력받을 필요가 없음.
		test s3=new test();
		DividService s4=new DividService();
		
		
		while (true) {
			System.out.println("0 end 1.bmi 2.calc 3.Divid\n");
			switch (s.next()) {
			case "0" : 
				System.out.println("end\n");
				return;
			
			case "1" : 
				System.out.println("start\n");
				System.out.println("height : ");
				double height=s.nextDouble();
				
				System.out.println("weight\n");
				double weight=s.nextDouble();
				String state=s2.calcBMI(height,weight);
				System.out.println("당신은"+state+"입니다.");				
				break;	
		
			case "2" : 
				System.out.println("첫번째 값을 입력하세요 : ");
				int a=s.nextInt();
				System.out.println("두번째 값을 입력하세요 : ");
				int b=s.nextInt();
				int c =s3.Calc(a,b);
				System.out.println("출력 : "+c);	
				break;		
			
			case "3" :
				System.out.print("1 : ");
				int a2=s.nextInt();				
				System.out.print("2 : ");
				int b2=s.nextInt();
				int c2=s4.Calc2(a2,b2);
				System.out.println("출력 : "+c2+"\n");
				break;
			case "4" : 
				System.out.println("plus");
				int plus1=s.nextInt();
				int plus2=s.nextInt();
				int result=s2.calcplus(plus1,plus2);
				break;
			
			}
		}
	}
}
	