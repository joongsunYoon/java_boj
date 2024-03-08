import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            String s = sc.nextLine();
            String[] sarr = s.split(" ");
            int A = Integer.parseInt(sarr[0]);
            int B = Integer.parseInt(sarr[1]);
            System.out.println(A + B);
        }

    }
}
