package com.daru.s1.lang.object;

public class ObjectStudy1 {
	
	//생성자가 없으면 컴파일러가 기본생성자를 만들어줌
	//기본생성자는 매개변수가 없는 생성자

	
	public void study1() {
		System.out.println("Study1 실행");
		
		//Objcet 객체를 생성하고 주소출력
		//먼저객체생성
		Object obj = new Object();
		//주소출력
		System.out.println(obj);
		
		//clone 호출
		//참조변수명.멤버
		int num = obj.hashCode();//뭐가올지모르니까 넣어줌
		System.out.println(num);
		
		String str = obj.toString();
		System.out.println(str);
		
	}
	
}
