/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 16101137
 */
public class tester {
    public static void main(String[]args){
     Parentheseschecker pc=new Parentheseschecker();
     String str= "1+2*(3/4)";
     char[] charArray=str.toCharArray();
     int numchar=charArray.length;
     System.out.println(numchar);
     boolean flag=true;
     int counter=0;
     for(int k=0;k<numchar;k ++){
         if(counter==0){
          if(charArray[k]==')'||charArray[k]=='}'||charArray[k]==']'){
           counter ++;
           break;
          }   
             
        }
     }
          
          if(charArray[k]=='('||charArray[k]=='{'||charArray[k]=']'){
            pc.push(charArray[i]);
          }
          else{
              if(charArray[k]==')'||charArray[k]=='}'||charArray[k]==']'){
                if(charArray[k]==')'){
                 if(pc.pop()=='('){
                  pc.remove();
                 }
               }   
                 if(charArray[k]==']'){
                 if(pc.pop()=='['){
                  pc.remove();
                    }
               }         
                 if(charArray[k]=='}'){
                 if(pc.pop()=='{'){
                  pc.remove();
              }
          }
        }
        
    }
    
}
