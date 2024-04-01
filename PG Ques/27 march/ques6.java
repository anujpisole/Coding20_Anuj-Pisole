public class ques6 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,3,4,5};
        int newarr[] = new int[10];
        int idx=0;
        for(int i=0;i<arr.length;i++){
            while(i<arr.length-1 && arr[i]==arr[i+1])
            i++;
            newarr[idx] = arr[i];
            idx++;
        }
        for(int i=0;i<idx;i++){
            System.out.print(newarr[i]+" ");
        }
    }
}
