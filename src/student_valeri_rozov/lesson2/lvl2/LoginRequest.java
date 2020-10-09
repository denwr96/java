package student_valeri_rozov.lesson2.lvl2;

import java.util.Scanner;

public class LoginRequest {
    public static void main(String[] args) {
        Scanner request = new Scanner(System.in);
        System.out.println("Your nickname");

        String userName = request.nextLine();
        System.out.println("Hello " + userName);
    }

}
