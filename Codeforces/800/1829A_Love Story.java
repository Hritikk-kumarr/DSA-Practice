import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  lets Define our baseline comparison string
        final String TARGET = "codeforces";

        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();

            for (int i = 0; i < t; i++) {
                String s = scanner.next();
                int differenceCount = 0;

                // lets Compare character by character
                for (int j = 0; j < 10; j++) {
                    if (s.charAt(j) != TARGET.charAt(j)) {
                        differenceCount++;
                    }
                }

                System.out.println(differenceCount);
            }
        }

        scanner.close();
    }
}