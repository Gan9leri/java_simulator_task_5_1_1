import java.util.Scanner;
import static java.lang.Math.exp;
import static java.lang.Math.round;

public class Main {
    public static void main(String[] args){
        int n = readInput();
        long result = subfactorial(n);
        System.out.println(result);
    }

    public static int readInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static long subfactorial(int n){
        int fact = n;
        for (int i = n - 1; i > 0; i--) fact = fact * i;
        return round((fact/exp(1)));
    }
}
