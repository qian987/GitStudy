package main;

import java.util.ArrayList;

public class MainTask {//�ɼ�ͳ��

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arr=new ArrayList();
		arr.add(50);
		arr.add(60);
		arr.add(20);
		arr.add(90);
		arr.add(30);
       //1���Գɼ�����
	   //2����ƽ���֣������Сֵ��ֵ
	   //3��ͳ�����䣺0~20��xx����21~40��X��
	   //4��
		SortClass sc=new SortClass();
		sc.sort(arr);
		ComValue cv=new ComValue();
		cv.averageV(arr);
	}
	public static void Sort(ArrayList arr) {
		
	}


}
