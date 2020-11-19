import java.util.Scanner;
public class TaskWithStar {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        int num, res, a, b, c;
        num = in.nextInt();
        a = num %10;
        num /= 10;
        b = num %10;
        num /= 10;
        c = num %10;
        num/= 10;
        res= num + a + b + c;
        System.out.println(res);



    }
    
}
