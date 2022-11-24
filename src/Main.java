import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        double pear, apple, tomatoes, banana, eggplant;
        System.out.print("pear kg : ");
        pear = input.nextDouble();
        System.out.print("apple kg : ");
        apple = input.nextDouble();
        System.out.print("tomatoes kg : ");
        tomatoes = input.nextDouble();
        System.out.print("banana kg : ");
        banana = input.nextDouble();
        System.out.print("eggplant kg : ");
        eggplant = input.nextDouble();





        double total = pear * 2.14 + apple * 3.67 + tomatoes * 1.11 + banana * 1.95 + eggplant * 5;
        System.out.println(" Total : " + total);

    }
}