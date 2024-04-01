import java.util.*;
public class ques2 {
    public static void fibo(int a,int b,int n){
        if(n==0){
         return;
        }
        System.out.println(a);
        int c =a+b;
        fibo(b, c, n-1);
        
    }
    
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibo(0, 1, n);
    }
}
