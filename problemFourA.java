import java.util.*;
 
public class problemFourA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 0; i < n+1; i++) {
            String word = sc.nextLine();
            int length = word.length();
            
            if(length <= 10) {
                System.out.println(word);
            } else {
                String firstLetter = word.substring(0,1);
                String lastLetter = word.substring(length-1);
            
                int numsBtwn = length-2;
            
                System.out.println(firstLetter + numsBtwn + lastLetter);
            }


            
            
            
            
        }
    }
}
