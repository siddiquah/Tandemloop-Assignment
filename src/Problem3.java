import java.util.Scanner;

public class Problem3 {

    void printn(int n) {
        if(n<=1) {
            return;
        }
        int i;
        if(n%2 != 0) {
            for (i=1; i<=n; i++) {
                System.out.print(i);
            }
        }
        else {
            for (i=n; i>=1; i--) {
                System.out.print(i);
            }
        }
        System.out.println();
    }

    void prt(int n) {

        if (n<=1) {
            printn(1);
            return;
        }

        int end = 1;
        Boolean inRevDir = false; //if in reverse direction

        while(true) {
            printn(end);
            if (inRevDir) {
                end -= 1;
            }
            else {
                end += 1;
            }
            if (end == 1) {
                printn(1);
                break;
            }
            if (end==n) {
                inRevDir = true;
            }
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter an integer");
        int a = sc.nextInt();

        System.out.println("1");
        Problem3 obj = new Problem3();
        obj.prt(a);
        System.out.println("1");
    }
}
