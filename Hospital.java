package SmartHospitalManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

    List<Patient> patientList = new ArrayList<>();

    public  void addPatient(Patient P) {
      patientList.add(P);
    }

    public void displayAllPatients() {

        if (patientList.isEmpty()) {
            System.out.println("❌ Hospital Record is Empty! No patients registered yet.");
            return;
        }

        System.out.println("\n--- 🏥 Registered Patients List ---");

        for (Patient p : patientList) {
            System.out.println(p);
        }
        System.out.println("-----------------------------------");
    }

    public Patient searchPatient(String name) {
        for (Patient p : patientList  )
            if (p.name.equalsIgnoreCase(name)) {
                System.out.println(p);
            }
        return null;
    }

    public Patient searchPatient(int id) {
      for (Patient p  : patientList)
          if (p.patientID == id){
              System.out.println(p);
          }
      return null;
}

}
