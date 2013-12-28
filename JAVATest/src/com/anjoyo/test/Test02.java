package com.anjoyo.test;

import java.util.Scanner;

public class Test02 {
	int computer;
	int people;
	String str;
	//开头的排版
	void Type()
	{
		for(int i=0;i<40;i++)
		{
			System.out.print("*");
			
		}
		System.out.println();
		System.out.println("*                                      *");
		System.out.println("*                 猜拳游戏                                                        *");
		System.out.println("*      石头使用数字1，剪刀使用数字2，布用数字3      *");
		System.out.println("*                                      *");
		for(int i=0;i<40;i++)
		{
			System.out.print("*");
			
		}
		System.out.println();
	}
	//电脑猜拳模块
	void computerStart()
	{
		computer=(int)(Math.random()*3+1);
	}
	//输出与判断
	void Export() 
	{
		switch (people) {
		case 1:
			System.out.print("你出的是：石头   ");
			break;
		case 2:
			System.out.print("你出的是：剪刀   ");
			break;
		case 3:
			System.out.print("你出的是：布   ");
			break;
		default:
			System.out.print("你输入的有误请重试  ");
			break;
		}
		switch (computer) {
		case 1:
			System.out.print("电脑出的是：石头   ");
			break;
		case 2:
			System.out.print("电脑出的是：剪刀   ");
			break;
		case 3:
			System.out.print("电脑出的是：布   ");
			break;
		default:
			System.out.print("数据出错  ");
			break;
		}
		System.out.println();
		if(people-computer==0)
		{
			System.out.println("你和电脑真有默契 ");
			System.out.println("是否继续 ：是/否(Y/N)");
		}
		else if(people-computer==1)
		{
			System.out.println("你输了");
			System.out.println("是否继续 ：是/否(Y/N)");
		}
		else 
		{
			System.out.println("你赢了");
			System.out.println("是否继续 ：是/否(Y/N)");
		}
	}
	

	public static void main(String[] args) 
	{
		Test02 test2=new Test02();
		test2.Type();
		do 
		{
			Scanner s=new Scanner(System.in);
			test2.people=s.nextInt();
			test2.computerStart();
			test2.Export();
			test2.str=s.next();
			
		}while(test2.str.equals("Y"));
		if(test2.str.equals("N"))
		{
		 System.out.println("结束游戏！！！");
		}
	}
}
