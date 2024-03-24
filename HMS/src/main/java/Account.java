import java.util.*;
class Account {
  
 public String Account;
  Scanner input = new Scanner(System.in);
  boolean isAvailable = true; // Assume appointment is available initially

  public int scheduleAppointment() {
      // Base case: If appointment is available, schedule it
      if (!isAvailable) {
          System.out.println("Appointment scheduled successfully.");
          // You may want to return something meaningful here
          return 0; // Or any other meaningful value
      } else {
          // Enter the day you want the appointment for
          System.out.println("What day do you want your appointment to be?");
          int day = input.nextInt();

          System.out.println("the day that your appointment is on is " + day);

          // Enter the time that you want your appointment to be for
          System.out.println("What time do you want the appointment to be?");
          int time = input.nextInt();

          System.out.println("the time that your appointment is on is " + time);

          // You may want to perform further actions based on day and time
          return day + time;
      }
      }
        // pre condition: does the time match.
        // post condition: if it matches return true if it doesn't get a time that matches.
       boolean isDrtimeAvailable = true; 
        public int DrTimeMatch() {
          //base case.
         
          if (!isDrtimeAvailable) {
            return 0;
          }
          else {
            //get a time and day that matches.
            System.out.println("Enter a day");
            int day = input.nextInt();

            System.out.println("the day was " + day);

            //get a time that matches.
            System.out.println("Enter a time");
            int time = input.nextInt();

            System.out.println("the time was " + time);

            return day+time;
          }
        }
          //pre condition: if you have not paid yet.
          //post condition: whether its prepaid if not how would you like to pay.
          boolean isAppointmentfees = true;
          public int Appointmentfees() {
            //base case.
            if (!isAppointmentfees) {
              return 0;
            }
            else  {
              //ask the patient how would you like to pay.
              System.out.println("how would you like to pay");
              String pay = input.next();

              System.out.println("i would like to pay with " + pay);
        
              System.out.println("Amount has already been paid");
              return 0;
            }
          }
          //pre condition: if patient does not like the options.
          //post condition: choose one of 
              boolean isFeesOption = true;
               public String[] feesOption() {
                   // Base case: if fees option is not available
                  if (!isFeesOption) {
                       return new String[0]; // return an empty array
                   }

                   // Declare and initialize the fees options array
                   String[] feesOptions = {"online", "card option", "cash option", "get received"};

                   // Print out the available fees options
                   System.out.println("The fees options available for payment are:");
                   for (String option : feesOptions) {
                       System.out.println(option);
                   }    
                  return feesOptions;
                }
}