package com.qzl.web.test;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("第1个月的兔子对数：1");
		System.out.println("第2个月的兔子对数：2");
		int f1=1,f2=2,f,M=24;
		for(int i=3;i<M;i++) {
			f=f2;
			f2=f1+f2;
			f1=f;
			System.out.println("第"+i+"个月的兔子对数："+f2);
		}
	}

}
