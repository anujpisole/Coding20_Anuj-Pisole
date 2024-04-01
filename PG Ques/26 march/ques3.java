public class ques3 {
    public static void main(String[] args) {
        int sum = 0,temp;
        int n =65256;
        temp = n;
        while(n>0){
            sum = (sum*10) + n%10;
            n = n/10;
        }
        if(temp == sum){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }
}


