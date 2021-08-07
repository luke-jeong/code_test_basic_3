import java.util.Scanner;
 
public class baek1065 {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print(arithmetic_sequence(in.nextInt()));
		in.close();
 
		
	}
 
	public static int arithmetic_sequence(int num) {
		int cnt = 0; // 한수 카운팅
 
		if (num < 100) {
			return num;
		}
 
		else {
			cnt = 99;
			if (num == 1000) { // 예외처리 필수
				num = 999;
			}
 
			for (int i = 100; i <= num; i++) {
				int h = i / 100; // 백의 자라
				int t = (i / 10) % 10; // 십의 자리
				int o = i % 10;
 
				if ((h - t) == (t - o)) { // 각 자릿수가 수열을 이루면
					cnt++;
				}
			}
		}
 
		return cnt;
	}
 
}