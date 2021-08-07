import java.util.Scanner;

public class baek1978{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;

        
    }
    /*방법 1
    boolean Prime(int num){

        1은 소수가 아니므로.
        if(num == 1){
            return false;
        }

        2 ~ num-1까지 중 나누어 떨어지는 약수가 있는지 판별

        for(int i = 2; i< num; i++){
            if(num%i==0)
            return false;
        }
        위 두 조건에 걸리지 않으면 소수 이므로 true 출력.
        return true;
    }
    방법 1의 시간 복잡도는 O(N)이다.
    */

    /*방법 2
    주어진 수 num는 A*B로 이루어져 있을것이고, 이때 A와 B 중 적어도 하나는
    num의 제곱근보다 작거나 같다.

    boolean Prime(int num){
        if(num == 1){
            return false;
        }
        for(int i =2; i <= Math.sqrt(num); i++){
            if(num % i == 0)
            return false;
        }
        return true;
    }*/

    /* 방법 3
    가장 대중적인 방법. 에라토스테네스의 체
    ex)2의 배수를 거르고, 3의 배수를 거르고... (반복)
    이 방법을 주어진 수의 제곱근까지만 반복한다.

    소수면 false, 소수가 아니면 true

    public boolean[] make_prime(int num){
        boolean[] Prime = new boolean[num+1];

        이때 0과 1은 소수가 아니므로 true
        Prime[0] = true;
        Prime[1] = true;

        for(int i=2; i<Math.sqrt(num);i++){

            이미 걸리진 배열일 경우 다음 반복문으로 넘어간다.
            if(Prime[i] = true){
                continue;
            }
            정석대로라면 j=i*2부터 시작해야하지만
            이미 2의 배수가 걸러졌기 때문에 i의 제곱수부터 시작 가능.
            for(int j = i*i; j<num+1; j=j+i){
                Prime[j]=true;
            }
        }
        배열 index가 소수면 false, 아니면 true가 됨.
        return Prime;
    }
    */
        
}