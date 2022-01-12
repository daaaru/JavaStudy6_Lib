package com.daru.s2.util.token;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class TokenStudy {

	public static void main(String[] args) {
		String str = "봄,16, 여름,32, 가을,20, 겨울,-15";

		StringTokenizer st = new StringTokenizer(str, ",");

		ArrayList<SeasonDTO> ar = new ArrayList<>();

		while (st.hasMoreTokens()) {
			SeasonDTO seasonDTO = new SeasonDTO();
			String token = st.nextToken();
			seasonDTO.setName(token);// 봄

			token = st.nextToken();// 16
			seasonDTO.setGion(Integer.parseInt(token));

			ar.add(seasonDTO);

			System.out.println(seasonDTO.getName().trim());
			System.out.println(seasonDTO.getGion());

		}

		for (int i = 0; i < ar.size(); i++) {
			SeasonDTO seasonDTO = ar.get(i);
			System.out.println(seasonDTO.getName());
			System.out.println(ar.get(i).getGion());
		}
	}

}
