public class ques14 {
    public static void main(String[] args) {
        int arr[] = {1,23,4,6,3,4,6,1};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    System.out.print(arr[j]+" ");
                }
            }
        }
    }
}
