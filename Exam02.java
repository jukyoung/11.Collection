package com.collection.exam;

import java.util.ArrayList;

public class Exam02 {
	public static void main(String[] args) {
		
		String[] arr = new String[3];
		arr[0] = "apple";
//		arr[1] = 10; �ڷ����� �������� �ʾ� X
		
		ArrayList list = new ArrayList<>();
		list.add("apple");
		list.add(10); // ���� �߻� X
		
		// �迭 -> ���� �ڷ����� �����͸� ������� ����
		// -> ArrayList -> �ᱹ �迭
		list.add(36.5);
		list.add(true);
		list.add('A');
		
		System.out.println( list.toString() );
		
		// String, boolean, �Ǽ�, ����.....
		/*
		 *  Object -> �ڹ��� ��� Ŭ����/ ��� �͵��� Object�� ��� ���� -> �ְ� ����
		 *  ������ : �پ��� Ŭ����(�ڽ�)���� ������ ���� �� �ִ� ��
		 *  
		 *  �츮�� ���� ArrayList �� ���� Object �� �迭
		 * */
		
		String a = "mango";
		char temp1 = a.charAt(0);
		System.out.println("temp1 : " + temp1);
		//�ڽ������� �ٿ�ĳ������ �ؾ� ������ �ڽ��� ���� ����� ����� �� ����
		char temp2 = ((String)list.get(0)).charAt(0);
		System.out.println("temp2 : " + temp2);
		
		int temp3 = ((int)list.get(1));
		double temp4 = ((double)list.get(2));
		boolean temp5 = ((boolean)list.get(3));
	}

}
