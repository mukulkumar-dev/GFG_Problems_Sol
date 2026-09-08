import java.util.Scanner;

class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s;
        int n;
        double f;
        int ff; // To Store floor of float variable f

        // code here
        s = sc.nextLine();
        n = sc.nextInt();
        f = sc.nextDouble();

        System.out.println(s);
        System.out.println(n);
        System.out.println((int)Math.floor(f));
    }
}