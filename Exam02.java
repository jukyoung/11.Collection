package com.collection.exam;

import java.util.ArrayList;

public class Exam02 {
	public static void main(String[] args) {
		
		String[] arr = new String[3];
		arr[0] = "apple";
//		arr[1] = 10; 자료형이 일지하지 않아 X
		
		ArrayList list = new ArrayList<>();
		list.add("apple");
		list.add(10); // 에러 발생 X
		
		// 배열 -> 같은 자료형의 데이터를 묶어놓은 집합
		// -> ArrayList -> 결국 배열
		list.add(36.5);
		list.add(true);
		list.add('A');
		
		System.out.println( list.toString() );
		
		// String, boolean, 실수, 정수.....
		/*
		 *  Object -> 자바의 모든 클래스/ 모든 것들은 Object를 상속 받음 -> 최고 조상
		 *  다형성 : 다양한 클래스(자식)들의 성질을 가질 수 있는 것
		 *  
		 *  우리가 만든 ArrayList 는 현재 Object 형 배열
		 * */
		
		String a = "mango";
		char temp1 = a.charAt(0);
		System.out.println("temp1 : " + temp1);
		//자식형으로 다운캐스팅을 해야 온전히 자식이 가진 기능을 사용할 수 있음
		char temp2 = ((String)list.get(0)).charAt(0);
		System.out.println("temp2 : " + temp2);
		
		int temp3 = ((int)list.get(1));
		double temp4 = ((double)list.get(2));
		boolean temp5 = ((boolean)list.get(3));
	}

}
