package com.daru.s2.util.collection;

import java.util.ArrayList;

public class ListStudy {
	
	
	private final int NUM = 1;
	
	public ArrayList<String> study5() {
		ArrayList<String> list = new ArrayList<>();
		list.add("1");
		return list;
	}
	
	//private final int NUM = 1; 상수
	
	public void study3() {
		
		//ArrayList<E> 변수명 = new ArrayList<E>();
		//E = Integer
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		//add(E e)
		ArrayList<String> ar3 = new ArrayList<String>();
		ar3.add("");
		//뒤에는 똑같은 E라서 생략가능
		//123 상수
		
		//generic 배열처럼 같은타입을 모음(reference타입만 가능함)
		//arraylist object타입만을 모으겠다는 의미
		//꺼낼때 Object타입인것이 보장됨
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add(1);
		ar.add('b');
		ar.add(3.12);
		ar.add("daru");
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		//꺼낼때 분류해서 꺼내야함
		int num = (int)ar.get(0);
		String name = (String)ar.get(3);
		
		
	}
	
	
	public void study2() {
		ArrayList ar = new ArrayList();
		int num =1;
		Integer n = num; //autoBoxing 다형성
		ar.add(n);
		ar.add(1); //autoBoxing 다형성
		
		ar.add('a'); //autoBoxing 다형성
		
		ar.add(3.12); //autoBoxing 다형성
		
		ar.add("name"); //다형성
		
		String k = "daru"; //String is a Object
		Object obj = k; //다형성
	}
	
	
	

	public void study1() {
		int [] numbers = new int [3];
		ArrayList ar = new ArrayList();//기본 10칸
		
		//대입
		numbers[0]=1;
		numbers[1]=2;
		
		ar.add(1);//0번
		ar.add(2);//1번
		ar.add(3);//2번
		ar.add(1, 100);
		ar.set(0, 2000);
		ar.remove(0);
		ar.clear();
		
		System.out.println(numbers[0]);
		//System.out.println(ar.get(0));
		
		for(int i=0;i<numbers.length;i++) {//배열에있는것
			System.out.println(numbers[i]);
		}
		System.out.println("List 출력");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
	}
	
}
