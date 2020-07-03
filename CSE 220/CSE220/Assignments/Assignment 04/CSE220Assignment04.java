import java.util.Scanner;
import java.util.Stack;//you should use the stack you have built in assignment 03. If you are using your own stack, remove this line; otherwise, import & use java's default stack class.
public class CSE220Assignment04{
  public static String postFixBuilder(String s){
    //TODO
    return null; //remove this line
  }
  public static int postFixEvaluator(String s){
    //TODO
    return 12345; //remove this line
  }
  public static void main(String[]args){
    String exp=new Scanner(System.in).next();
    String postFixExp = postFixBuilder(exp);
    System.out.println("Post Fix Expression: "+postFixExp);
    int result = postFixEvaluator(postFixExp);
    System.out.println("Answer: "+result);
  }
}