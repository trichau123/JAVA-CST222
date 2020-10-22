import java.util.Scanner;
import java.util.Arrays;

public class AscendingAndDescending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2,num3= 0;
        int arr[] = new int[3];
        System.out.println("Enter firstnumber: ");
        num1 = sc.nextInt();
        System.out.println("Enter secondnumber: ");
        num2 = sc.nextInt();
        System.out.println("Enter thirdnumber: ");
        num3 = sc.nextInt();
        arr[0] = num1;
        arr[1] = num2;
        arr[2] = num3; 
        System.out.println("array before "+arr[0]+" "+arr[1]+" "+arr[2]);
        Arrays.sort(arr);
        System.out.println("array ascending "+arr[0]+" "+arr[1]+" "+arr[2]);
      //  Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("array descending: "+arr[2]+" "+arr[1]+" "+arr[0]);
    }
}
