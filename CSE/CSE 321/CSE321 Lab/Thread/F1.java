public class F1 extends Thread{
  private String threadName = "";
  
  F1(String name){
    this.threadName = name;
  }
  
  public synchronized void run(){
    for(int i=0; i<5; i++){
      System.out.println(threadName +" : "+ i);
     
    }
    
    
  }
  
  public static void main(String args[]){
  F1 t1 = new F1("One");
   F1 t2 = new F1("Two");
    t1.start();
    t2.start();
  }
}