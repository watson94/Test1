import java.util.Scanner;

/**
 * Created by Student-24 on 20.05.2017.t
 **/
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int checkNum =0;
            checkNum = a[i] % 2;
            if (checkNum == 0) {
                System.out.println(a[i]);
            }
        }
    }
}
