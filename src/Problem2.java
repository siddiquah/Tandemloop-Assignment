import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem2 {

//    void ptn(int n) {
//        if(n<=1) System.out.println("1");
//        int count = n%2 == 0? n-1:n;
//        int[] result = {1};
//        for (int i =1l i<count; i++) {
//            result.
//        }
//
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter an integer");
        int n = sc.nextInt();

        if(n<=1) {
            System.out.println(1);
        }
        int count = n%2 == 0? n-1:n;

        List<Integer> result = new ArrayList<Integer>();
        result.add(1);
        for(int i = 1; i<count; i++) {
            result.add(result.get(result.size() - 1) + 2);
        }
        System.out.println(result);
    }
}
