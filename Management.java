package SmartHospitalManagementSystem;

import java.util.Arrays;
import java.util.Scanner;

public class Management {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Welcome to Smart Hospital Management System ");
        Hospital hospital = new Hospital();
       return switch (hospital){
           case 1 -> "Add Patient" ;

         //  hospital.addPatient(Patient P);
           case 2 -> {
               String string = "All Display";
               hospital.displayAllPatients();
           }

       };
   }

}
