package com.daru.s1.lang.string;

import java.util.Scanner;

public class StringStudy1 {
	

	public void splitTest() {
		String name = "daru, wacle, jaedduk, taxbae";
		String [] names = name.split(",");
		
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i].trim());
		}
	}

	public void valueTest() {
		int num = 1000;
		String result= String.valueOf(num);
		System.out.println(result);
		
	}
	
	public void caseTest() {
		String title = "West Side Story";
		String result = title.toLowerCase();
		String result2 = title.toUpperCase();
		
		System.out.println("Lower: "+result);
		System.out.println("Upper: "+result2);
	}

	
	public void replaceTest() {
		String title = "West Side Story";
		//참조변수명.멤버메서드명()
		String result = title.replace('S', 't');
		
		System.out.println(title);
		System.out.println(result);
	}
	
	
	
	public void subStringEx1() {
		//키보드로부터 업로드할파일명을 입력
		//a.txt, b.pdf, daru.jpg
		//jpg, gif, png -> 이미지파일입니다 출력
		//txt, pdf, hwp -> 문서파일입니다 출력
		//mp3, wav, ogg -> 음원파일입니다 출력
		//나머지는 알 수 없는 파일입니다.
		Scanner sc = new Scanner(System.in);
				System.out.println("파일명 입력");;
		String fileName = sc.next();
		//abc.txt 점을찾아서 우측편을 찾으면됨
		String result = fileName.substring(fileName.lastIndexOf(".")+1);
		System.out.println(result);
		
		if(result.equals("jpg") || result.equals("gif") || result.equals("png"))
			System.out.println("이미지 파일입니다");
		else if(result.equals("txt") || result.equals("pdf") || result.equals("hwp"))
			System.out.println("문서파일 입니다");
			else if(result.equals("mp3") || result.equals("wav") || result.equals("ogg"))
				System.out.println("음원파일 입니다");
			else {
				System.out.println("알수없는 파일입니다");
			}
		
		
		
	}
	
	public void subStringTest() {
		String title = "West Side Story";
		//side story만 가져옴
		String result = title.substring(5);
		System.out.println(result);
		result = title.substring(5, 9);
		System.out.println(result);
	}
	
	
	
	public void lengthTest() {
		String title = "West Side Story";
		int len = title.length();
		System.out.println(len);
		//한글자씩 출력
		
		
		String find = "S";
		//title find에 들어가있2는 글자가 몇개있는지 출력
		int count = 0;
		for(int i=0;i<title.length();i++) {
			int index = title.indexOf(find, i);
			if(index != -1) {
				count++;
				i = index;
			} else {
				break;
			}
					
		}
			System.out.println("Count : "+count);
			
	
		
		for(int i=0;i<title.length();i++) {
			System.out.println(title.charAt(i));
		}
	}
	
	
	
	public void indexOfTest() {
		String msg = "Hello World";
		//indexOf 호출
		int num = msg.indexOf('W');//int ch = 'W';
		System.out.println(num);
	
	
	}
	
	
	
	
	public void equal1Test() {
		String str = "daru";
		String str2 = "daru";
		String str3 = new String("daru");
		String str4 = new String("daru");
		
		System.out.println(str == str2);
		System.out.println(str3 == str4);
		System.out.println(str == str3);
		System.out.println("===========");
		System.out.println(str.equals(str2));
		System.out.println(str3.equals(str4));
		System.out.println(str.equals(str4));
		
//		System.out.println("Str: "+str);
//		System.out.println("Str2: "+str2);
//		System.out.println(str == str2);
//		System.out.println(str.equals(str2));

	}
	

	public void stduy1() {
		String name = "Hello";
		
		String name2 = new String("Hello2"); //원래는 이렇게 만들어야함
		
		//charAt메서드 호출 코드 작성
		int i = 1;
		char ch = name.charAt(i);
		
		System.out.println(ch);
		
	}
	
	
	
}
