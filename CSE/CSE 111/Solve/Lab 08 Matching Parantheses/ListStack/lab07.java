import java.util.Scanner;
public class lab07{
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  String s=sc.nextLine();
  char[]c=s.toCharArray();
  ArrayStack s1=new ArrayStack();
  ArrayStack s2=new ArrayStack();
  boolean flag=true;
  for(int i=0;i<c.length;i++){
    try{
    
     if(c[i]=='('||c[i]=='{'||c[i]=='['){
    s1.push(c[i]);
    s2.push(i);
    }
    else if(c[i]==')'||c[i]=='}'||c[i]==']'){
      if(s1.isEmpty()==true){
        flag=false;
       System.out.println("Thre Expression is not correct.\n"+"Error at character #"+(i+1)+" "+c[i]+"- not not opened.");
      break;
      }
      else{
        if(c[i]==')'){
          char temp=(char)s1.pop();
          int p=(int)s2.pop();
           if(temp!='('){
             flag=false;
          System.out.println("This Expression is NOT correct.\nError at Charecter #"+(p+1)+" "+ temp+" not closed.");
          break;
           }
          
         
        }
        
        else if(c[i]=='}'){
          char temp=(char)s1.pop();
          int p=(int)s2.pop();
           if(temp!='{'){
             flag=false;
          System.out.println("This Expression is NOT correct.\nError at Charecter #"+(p+1)+" "+ temp+" not closed.");
          break;
           }
          
         
        }
        
        else if(c[i]==']'){
          char temp=(char)s1.pop();
          int p=(int)s2.pop();
           if(temp!='['){
             flag=false;
          System.out.println("This Expression is NOT correct.\nError at Charecter #"+(p+1)+" "+ temp+" not closed.");
          break;
           }
          
         
        }
      }
    }
    }
  
  catch(Exception e){}
  }
  if(flag==true){
  System.out.println("This Expression is correct.");
  }
  }
}
