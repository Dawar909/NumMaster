import java.util.Scanner;

class NumMaster {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter First Number");
    Double FirstNumber = scanner.nextDouble();
    System.out.println("Enter Second Number");
    Double SecondNumber = scanner.nextDouble();        
    if (FirstNumber > SecondNumber){
        System.out.println(FirstNumber +" is bigger");
        } else if (FirstNumber < SecondNumber) {
            System.out.println(SecondNumber + " is bigger");
        } else {
            System.out.println("They are equal");
            scanner.close();
        }     
    }
}