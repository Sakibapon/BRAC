public class Thread1 extends Thread{
  private String threadName = "";
  
  ThreadDemo2(String name){
    this.threadName = name;
  }
  
  public synchronized void run(){
    for(int i=0; i< 10; i++){
      System.out.println(threadName +" : "+ i);
     
    }
    
    
  }
  
  public static void main(String args[]){
    Thread1 t1 = new Thread1("One");
    Thread1 t2 = new Thread1("Two");
    t1.start();
    t2.start();
  }
}