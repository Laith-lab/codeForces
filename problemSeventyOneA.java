import java.util.Scanner;
 
public class problemSeventyOneA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int wRemainder = w % 2;
        
        if(w == 2) {
            System.out.println("NO");
        } else if(wRemainder == 0 || wRemainder % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}    
