package Lacture2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class User {
    String name;
    String role;

    public User(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "[" + "User-Name : " + name + ", Role :" + role + "]";
    }



    public static List<User> process(List<User> users, Predicate<User> predicate){
        List<User> result = new ArrayList<>();
        for ( User user : users ){
            if ( predicate.test(user) ) result.add(user);
        }
        return result;
    }

    public static void main(String[] args){
        List<User> users = new ArrayList<>();
        users.add(new User("John1", "admin"));
        users.add(new User("John2", "admin"));
        users.add(new User("Peter", "member"));

        List<User> admins = process(users, (User u) -> u.getRole().equals("admin"));
        System.out.println("admins : " + admins);
        for ( User user :  admins) System.out.println(user);
    }
}
