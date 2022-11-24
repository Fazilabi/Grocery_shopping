import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        double pear, apple, tomatoes, banana, eggplant;
        System.out.print("pear kg : ");
        pear = input.nextDouble() * 2.14;
        System.out.print("apple kg : ");
        apple = input.nextDouble() * 3.67;
        System.out.print("tomatoes kg : ");
        tomatoes = input.nextDouble() * 1.11;
        System.out.print("banana kg : ");
        banana = input.nextDouble() * 1.95;
        System.out.print("eggplant kg : ");
        eggplant = input.nextDouble() * 5;

        double total = pear + apple  + tomatoes  + banana  + eggplant ;
        System.out.println(" Total : " + total);

    }
}