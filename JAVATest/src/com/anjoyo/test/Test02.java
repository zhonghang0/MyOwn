package com.anjoyo.test;

import java.util.Scanner;

public class Test02 {
	int computer;
	int people;
	String str;
	//��ͷ���Ű�
	void Type()
	{
		for(int i=0;i<40;i++)
		{
			System.out.print("*");
			
		}
		System.out.println();
		System.out.println("*                                      *");
		System.out.println("*                 ��ȭ��Ϸ                                                        *");
		System.out.println("*      ʯͷʹ������1������ʹ������2����������3      *");
		System.out.println("*                                      *");
		for(int i=0;i<40;i++)
		{
			System.out.print("*");
			
		}
		System.out.println();
	}
	//���Բ�ȭģ��
	void computerStart()
	{
		computer=(int)(Math.random()*3+1);
	}
	//������ж�
	void Export() 
	{
		switch (people) {
		case 1:
			System.out.print("������ǣ�ʯͷ   ");
			break;
		case 2:
			System.out.print("������ǣ�����   ");
			break;
		case 3:
			System.out.print("������ǣ���   ");
			break;
		default:
			System.out.print("�����������������  ");
			break;
		}
		switch (computer) {
		case 1:
			System.out.print("���Գ����ǣ�ʯͷ   ");
			break;
		case 2:
			System.out.print("���Գ����ǣ�����   ");
			break;
		case 3:
			System.out.print("���Գ����ǣ���   ");
			break;
		default:
			System.out.print("���ݳ���  ");
			break;
		}
		System.out.println();
		if(people-computer==0)
		{
			System.out.println("��͵�������Ĭ�� ");
			System.out.println("�Ƿ���� ����/��(Y/N)");
		}
		else if(people-computer==1)
		{
			System.out.println("������");
			System.out.println("�Ƿ���� ����/��(Y/N)");
		}
		else 
		{
			System.out.println("��Ӯ��");
			System.out.println("�Ƿ���� ����/��(Y/N)");
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
		 System.out.println("������Ϸ������");
		}
	}
}
