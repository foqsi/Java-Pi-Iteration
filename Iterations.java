import java.util.Scanner;

public class Iterations {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of iterations (n): ");
        int iterations = input.nextInt();
        
        if(iterations < 1)
            System.out.println("Warning: n is a positive integer.");

        double sum = 0;
        double pi = Math.PI;

        if(iterations >= 1)
            System.out.printf("|%3s|%10s|%10s|%n", "i", "Pi'", "Error");
        for(int i = 1; i <= iterations; i++){
            sum += 4 * Math.pow(-1,i+1)/(2*i-1);
            System.out.printf("|%3d|%10.7f|%10.7f|%n", i, sum, Math.abs(sum-pi));
        }
        input.close();
    }
}
