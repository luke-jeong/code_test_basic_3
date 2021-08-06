import java.math.BigInteger;
import java.util.Scanner;

public class baek10757 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger A = new BigInteger(sc.next());
        BigInteger B = new BigInteger(sc.next());

        A = A.add(B);
        /*
        * add() 메소드는 해당 BigInteger 객체와 파라미터(인자)로 들어온 
        * BigInteger객체의 더한 값을 BigInteger 타입으로 반환한다.
        */

        //BigInteger 타입을 String으로 변환해야 출력 가능.
        
        System.out.println(A.toString());
    }
}
