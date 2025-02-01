package Lacture5;

import java.util.Optional;
import java.util.Scanner;

public class MsgService {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter User ID : ");
        int userId = scan.nextInt();

        User user = new User();

//        String userName = user.getUserById(userId);
//        String msg = userName.toUpperCase() + ", Hello";  // if we perform any operation on null value then we will get null pointer exception
//        System.out.println(msg);


        Optional<String> username = user.getUserById(userId);
        if ( username.isPresent() ) {
            String name = username.get();
            System.out.println(name.toUpperCase() + ", Hello");
        }
        else System.out.println("No Data Found !!");

        if ( username.isEmpty() ) System.out.println("empty");
        else System.out.println("not emplty");
    }
}
