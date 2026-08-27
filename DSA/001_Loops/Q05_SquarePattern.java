import java.util.*; 
 
public class Q05_SquarePattern { 
 
    public static void main(String[] args) { 
        System.out.println("Enter Value"); 
        Scanner sc = new Scanner(System.in); 
         
        int n = sc.nextInt(); 
 
        for (int row = 0; row < n; row++) { 
 
            for (int col = 0; col < n; col++) { 
                System.out.print("*"); 
            } 
 
            System.out.println(); 
        } 
    } 
}