package com.daru.s3.ex1.student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.daru.s3.ex1.member.MemberDTO;


public class StudentData {
	private Scanner sc;
	
	public StudentData() {
		sc = new Scanner(System.in);
	}
	
	public Map<String, StudentDTO> addStudent(List<MemberDTO> ar){
		//키보드로부터 멤버의 수만큼 성적정보 입력
		//이정보들을 StudentDTO에 넣어줌
		//map의 키는 id
		HashMap<String, StudentDTO> map = new HashMap<>();
		
		for(int i=0;i<ar.size();i++) {
			StudentDTO studentDTO = new StudentDTO();
			studentDTO.setId(ar.get(i).getId());
			studentDTO.setName(ar.get(i).getName());
			//id
			//name
			System.out.println("국어성적입력");
			studentDTO.setKor(sc.nextInt());
			System.out.println("영어성적입력");
			studentDTO.setEng(sc.nextInt());
			System.out.println("수학성적입력");
			studentDTO.setMath(sc.nextInt());
			//총점
			System.out.println("총점");
			studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
			//평균
			System.out.println("평균");
			studentDTO.setAvg(studentDTO.getTotal()/3.0);
			//map에 추가
			map.put(studentDTO.getId(), studentDTO);
		}
		
		
		HashMap<String, StudentDTO> sid = new HashMap<>();
		
		
	
		return map;
	}

}