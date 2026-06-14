import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();

            while (t-- > 0) {
                int n = scanner.nextInt();
                int l = scanner.nextInt();
                int r = scanner.nextInt();

                int[] p = new int[n];
                for (int i = 0; i < n; i++) {
                    p[i] = scanner.nextInt();
                }

                // Convert 1-based indexing to 0-based indexing
                int left = l - 1;
                int right = r - 1;

                // Two-pointer swap to reverse the subsegment
                while (left < right) {
                    int temp = p[left];
                    p[left] = p[right];
                    p[right] = temp;

                    left++;
                    right--;
                }

                // Print the resulting array
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < n; i++) {
                    sb.append(p[i]).append(" ");
                }
                System.out.println(sb.toString().trim());
            }
        }

        scanner.close();
    }
}