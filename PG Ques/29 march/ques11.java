public class ques11 {
    static String removeNonAlphabetic(String str) {
 
        
        String result = str.replaceAll("[^a-zA-Z]", "");
 
        return result;
    }
    public static void main(String[] args) {
        String str = "Hello, how are you ?"; 
        String result = removeNonAlphabetic(str); 
        System.out.println(result); 
    }
}
