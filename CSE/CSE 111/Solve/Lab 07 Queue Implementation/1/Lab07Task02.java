public class Lab07Task02{
     public static void main(String[] args){
          ListQueue name = new ListQueue();
          ListQueue id = new ListQueue();
          
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
     
     public static void RegisterPatient(ListQueue n, ListQueue id, String name){
          try {
          n.enqueue(name);
          id.enqueue(id.size() + 1);
          
          System.out.println(name + " is added to the patient queue with ID No. " + id.size());
          }catch(Exception e){
               System.out.println("Sorry, we have too many patients to deal with right now");
          }
     }
     
     public static void ServePatient(ListQueue n, ListQueue id){
          try {
          System.out.println(n.dequeue() + " with ID No. " + id.dequeue() + " is served");
          }catch(Exception e){
               System.out.println("Sorry, we have no patients to serve right now");
          }
     }
     
     public static void CancelAll(ListQueue n, ListQueue id){
          while(n.size() != 0){
               try{
               n.dequeue();
               id.dequeue();
               }catch(Exception e){}
          }
          
          System.out.println("All appointments are cancelled");
     }
     
     public static boolean CanDoctorGoHome(ListQueue n){
          if (n.isEmpty()) return true;
          return false;
     }
     
     public static void ShowAllPatient(ListQueue name, ListQueue ids){
          ListQueue n = new ListQueue();
          n.front = new Node(name.front.val, null);
          n.rear = n.front;
          ListQueue id = new ListQueue();
          id.front = new Node(ids.front.val, null);
          id.rear = id.front;
          for(Node i = name.front.next, j = ids.front.next ; i != null ; i = i.next, j = j.next){
               Node k = new Node(i.val, null);
               n.rear.next = k;
               n.rear = k;
               Node l = new Node(j.val, null);
               id.rear.next = l;
               id.rear = l;
          }
          
          for(Node i = n.front, k = id.front ; i.next != null ; i = i.next, k = k.next){
               for(Node j = i.next, l = k.next ; j != null ; j = j.next, l = l.next){
                    if (i.val.toString().compareTo(j.val.toString()) > 0){
                         Object temp = i.val;
                         i.val = j.val;
                         j.val = temp;
                         temp = k.val;
                         k.val = l.val;
                         l.val = temp;
                    }
               }
          }
          
          for(Node i = n.front, j = id.front ; i != null ; i = i.next, j = j.next)
               System.out.println(j.val + "  " + i.val);
     }
}