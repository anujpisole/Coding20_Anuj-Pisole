import java.util.*;
public class ques13 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.println("Enter the position of the element which is to be rotate : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i<n;i++){
            int j;
            int first = arr[0];
            for(j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[j]=first;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
