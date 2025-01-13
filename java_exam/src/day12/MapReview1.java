package day12;

import java.util.HashMap;
import java.util.Scanner;

public class MapReview1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		HashMap<String, Object> map = new HashMap<>();
		map.put("name", "홍길동");
		map.put("java", 80);
		map.put("oracle", 70);
		
		System.out.print("과목 : ");
		String subject = scan.next();
		
		if(map.containsKey(subject)) {
			System.out.print("새 점수 : ");
			int score = scan.nextInt();
			map.put(subject, score);
		} else {
			System.out.println("없는 과목임");
		}
		System.out.println(map);
	}
}
