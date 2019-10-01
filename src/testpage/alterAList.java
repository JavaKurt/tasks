import java.io.*;
import java.util.*;

public class alterAList {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        List list = new ArrayList();
        int Q;
        int N = 0;   
        int num;

        N = scan.nextInt();
        for(int i = 0; i < N; i++){
            num = scan.nextInt();
             list.add(num);
        }

        Q = scan.nextInt();
        String answer;
        //get 2 queries
        
        
        for(int j = 0; j <= Q; j++){
            answer = scan.next();
                if(answer.equals("Insert")){
                    int num1 = scan.nextInt();
                    int num2 = scan.nextInt();
                    list.add(num1, num2);
                    System.out.println("New list: " + list);
                }
                else if(answer.equals("Delete")){
                    int num3;
                    num3 = scan.nextInt();
                    list.remove(num3);
                    System.out.println("New list: " + list);
                }
        }
        
            StringBuilder builder = new StringBuilder();
            for (Object value : list) {
                builder.append("");
            }
            String text = builder.toString();
            System.out.println("New list: " + list);
        

    }
}