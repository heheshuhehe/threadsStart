package firstMain;

import java.lang.*;


class MainDemo
{
	public static void main(String[] args)  
	{
		SecondClass secondClass = new SecondClass();
		secondClass.m();
		ThirdClass thirdClass =new ThirdClass(secondClass);
		thirdClass.runMinSecondClass();
//		System.out.println(args); //[ljava.lang.string;@139a55  ��[���������飬 ��l������long , "@139a55"�����ϣֵ
//		System.out.println(args.length);  //Ĭ�ϳ���Ϊ0
//		for(int i = 0; i < args.length; i++)
//			System.out.println(args[i]); 
	}
}