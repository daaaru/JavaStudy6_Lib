package com.daru.s1.lang.stringBuffer;

public class StringBufferMain {

	public static void main(String[] args) {
		
		//daru go 합침
		StringBuffer sb = new StringBuffer();
		//여러가지 문자열을 하나로합치기위해 사용
		sb.append("daru");
		sb.append("Go");
		System.out.println(sb);//tostring으로 오버라이드
		
		String name = "daru";
		String name2 = "Go";
		name = name + name2;
		System.out.println(name);
		
		
		
	}

}
