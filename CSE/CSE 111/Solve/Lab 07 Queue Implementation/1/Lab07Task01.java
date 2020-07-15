public class Lab07Task01{
     public static void main(String[] args){
          ArrayQueue name = new ArrayQueue();
          ArrayQueue id = new ArrayQueue();
          
          System.out.println("----------------------------------Register Patients----------------------------------");
          RegisterPatient(name, id, "Donald Trump");
          RegisterPatient(name, id, "Barrack Obama");
          RegisterPatient(name, id, "George W. Bush");
          
          System.out.println("----------------------------------Show all Patients----------------------------------");
          ShowAllPatient(name, id);
          
          System.out.println("----------------------------------Serve Patients----------------------------------");
          ServePatient(name, id);
          ServePatient(name, id);
          
          System.out.println("----------------------------------Show all Patients----------------------------------");
          ShowAllPatient(name, id);
          
          System.out.println("----------------------------------Serve Patients----------------------------------");
          ServePatient(name, id);
          ServePatient(name, id);
          
          System.out.println("----------------------------------Register Patients----------------------------------");
          RegisterPatient(name, id, "Bill Clinton");
          RegisterPatient(name, id, "George H. W. Bush");
          RegisterPatient(name, id, "Ronald Reagan");
          
          System.out.println("----------------------------------Show all Patients----------------------------------");
          ShowAllPatient(name, id);
          
          System.out.println("----------------------------------Cancel all appointments----------------------------------");
          CancelAll(name, id);
          
          System.out.println("----------------------------------Can doctor go home?----------------------------------");
          if (CanDoctorGoHome(name)) System.out.println("The doctor can go home");
          else System.out.println("The doctor cannot go home");
          
          System.out.println("----------------------------------Register Patients----------------------------------");
          RegisterPatient(name, id, "Jimmy Carter");
          
          System.out.println("----------------------------------Show all Patients----------------------------------");
          ShowAllPatient(name, id);
          
          System.out.println("----------------------------------Can doctor go home?----------------------------------");
          if (CanDoctorGoHome(name)) System.out.println("The doctor can go home");
          else System.out.println("The doctor cannot go home");
          
          System.out.println("----------------------------------Cancel all appointments----------------------------------");
          CancelAll(name, id);
          
          System.out.println("----------------------------------Register Patients----------------------------------");
          RegisterPatient(name, id, "Gerald Ford");
          RegisterPatient(name, id, "Richard Nixon");
          RegisterPatient(name, id, "Lyndon B. Johnson");
          
          System.out.println("----------------------------------Show all Patients----------------------------------");
          ShowAllPatient(name, id);
     }
     
     public static void RegisterPatient(ArrayQueue n, ArrayQueue id, String name){
          try {
               n.enqueue(name);
               id.enqueue(id.size() + 1);
               
               System.out.println(name + " is added to the patient queue with ID No. " + id.size());
          }catch(Exception e){
               System.out.println("Sorry, we have too many patients to deal with right now");
          }
     }
     
     public static void ServePatient(ArrayQueue n, ArrayQueue id){
          try {
               System.out.println(n.dequeue() + " with ID No. " + id.dequeue() + " is served");
          }catch(Exception e){
               System.out.println("Sorry, we have no patients to serve right now");
          }
     }
     
     public static void CancelAll(ArrayQueue n, ArrayQueue id){
          while(n.size() != 0){
               try{
                    n.dequeue();
                    id.dequeue();
               }catch(Exception e){}
          }
          
          System.out.println("All appointments are cancelled");
     }
     
     public static boolean CanDoctorGoHome(ArrayQueue n){
          if (n.isEmpty()) return true;
          return false;
     }
     
     public static void ShowAllPatient(ArrayQueue name, ArrayQueue ids){
          ArrayQueue n = new ArrayQueue();
          ArrayQueue id = new ArrayQueue();
          for(int i = 0 ; i < name.data.length ; i++){
               n.data[i] = name.data[i];
               id.data[i] = ids.data[i];
          }
          
          for(int j = 0 ; j + 1 < n.data.length ; j++){
               if (n.data[j] == null) continue;
               int low = j;
               for(int i = j + 1 ; i < n.data.length ; i++){
                    if (n.data[i] == null) continue;
                    if (n.data[i].toString().compareTo(n.data[low].toString()) < 0)
                         low = i;
               }
               Object temp = n.data[low];
               n.data[low] = n.data[j];
               n.data[j] = temp;
               temp = id.data[low];
               id.data[low] = id.data[j];
               id.data[j] = temp;
          }
          
          for(int i = 0 ; i < n.data.length ; i++){
               if (n.data[i] == null) continue;
               System.out.println(id.data[i] + "  " + n.data[i]);
          }
     }
}