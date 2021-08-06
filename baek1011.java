import java.util.Scanner;

public class baek1011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
		int T = sc.nextInt();	// 테스트 케이스 
		
		for(int i = 0; i < T; i++) {
        
			int X = sc.nextInt();
			int Y = sc.nextInt();
			
			int distance = Y - X;	// 거리
			
			int max = (int)Math.sqrt(distance);	
            // Math.sqrt는 double형이 리턴되므로 강제로 int로 형변환해서 소수점 이사 값을 버린다.
            
			if(max == Math.sqrt(distance)) {
				System.out.println(max * 2 - 1);
			}
			else if(distance <= max * max + max) {
				System.out.println(max * 2);
			}
			else {
				System.out.println(max * 2 + 1);
			}
			
		}
    }
}
