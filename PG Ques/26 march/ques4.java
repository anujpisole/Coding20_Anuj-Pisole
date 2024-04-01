import java.util.*;
public class ques4 {
    public static void sortArray(int[] arr,int n){
        Arrays.sort(arr);
        for(int i = 0;i<n/2;i++){
            System.out.print(arr[i]+" ");
        }
        for(int j = n-1;j>=n/2;j--){
            System.out.print(arr[j]+" ");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of Array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of array");
        for(int i=0;i<size;i++){
           arr[i]=sc.nextInt();
        }
        int n = arr.length;
        sortArray(arr,n);  
    }
}
