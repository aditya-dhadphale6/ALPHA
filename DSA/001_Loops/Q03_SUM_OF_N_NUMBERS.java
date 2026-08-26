import java.util.Scanner;


public class Q03_SUM_OF_N_NUMBERS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range");
        int range = sc.nextInt();
        int counter = 1;
        int sum = 0;

        while (counter<=range){
            sum += counter;
            counter++;
        }

        System.err.println(sum);
    }
}