package com.daru.s1.lang.string.ex1;

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
	
	public MemberDTO [] init() {//init무언가를초기화
		String [] datas = this.data.split("-");
		
		MemberDTO [] members = new MemberDTO[datas.length/4];
		
		int index = 0;
		
		for(int i=0;i<members.length;i++) {
		//this.data
		MemberDTO memberDTO = new MemberDTO();//회원한명을 만드는 코드
		memberDTO.setId(datas[index]); //datas[0]4 8
		memberDTO.setPw(datas[++index]); //datas[1] 5 9
		memberDTO.setName(datas[++index]); //datas[2]6 10 
		memberDTO.setEmail(datas[++index]); //datas[3]7 11
		members[i] = memberDTO; //반복문이끝나면 값 저장
		index++;
		}
		
		return members;
		
	}
}
