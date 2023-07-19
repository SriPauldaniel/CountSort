import java.util.Scanner;
public class CountSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int[] arr1 = new int[10];
        for(int i=0;i<n;i++) {
            int x = arr[i];
            arr1[x]++;
        }
        int k =0;
        for(int i=0;i<10;i++) {
            for(int j=0;j<arr1[i];j++) {
                arr[k] = i;
                k++;
                
            }
        }
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}