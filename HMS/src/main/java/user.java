import java.util.*;
class user {
  
  
    Scanner input = new Scanner(System.in);

  //   //creat constructor.
  //   public class user {
  //     this.pn = patient Name;
  //     this.fn = father Name;
  //     this.Mrn = Mrno;
  //     this.d = date;
  //     this.t = time;
  //     this.nicno = Nicno;
  //     this.pw = patientWard;
  //     this.PIA = patientsillsArray;
  //     this.Drn = docterName;
  //     this.f = feildsArray;
  //     this.GBN = generateBarCodeno;

    // pre condition: patient name is not in the list and does not match the actual patient.
    // post condition: add patient name.
boolean isPatientName = true;

public void user() {
    // Base case: if patient name is not available
    if (!isPatientName) {
        return; // No action needed if patient name is not available
    }

    // Declare patient name list array
    String[] patientNameList = {"maheen", "morgan", "wahab", "summit", "jamal"};

    // Prompt for user's name
    Scanner input = new Scanner(System.in);
    System.out.println("What is your name?");
    String name = input.next();

    // Check if the user's name is in the patient name list
    boolean found = false;
    for (String patient : patientNameList) {
        if (name.equals(patient)) {
            found = true;
            break;
        }
    }

    // If the user is not in the list, add them
    if (!found) {
        // You may want to add the new patient name to a Set or List
        Set<String> patientSet = new HashSet<>();
        patientSet.add(name);
        System.out.println(patientSet.add(name));
    }
  }
//       //pre condition: father is not on the list
//       //post condition: match father name to patient.
        boolean isfatherName = true;

  public void fatherName() {
  //base case.
    if (!isfatherName) {
            return; // No action needed if father name is not available
        }

        // Get father name from the user.
        System.out.println("Enter the father's name:");
        String fatherName = input.next();
        System.out.println("The father's name is " + fatherName);

        // Declare father name list array.
        String[] fatherNameList = {"mudasir", "shoaib", "shakeel", "waleed", "hashim", "malik", "raman", "faraz", "nadeem"};

        // Check if the father's name is missing from the documents.
        boolean fatherNameFound = false;
        for (String name : fatherNameList) {
            if (name.equalsIgnoreCase(fatherName)) {
                fatherNameFound = true;
                break;
            }
        }

        if (!fatherNameFound) {
            // Add the missing father name to the documents.
            int emptyIndex = -1;
            for (int i = 0; i < fatherNameList.length; i++) {
                if (fatherNameList[i] == null) {
                    emptyIndex = i;
                    break;
                }
            }
            if (emptyIndex != -1) {
                // Add the missing father name to the documents.
                fatherNameList[emptyIndex] = fatherName;
                System.out.println("Added new father name: " + fatherName);
            }
          }
        }
          
            //pre condition: Mr No is not correct
            //post condition: if not correct generate Mr No using random number.
  boolean isMrNo = true;

  public void MrNo() {
      if (!isMrNo) {
          return;
      }
      //print from user.
    System.out.println("Enter generated MrNo");
    int MrNoInt = input.nextInt();

    System.out.println("the MrNo is " + MrNoInt);

      int[] MrNo = new int[6];
      // Assigning values to MrNo array
      MrNo[0] = 5782;
      MrNo[1] = 6794;
      MrNo[2] = 8251;
      MrNo[3] = 9348;
      MrNo[4] = 1935;
      MrNo[5] = 3463;
     
      // Loop through MrNo array to find the correct number
      boolean found = false;
      for (int num : MrNo) {
          if (num ==  MrNoInt) {
              found = true;
              break;
          }
      }

      if (!found) {
          // Generate a new MrNo if it doesn't exist in the array
          int randomNum = (int) (Math.random() * 101); // Generate random number between 0 and 100
          System.out.println("Generated MrNo: " + randomNum);

          // Add the generated MrNo to the list
          Set<Integer> MrNoSet = new HashSet<>();
          MrNoSet.add(randomNum);
          System.out.println(MrNoSet.add(randomNum));
      }
    }
    // pre condition: date is not correct in calander.
    // post condition: enter the corrected date for your appointment.
        boolean isDate = true;

        public void date() {
            if (!isDate) {
                return;
            }

            // Enter the correct day
            System.out.println("What day is it (Monday, Tuesday, etc.)?");
            String enteredDay = input.next();

            // Declare and initialize the days array
            String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

            // Check if the entered day is correct
            boolean isDayCorrect = false;
            for (String day : days) {
                if (day.equalsIgnoreCase(enteredDay)) {
                    isDayCorrect = true;
                    break;
                }
            }

            if (!isDayCorrect) {
                System.out.println("Entered day is incorrect!");
                return;
            }

            System.out.println("Entered day is correct: " + enteredDay);

            // Enter the correct month
            System.out.println("What month is it?");
            String enteredMonth = input.next();

            // Declare and initialize the months array
            String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

            // Check if the entered month is correct
            boolean isMonthCorrect = false;
            for (String month : months) {
                if (month.equalsIgnoreCase(enteredMonth)) {
                    isMonthCorrect = true;
                    break;
                }
            }

            if (!isMonthCorrect) {
                System.out.println("Entered month is incorrect!");
                return;
            }

            System.out.println("Entered month is correct: " + enteredMonth);

            // Enter the correct year
            System.out.println("What is the current year?");
            int year = input.nextInt();

            System.out.println("Entered year is: " + year);
      }
//     // pre condition: time is not correct.
//     // post condition: enter correct time wheather its am or pm.
    boolean istime = true;
          public int time() {
            if (!istime) {
                return 0; // Return a default value if time processing is disabled
            }

            // Enter whether the user wants AM or PM time
            System.out.println("Do you want AM time? (true/false)");
            boolean isAM = input.nextBoolean();

            // Process AM time
            if (isAM) {
                // Print available AM times
                System.out.println("Available AM times:");
                String[] AMTimes = {"1:00 AM", "2:00 AM", "3:00 AM", "4:00 AM", "5:00 AM", "6:00 AM", "7:00 AM", "8:00 AM", "9:00 AM", "10:00 AM", "11:00 AM"};
                for (String time : AMTimes) {
                    System.out.println(time);
                }
                // Check if the entered time is correct
                System.out.println("Enter the correct AM time:");
                String correctAMTime = input.next();
                for (String time : AMTimes) {
                    if (time.equals(correctAMTime)) {
                        return 1; // Return 1 if correct AM time is entered
                    }
                }
                return 0; // Return 0 if incorrect AM time is entered
            }

            // Process PM time
            else {
                // Print available PM times
                System.out.println("Available PM times:");
                String[] PMTimes = {"12:00 PM", "1:00 PM", "2:00 PM", "3:00 PM", "4:00 PM", "5:00 PM", "6:00 PM", "7:00 PM", "8:00 PM", "9:00 PM", "10:00 PM", "11:00 PM"};
                for (String time : PMTimes) {
                    System.out.println(time);
                }
                // Check if the entered time is correct
                System.out.println("Enter the correct PM time:");
                String correctPMTime = input.next();
                for (String time : PMTimes) {
                    if (time.equals(correctPMTime)) {
                        return 1; // Return 1 if correct PM time is entered
                    }
                }
                return 0; // Return 0 if incorrect PM time is entered
        }
      } 
//       // pre condition: NIC No doesn't match.
//       // post condition: enter the correct NIC No.
      boolean isNicNo = true;

     public void NICNo() {
      if (!isNicNo) {
          return;
      }

      // Generate a random NIC No
      int randomNICNo = (int) (Math.random() * 10000);

      // Print out the generated NIC No
      System.out.println("Generated NIC No: " + randomNICNo);

      // Add the generated NIC No to the set (assuming you have a set object initialized elsewhere)
      Set<Integer> NICNoSet = new HashSet<>();
      NICNoSet.add(randomNICNo);

      // Optionally, prompt the user to enter a NIC number
      System.out.println("Enter generated NIC No:");
      int enteredNICNo = input.nextInt();
    }
  
//   // pre condition: patient parents cant find the ward.
//   // post condition: the receptionist guides them wear to go.
  boolean isPatientWard = true;

  public int patientWard() {
      if (!isPatientWard) {
          return 0;
      }

      System.out.println("Enter the ward number");
      int patientWard = input.nextInt();

      // Compare the entered ward with predefined ward names
      if (patientWard == 1) {
          System.out.println("The patient is on the first floor");
        }
        else if (patientWard == 2) {
          System.out.println("The patient is on the second floor");
        } 
        else if (patientWard == 3) {
          System.out.println("The patient is on the third floor");
        } 
        else {
          System.out.println("Invalid ward entered");
        }
        return patientWard;
      }
//           // pre condition: patient is not ill.
//           // post condition:find out what ilness the patient has.
            boolean isPatientIllsArray = true;

            public String patientIllsArray() {
                // Base case
                if (!isPatientIllsArray) {
                    return null; // or return an appropriate default value
                }

                // Declare and initialize array
                String[] patientIllsArray = new String[3];
                patientIllsArray[0] = "fever";
                patientIllsArray[1] = "flu";
                patientIllsArray[2] = "blood pressure";

                // Print out the available illnesses
                System.out.println("Available illnesses:");
                for (String illness : patientIllsArray) {
                    System.out.println(illness);
                }

                // Prompt user for their illness
                System.out.println("Enter your illness:");
                String patientIllness = input.next();

                // Check if the patient's illness matches any of the predefined illnesses
                for (String illness : patientIllsArray) {
                    if (patientIllness.equalsIgnoreCase(illness)) {
                        return "You have " + illness;
                    }
                }
                // If no match found
                return "Invalid illness entered";
            }
//           // pre condition: doctor not found
//           // post condition: which doctor you want to see.
boolean isdoctor = true;
boolean ispatientIllness = true;
public String doctor(String fever) {
    // Base case
    if (!isdoctor && !ispatientIllness) {
        return null; // or return an appropriate default value
    }
    System.out.println("what is the patients illness");
    String patientIllness = input.next();

    System.out.println("the patient illness is " + patientIllness);
  
    System.out.println("Enter a doctor");
    String doctor = input.next();

    System.out.println("the doctor is " + doctor);
  
    // Declare and initialize array
    String[] doctors = {"Rashid", "Shaheer", "Ruqsar"};

    // Loop through the doctor array.
    for (int i = 0; i < doctors.length; i++) {
        // Apply conditions based on patient's illness
        if (patientIllness.equalsIgnoreCase("fever")) {
            if (doctors[i].equalsIgnoreCase("Rashid")) {
                return "Doctor Rashid";
            }
        } else if (patientIllness.equalsIgnoreCase("flu")) {
            if (doctors[i].equalsIgnoreCase("Shaheer")) {
                return "Doctor Shaheer";
            }
        } else {
            if (doctors[i].equalsIgnoreCase("Ruqsar")) {
                return "Doctor Ruqsar";
            }
        }
    }

    // Default message if no matching doctor found
    return "No doctor available for this illness";
  }
  // pre condition:feild not defined
  // post condition: choose correct feild
    boolean isField = true;

    public int field() {
        // Base case.
        if (!isField) {
            return 0;
        }

        // Declare fields array.
        int[] fields = new int[8];

        // Assign values.
        for (int i = 0; i < fields.length; i++) {
            fields[i] = i + 1;
        }

        // Print available fields.
        System.out.println("Available fields:");
        for (int field : fields) {
            System.out.print(field + " ");
        }
        System.out.println();

        // Prompt user to choose a field.
        System.out.println("Enter the field you choose:");
        int chosenField = input.nextInt();

        System.out.println("The chosen field is " + chosenField);
        return chosenField;
      }
    // //pre condition: barcode does not match.
    // //post condition: generate barcode and add to list.
      private boolean isBarcodeNo = true;

      public int barcodeNo() {
          // Base case.
          if (!isBarcodeNo) {
              return 0;
          }

          // Generate a random barcode number.
          Random random = new Random();
          int randomBarcode = random.nextInt(10000); // Generate a random integer between 0 and 9999.
          System.out.println("Generated barcode number: " + randomBarcode);

          // Declare and initialize barcode array.
          int[] barcode = {8691, 4762, 5593, 3397, 6439};

          // Check if the generated barcode matches any value in the barcode array.
          for (int i = 0; i < barcode.length; i++) {
              if (barcode[i] == randomBarcode) {
                  return randomBarcode;
              }
          }

          // If the generated barcode doesn't match any value in the barcode array, return -1.
          return -1;
        }
  }
