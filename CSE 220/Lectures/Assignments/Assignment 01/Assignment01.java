public class Assignment01{
  public static void main(String[]args){
    
    System.out.println("TEST 01");
    Object[]a1={10,20,30,10,10,null,null};
    Object[]a2={10,20,30,20,10,null,null};
    CircularArray c1=new CircularArray(a1,5,5);
    CircularArray c2=new CircularArray(a2,2,5);
    c1.print();//output: {10, 20, 30, 10, 10}
    System.out.println(c1.palindrome());//output: false
    c2.print();//output: {10, 20, 30, 20, 10}
    System.out.println(c2.palindrome());//output: true
    
    
    System.out.println("\nTEST 02");
    Object[]a3={50,10,20,30,20,100,null,null};
    Object[]a4={10,20,30,20,10,null,null};
    CircularArray c3=new CircularArray(a3,5,6);
    CircularArray c4=new CircularArray(a4,2,5);
    c3.print();//output: {50, 10, 20, 30, 20, 100}
    System.out.println(c3.palindrome(2,4));//output: true
    c4.print();//output: {10, 20, 30, 20, 10}
    System.out.println(c4.palindrome(1,4));//output: false
    
    System.out.println("\nTEST 03");
    Object[]a5={50,10,20,50,10,20,null,null};
    Object[]a6={10,20,20,10,null,null};
    CircularArray c5=new CircularArray(a5,2,6);
    CircularArray c6=new CircularArray(a6,0,4);
    c5.print();//output: {50, 10, 20, 50, 10, 20}
    System.out.println(c5.exactRepetition());//output: true
    c6.print();//output: {10, 20, 20, 10}
    System.out.println(c6.exactRepetition());//output: false
    
    System.out.println("\nTEST 04");
    Object[]a7={50,10,20,50,10,20,null,null};
    Object[]a8={10,20,20,10,null,null};
    CircularArray c7=new CircularArray(a7,2,6);
    CircularArray c8=new CircularArray(a8,0,4);
    c7.print();//output: {50, 10, 20, 50, 10, 20}
    System.out.println(c7.exactRepetition(1,4));//output: false
    c8.print();//output: {10, 20, 20, 10}
    System.out.println(c8.exactRepetition(1,2));//output: true
    
    //Write the TEST 05 & TEST 06 for sortCheck() & sortCheck(int rangeStart, int rangeEnd) respectively.
  }
}