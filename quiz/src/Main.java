import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int age;
        String firstName;
        String favouriteFood;
        System.out.println("Please enter your age:");
        age = scanner.nextInt();
        System.out.println("Please enter your name: ");
        firstName = scanner.next();
        System.out.println("Please enter your favourite food:");
        favouriteFood = scanner.next();
        System.out.println("First name: " + firstName + "\nAge: " + age + "\nFavourite food :" + favouriteFood);
    }
}
