import java.util.Scanner;

public class MainJavaInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter your name and surname>>>>");  //запись из консоли
        //String name = scan.next(); // next - берет только первое слово до пробела
        String name = scan.nextLine();  // всю строку
        System.out.println("Your name is "+ name);
        System.out.print("Enter your age >>>>");
        //int age = scan.nextInt();  //целое число
        Double age = scan.nextDouble();
        System.out.println("You are"  + age + "years old"  );


    }
}
