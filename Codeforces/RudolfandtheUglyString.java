package Codeforces;

import java.util.Scanner;

public class RudolfandtheUglyString {

    public static int beautifulstring(String str) {
        int count = 0;
        if (str.length() < 3) return 0;

        for (int i = 0; i < str.length() - 2; i++) {
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(i + 1);
            char ch3 = str.charAt(i + 2);
            if ((ch1 == 'p' && ch2 == 'i' && ch3 == 'e') || (ch1 == 'm' && ch2 == 'a' && ch3 == 'p')) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String str = sc.next();
            if (str.length() == n) {
                System.out.println(beautifulstring(str));
            }
        }
        sc.close();
    }
}
