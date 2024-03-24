import java.util.*;
// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Hello world!");

    Account AccountObj = new Account();
    AccountObj.scheduleAppointment();

    Account DrTimeMatchobj = new Account();
    DrTimeMatchobj.DrTimeMatch();

    Account Appointmentfeesobj = new Account();
    Appointmentfeesobj.Appointmentfees();

    Account feesOptionobj = new Account();
    feesOptionobj.feesOption();

    user patientNameobj = new user();
    patientNameobj.user();

    user fatherNameObj = new user();
    fatherNameObj.fatherName();

    user MrNoobj = new user();
    MrNoobj.MrNo();

    user DateObj = new user();
    DateObj.date();

    user timeObj = new user();
    timeObj.time();

    user NICNoObj = new user();
    NICNoObj.NICNo();

    user PatientWardObj = new user();
    PatientWardObj.patientWard();

    user patientillsarrayObj = new user();
    patientillsarrayObj.patientIllsArray();

    String patientIllness = "fever"; // or whatever the patient's illness is
    user DoctorObj = new user();
    String appropriateDoctor = DoctorObj.doctor(patientIllness);
    System.out.println("Appropriate doctor for the patient's illness: " + appropriateDoctor);

    user fieldObj = new user();
    fieldObj.field();

    user barcodenoObj = new user();
    int result = barcodenoObj.barcodeNo();
    if (result != -1) {
        System.out.println("Barcode found in the database: " + result);
    } 
    else {
        System.out.println("Generated barcode not found in the database.");
    }
  }
} 
  
  

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }