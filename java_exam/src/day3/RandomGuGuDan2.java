package day3;

import java.util.Random;
import java.util.Scanner;

public class RandomGuGuDan2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int count = 0;
			System.out.println("문제 수를 입력해주세요. 0이하 숫자 입력 시 종료됩니다.");
			int total = scan.nextInt();
			if(total < 1) {
				System.out.println("종료되었습니다.");
				break;
			}
			for(int i=1; i<=total; i++) {
				int x = ran.nextInt(8)+2; // 2~9
				int y = ran.nextInt(9)+1; // 1~9
				System.out.print(x+" * "+y+" = ");
				int answer = scan.nextInt();
				if(answer == x*y) {
					System.out.println("정답입니다.");
					count++;
				} else {
					System.out.println(
							"오답! 정답은 " + (x*y) + " 입니다."
					);
				}
				if(i == total){
					System.out.println("총 " + total + "문제 중 " + count + "개 맞추셨습니다.");
					System.out.println();
				}
			}
		}
	}

}
