public class main
{
  public static void main (String [] args)
  {
    Student john = new Student();
    Student mike = new Student();
    Student carol = new Student();
    
    john.setName("John Watson");
    john.setID("17101927");
    john.setAddress("221B Baker Street");
    john.setCGPA(4.00);
    
    mike.setName("Mike Hannigan");
    mike.setID("17102004");
    mike.setAddress("Central Perk");
    mike.setCGPA(3.59);
    
    carol.setName("Carol Smith");
    carol.setID("17101996");
    carol.setAddress("Downtown avenue");
    carol.setCGPA(2.99);
    
    System.out.println(john.getName());
    System.out.println(john.getAddress());
    System.out.println(john.getID());
    System.out.println(john.getCGPA());
    System.out.println(mike.getName());
    System.out.println(mike.getAddress());
    System.out.println(mike.getID());
    System.out.println(mike.getCGPA());
    System.out.println(carol.getName());
    System.out.println(carol.getAddress());
    System.out.println(carol.getID());
    System.out.println(carol.getCGPA());
    
  }
}