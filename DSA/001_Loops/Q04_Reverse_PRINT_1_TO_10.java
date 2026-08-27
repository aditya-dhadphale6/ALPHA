
import java.util.Scanner;


public class Q04_Reverse_PRINT_1_TO_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = num; i>= 1; i--){
            System.out.println(i);
        }
    }
}