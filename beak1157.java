import java.util.Scanner;

public class beak1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int[] arr = new int[26];
        for(int i = 0; i< S.length(); i++){
            if('A'<=S.charAt(i) && S.charAt(i)<='Z'){
                arr[S.charAt(i)-'A']++;
            }else{
                arr[S.charAt(i)-'a']++;
            }
        }
        int max = -1;
        char ch = '?';

        for(int i = 0; i<26; i++){
            if(arr[i]>max){
                max = arr[i];
                ch = (char)(i+65); // 문자로 강제변환
            }else if(arr[i]==max){
                ch = '?';
            }
        }
        System.out.print(ch);
    }
    
}
