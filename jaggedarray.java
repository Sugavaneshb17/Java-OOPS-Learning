import java.util.Scanner;

public class jaggedarray {
    public static void main(String a[]) {
        int[][] arr = new int[3][];

        arr[0] = new int[2];
        arr[1] = new int[3];
        arr[2] = new int[1];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < arr[i].length;j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < arr[i].length;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}