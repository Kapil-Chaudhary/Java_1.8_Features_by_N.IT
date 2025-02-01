package Lacture5;

import java.util.Optional;

public class User {

//    public String getUserById(Integer id){
//        if ( id==100 ) return "Raju";
//        else if ( id==101 ) return "Rani";
//        else if ( id==102 ) return "John";
//        else return null;
//
//    }

    public Optional<String> getUserById(Integer id){
        String name = null;
        if ( id==100 ) return Optional.ofNullable("Raju");
        else if ( id==101 ) return Optional.ofNullable("Rani");
        else if ( id==102 ) return Optional.ofNullable("John");
        else return Optional.ofNullable(name);

    }

}
