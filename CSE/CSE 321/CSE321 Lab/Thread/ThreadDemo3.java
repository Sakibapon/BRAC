public class ThreadDemo3 implements Runnable{
  public String threadName = "";
  
   ThreadDemo3(String name){
    this.threadName = name;
  }
  
  public void run(){
    
    try{
      runMode();
      Thread.sleep(2000);
      wakeUp();
    }catch(Exception e){
      System.out.println("Error occured!!!");
    }
  }
  
  private void runMode(){
    System.out.println(threadName +": "
                  +"Yahooo I am in running mode");
  }
  
  private void wakeUp(){
    System.out.println(threadName +": "+
                  "Emmm got up from sleep");
  }
  
  public static void main(String args[]){
    Thread t1 = new Thread(new ThreadDemo3("One"));
    Thread t2 = new Thread(new ThreadDemo3("Two"));
    t1.start();
    t2.start();
  }
  
}