public class Main{
  public static void main(String args[]){
    
    BankAccount acc1 = new BankAccount ();
    BankAccount acc2 = new BankAccount ();
    BankAccount acc3 = new BankAccount ();
    
    acc1.setName("Jubaer");
    acc2.setName("Talha");
    acc3.setName("Nahid");
    
    acc1.setAddress("Mohakhali");
    acc2.setAddress("Gulshan");
    acc3.setAddress("Banani");
    
    acc1.setAccountID("123");
    acc2.setAccountID("456");
    acc3.setAccountID("789");
    
    acc1.setBalance(20000);
    acc2.setBalance(25000);
    acc3.setBalance(30000);
    
    acc1.addInterest();
    acc3.addInterest();
    
    System.out.println(acc1.getName());
    System.out.println(acc1.getAddress());
    System.out.println(acc1.getAccountID());
    System.out.println(acc1.getBalance());
    System.out.println();
    
    System.out.println(acc2.getName());
    System.out.println(acc2.getAddress());
    System.out.println(acc2.getAccountID());
    System.out.println(acc2.getBalance());
    System.out.println();
    
    System.out.println(acc3.getName());
    System.out.println(acc3.getAddress());
    System.out.println(acc3.getAccountID());
    System.out.println(acc3.getBalance());
    
  }
}
