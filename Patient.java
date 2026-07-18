package SmartHospitalManagementSystem;

import java.util.Scanner;

public class Patient {

    static String name;
     int patientID;
     int age;
     String disease;

    public Patient(String name , int patientID , int age , String disease) {
        this.name = name;
        this.patientID = patientID;
        this.age = age;
        this.disease = disease;
    }



    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", patientID=" + patientID +
                ", age=" + age +
                ", disease='" + disease + '\'' +
                '}';
    }
}
