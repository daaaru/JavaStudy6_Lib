package com.daru.s1.lang.wrapper;

import java.time.LocalDate;
import java.util.Scanner;

public class WrapperEx1 {
	private Scanner sc;

	public WrapperEx1() {
		this.sc = new Scanner(System.in);
	}

	public void ex2() {
		System.out.println("주민 번호 입력");
		// String jumin = sc.next();
		// System.out.println(jumin);//입력된값이 제대로나오는지 확인
		String jumin = "9712224-1234567";

		// 키보드로부터 주민등록번호입력
		// 9 7 1 2 2 4 - 1 2 3 4 5 6 7 -마지막번호는 체크용번호
		// 2 3 4 5 6 7 8 9 2 3 4 5 위에랑 밑에곱함
		// 결과를 모두더함 ex)122

		int source = 2;
		int sum = 0;

		for (int i = 0; i < jumin.length() - 1; i++) {
			String result = jumin.substring(i, i + 1);// 1,2
			if (result.equals("-")) {
				continue;
			}

			if (!result.equals("-")) {
				System.out.println(Integer.parseInt(result));
			}
		}

		// -------------------------------
		for (int i = 0; i < jumin.length() - 1; i++) {
			if (source > 9) {
				source = 2;
			}
			char ch = jumin.charAt(i);
			// Integer.parseInt(ch+"");
			if (ch != '-') {
				int num = Integer.parseInt(String.valueOf(ch));// 문자열로변경
				sum = sum + num * source;
				source++;

			}
		} // for 끝
		System.out.println(sum);

		// 2. 모두 더한 결과값을 11로 나누어서 나머지를 구함
		// 122/11 -> 11.....1
		sum = sum % 11;

		// 3. 11로 나눈 나머지값을 11에서빼고 그 값을 체크용번호랑 같은지 비교
		sum = 11 - sum;

		if (sum > 9) {
			sum = sum % 10;
		}

		int check = Integer.parseInt(String.valueOf(jumin.charAt(jumin.length() - 1)));

		if (sum == Integer.parseInt(check))
			;

		// 4. 만약 결과값이 두자리면 결과값을 다시 10으로나누어서 그 나머지 값을
		// 체크용 번호랑 같은지 비교
		// 같으면 정상적인 주민번호, 아니면 잘못된 번호

	}

	public void ex1() {
		System.out.println("주민 번호 입력");
		String jumin = sc.next();
		System.out.println(jumin);// 입력된값이 제대로나오는지 확인
		jumin = "9712224-1234567"; // 샘플로만들어봄
		int age = 0;
		int year = 0;// 출생년도

		// 나이계산
		// 이번년도 - 출생년도
		// =======성별파싱=================
		String s = jumin.substring(7, 8);
		char ss = jumin.charAt(7);

		if (s.equals("1") || s.equals("2")) {

		}

		int preYear = 2000;

		if (ss == '1' || ss == '2') {
			preYear = 1900;
		}

		year = preYear + year;

		// =======연도파싱=================
		String y = jumin.substring(0, 2);
		year = Integer.parseInt(y);
		System.out.println(y + 1);

		age = 2022 - year;

		System.out.println("Age :" + age);// 나이 출력

		// 성별
		String se = "Woman";
		if (ss == '1' || ss == '3') {
			se = "Man";
		}

		// 계절
		String result = "";
		int season = Integer.parseInt(jumin.substring(2, 4));
		if (season >= 3 && season <= 5) {
			result = "봄";
		} else if (season >= 6 && season <= 8) {
			result = "여름";
		} else if (season >= 9 && season <= 11) {
			result = "가을";
		} else {
			result = "겨울";
		}

		// 키보드로부터 주민등록번호를 입력받음
//		System.out.println("주민번호를 입력하세요(-를 포함하여 입력)");
//		String num = sc.next();//주민번호 받기
//		
//		String gender = null;
//		LocalDate now = LocalDate.now(); //현재시간구하기
//		int year = now.getYear();//년도구하기
//		
//		int age = Integer.parseInt(num.substring(0,2));//int타입으로 변경
//		
//		char s = num.charAt(7);//성별 구별
//		
//		if( s == '1' || s == '3') {
//			gender = "남성";
//		} else if( s == '2' || s == '4') {
//			gender = "여성";
//		} else {
//			gender = "잘못 입력하셨습니다";
//		}
//		
//		if(s == '1' || s == '2') {
//			age = year -(1900+age);
//		}

		// 나이를 대충 계산
		// 남자? 여자?

		// 3-5 계절 : 봄
		// 6-8 여름
		// 9-11 가을
		// 12-2 겨울
	}

}
