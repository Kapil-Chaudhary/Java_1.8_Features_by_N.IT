package Lacture4;

import javax.print.Doc;
import java.util.function.Consumer;
import java.util.function.Supplier;

class Doctor{
    Doctor(){
        System.out.println("Doctor Constructor !!");
    }

    // 2
    Doctor(String name){
        System.out.println("name of doctor : " + name);
    }
}


public class ConstructorRefrance {
    public static void main(String[] args) {

//        Doctor d = new Doctor(); // this is normal method  -> will print = Doctor Constructor !!

        Supplier<Doctor> s = Doctor::new; // Doctor Constructor !! // error on perimeterized constructor
//        System.out.println(s.get().hashCode()); // 1232445212
        Doctor doctor = s.get(); // object is created
        System.out.println(doctor.hashCode()); // give hashcode of that object

        // 2
//        Consumer<String> si = Doctor::new;
//        System.out.println(si);
//        System.out.println(si.hashCode());

    }
}
