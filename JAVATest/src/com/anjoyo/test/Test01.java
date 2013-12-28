package com.anjoyo.test;

public class Test01 {

	//定义各个需要的变量
	int[] Numbers=new int[10];
	int min=0;
	int	max=0;
	//定义需要用到的方法模块
	//生成随机数方法
	void randomNumber()
	{
		for(int i=0;i<10;i++)
		{
			Numbers[i]=(int)(Math.random()*100+1);
		}
	}
	//排序判断
	void Sort()
	{
		//判断
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
		//冒泡排序
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
	//输出
	void Export()
	{
		System.out.println("随机生成的数列为：");
		for(int i=0;i<10;i++)
		{
			System.out.print(Numbers[i]+"\t");
		}
		System.out.println();
		System.out.println("此次数列最大值是："+max);
		System.out.println("此次数列最小值是："+min);
	}

	public static void main(String[] args) 
	{
		Test01 test1=new Test01();
		test1.randomNumber();
		test1.Sort();
		test1.Export();

	}

}
