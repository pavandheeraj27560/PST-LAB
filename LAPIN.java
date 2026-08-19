import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            String s = sc.next();

            int n = s.length();
            int[] left = new int[26];
            int[] right = new int[26];

            int half = n / 2;

            for (int i = 0; i < half; i++) {
                left[s.charAt(i) - 'a']++;
            }

            for (int i = n - half; i < n; i++) {
                right[s.charAt(i) - 'a']++;
            }

            if (Arrays.equals(left, right)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}