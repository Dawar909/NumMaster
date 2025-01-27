import java.util.Arrays ;
import java.util.Scanner;

class NumMaster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to compare");
        System.out.println("you can't enter zero and 1");
        int comparer = scanner.nextInt();
        int x;
        int[] UsersNumbers = new int[comparer + 1];
        for(x = 0; x < comparer; x++) {
            System.out.println("Enter your number");
            UsersNumbers[x]= scanner.nextInt();
        }
        Arrays.sort(UsersNumbers);
        System.out.println(UsersNumbers[comparer]);
        scanner.close();
    }
}        