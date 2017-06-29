package com.hanbit.oop.service;

public class CalcService {
	public String calcBMI(double height,double weight){
		
		
		double bmi=weight/(height*height);
		String state="";
		if(18.5>=bmi){
			state="저체중";
		}else if(18.5<bmi&&bmi<=25.0){
			state="정상";
		}else if(25.0<bmi&&bmi<=30.0){
			state="과체중";
		}else{
			state="비만";
		}
		return state;
	}
	public String calcPlus(String a,String b){
		String result="";
		int num1=Integer.parseInt(a);
		int num2=Integer.parseInt(b);
		result=string.valueOf(num1+num2);
		return result;
	}
	public int calcMinus(int a,int b){
		int minus=a-b;
		return minus;
	}
	public int clacMulti(int a,int b){
		int multi=a*b;
		return multi;
	}
	public int clacDivid(int a,int b){
		int divid=a/b;
		return divid;
	}
	
}
