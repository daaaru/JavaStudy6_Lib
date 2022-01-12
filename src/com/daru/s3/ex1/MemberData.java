package com.daru.s3.ex1;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class MemberData {

	
	private String data;
	//기본생성자 선언
	public MemberData() {
		this.data = "id1-pw1-name1-id1@gmail.com-20-";
		this.data = this.data+"id2-pw2-name2-name2@naver.com-42-";
		this.data = this.data+"id3-pw3-name3-name3@daum.net-13-";
		this.data = this.data+"id4-pw4-name4-name4@hanmail.com-33";

		System.out.println(this.data);
	}
	
	public ArrayList<MemberDTO> init(){
	//data에 있는 문자열을 StringTokenizer로파싱해서 
		//멤버DTO를 생성해서 멤버변수값으로 대입
		//MemberDTO들을 ArrayList에 담아서 리턴 
		System.out.println("MemberEx1 Branch");
		
		
		
		return null;//이거 수정해야함
		
	}
}
