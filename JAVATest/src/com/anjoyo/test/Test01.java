package com.anjoyo.test;

public class Test01 {

	//���������Ҫ�ı���
	int[] Numbers=new int[10];
	int min=0;
	int	max=0;
	//������Ҫ�õ��ķ���ģ��
	//�������������
	void randomNumber()
	{
		for(int i=0;i<10;i++)
		{
			Numbers[i]=(int)(Math.random()*100+1);
		}
	}
	//�����ж�
	void Sort()
	{
		//�ж�
		max=Numbers[0];
		min=Numbers[0];
		for(int i=1;i<10;i++)
		{
			if(max<Numbers[i])
			{
				max=Numbers[i];
			}
			if(min>Numbers[i])
			{
				min=Numbers[i];
			}
		}
		//ð������
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				int temp;
				if(Numbers[i]<Numbers[j])
				{
					temp=Numbers[i];
					Numbers[i]=Numbers[j];
					Numbers[j]=temp;
				}
			}
		}
		
	}
	//���
	void Export()
	{
		System.out.println("������ɵ�����Ϊ��");
		for(int i=0;i<10;i++)
		{
			System.out.print(Numbers[i]+"\t");
		}
		System.out.println();
		System.out.println("�˴��������ֵ�ǣ�"+max);
		System.out.println("�˴�������Сֵ�ǣ�"+min);
	}

	public static void main(String[] args) 
	{
		Test01 test1=new Test01();
		test1.randomNumber();
		test1.Sort();
		test1.Export();

	}

}
