package com.daru.s3.ex1;

import java.util.ArrayList;

import com.daru.s3.ex1.member.MemberDTO;
import com.daru.s3.ex1.member.MemberData;
import com.daru.s3.ex1.student.StudentData;

public class Ex1Main {

	public static void main(String[] args) {

		MemberData memberData = new MemberData();
		StudentData studentData = new StudentData();
		
		//회원들의 정보 모음
		ArrayList<MemberDTO> ar = memberData.init();
		studentData.addStudent(ar);
		
	}

}
