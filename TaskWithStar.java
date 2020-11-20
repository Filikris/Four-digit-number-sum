import java.util.Scanner;
public class TaskWithStar {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int x = readInput(in);
        numberSum(x);
    }

    public static int readInput (Scanner in) {   
        int x = in.nextInt();
        return x;
    }

    public static int numberSum (int x) {
        int sum=0;
        while (x>0) {
            sum +=x%10;
            x/=10;
        }
        System.out.println(sum);
        return sum;
    }    
}
