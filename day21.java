/*
 import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt(); // Fix: Use 'sc' instead of 'Scanner'
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        boolean allSame = true; // Fix: Proper variable name

        for (int num : arr) {
            if (num != arr[0]) {
                allSame = false; // Fix: Proper logic to check if all numbers are the same
            }
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) { // Fix: Correct second max logic
                secondMax = num;
            }
        }

        if (allSame) {
            System.out.println(0);
        } else {
            System.out.println(secondMax);
        }

        sc.close(); // Fix: Properly closing the Scanner
    }
}

 */