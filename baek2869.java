import java.util.Scanner;

public class baek2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt(); 
 
		int cnt = (C - B) / (A - B);
        
		// 나머지가 있을 경우 (한번 더 올라가야됨)
		if ((C - B) % (A - B) != 0) {
			cnt++;
		}
		System.out.println(cnt);
    
        
    }
    
}
