package Lacture2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class User2 {
    String name;
    String role;

    public User2(String name, String role){
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }
    public String getRole() {
        return role;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "[" + "User-Name : " + name + ", Role :" + role + "]";
    }




    public static void main(String[] args){
        List<User2> users = new ArrayList<>();
        users.add(new User2("John1", "admin"));
        users.add(new User2("John2", "admin"));
        users.add(new User2("Peter", "member"));



        // This line uses Predicates to filter
        // out the list of users with the role "admin".
        // List admins = process(users, (User u) ->
        // u.getRole().equals("admin"));

        // Replacing it with the following line
        // using Stream API and lambda functions
        // produces the same output

        // the input to the filter() is a lambda
        // expression that returns a predicate: a
        // boolean value for each user encountered
        // (true if admin, false otherwise)
        List<User2> admins = users.stream()
                .filter((user) -> user.getRole().equals("admin"))
                .collect(Collectors.toList());

        System.out.println(admins);
        for( User2 user : admins ) System.out.println(user);

    }
}
