package nyc.c4q.huilin;

public class Solution {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        // depending on the k rotation, reassign values until value reached
        // save 0th index number
        for (int i = 0; i < k; i++) {
            int temp = a[0];
            for (int j = 1; j < n; j++) {
                a[j - 1] = a[j];
            }
            a[n - 1] = temp;


        }
        return a;

    }

    public static void main(String[] args) {
        // Answer submitted to Hacker Rank
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int k = in.nextInt();
//        int a[] = new int[n];
//        for(int a_i=0; a_i < n; a_i++){
//            a[a_i] = in.nextInt();
//        }
//
//        int[] output = new int[n];
//        output = arrayLeftRotation(a, n, k);
//        for(int i = 0; i < n; i++)
//            System.out.print(output[i] + " ");
//
//        System.out.println();
//
//    }

        // Testing here
        int[] input = {
                1, 2, 3, 4, 5
        };
        int[] output = arrayLeftRotation(input, input.length, 4);
        for (int i = 0; i < output.length; i++)
            System.out.print(output[i] + " ");

        System.out.println();

    }
}

