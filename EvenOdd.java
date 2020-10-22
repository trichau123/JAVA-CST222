import java.util.Scanner;
class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter an integer:");
        Scanner sc = new Scanner(System.in);
        int integer = sc.nextInt();
        if(isEven(integer)){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
    public static boolean isEven(int number) {
        if (number %2 == 0)
            return true;
        return false;
    }
}
