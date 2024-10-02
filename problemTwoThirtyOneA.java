  import java.util.*;

public class problemTwoThirtyOneA {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                int n = sc.nextInt();
                sc.nextLine();
                // System.out.println(problemOne);
                // System.out.println(problemTwo);
                // System.out.println(problemThree);

                int numProbsSolved = 0;
                for(int i = 0; i < n; i++) {
                        
                        String problems = sc.nextLine();

                        int problemOne = Integer.parseInt(problems.substring(0,1));
                        int problemTwo = Integer.parseInt(Character.toString(problems.charAt(2)));
                        int problemThree = Integer.parseInt(Character.toString(problems.charAt(4)));

                        if(problemOne + problemTwo + problemThree >= 2) {
                                numProbsSolved++;
                        }
                                

                }
                System.out.println(numProbsSolved);



        }
}

      
