package com.daru.s2.util.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class SetStudy {
	
	public void study4() {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		
		Iterator<Integer> it= hs.iterator();
		
		while(it.hasNext()) {
			int num = it.next();
			System.out.println(num);
		}
	}
	
	Random random = new Random();
	
	
	public void study3() {
		//set이용해서 
		HashSet<Integer> hs = new HashSet<>();
//		for(int i=0;i<6;i++) {
//			int num = random.nextInt(45)+1;
//			hs.add(num);
		while(hs.size() != 6) {
			int num = random.nextInt(45)+1;
			hs.add(num);
		}
			
		
		System.out.println(hs);
	}
	
	public void study2() {
		//Random
		
		//Lotto번호를 랜덤 1~45 6개 모두뽑고 list에담아서
		ArrayList<Integer> ar = new ArrayList<>();
		for(int i=0;i<6;i++) {
			int num = random.nextInt(45)+1;//0부터 10미만의 랜덤수
			ar.add(num); //여기
		}
		

		//번호출력
		System.out.println(ar);
		
	}

	public void study1() {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(1);
		hs.remove(2);//인덱스번호가 아니고 숫자 2
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(100);
		ar.add(200);
		ar.add(100);
		
		System.out.println(ar);
		System.out.println(hs);
		System.out.println(hs.size());
		
		
	}
}
