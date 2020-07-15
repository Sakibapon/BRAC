public class CircularArray{
    
    private int start;
    private int size;
    private Object [] cir;
    
    /*
     * if Object [] lin = {10, 20, 30, 40, null}
     * then, CircularArray(lin, 2, 4) will generate
     * Object [] cir = {40, null, 10, 20, 30}
     */
    public CircularArray(Object [] lin, int st, int sz){
        cir=new Object[lin.length];
        start=st;
        size=sz;
        int end=(st+sz-1)%lin.length;
        int check=start;
        for(int i=0; i<lin.length;i++){
            cir[check]=lin[i];
            check=(check+1)%cir.length;
        }
    }
    
    //Prints from index --> 0 to cir.length-1
    public void printFullLinear(){
        for(int i=0; i<cir.length; i++){
            if(i!=cir.length-1){
                System.out.print(cir[i]+",");
            }else{
                System.out.print(cir[i]+".");
            }
        }
        System.out.println();
    }
    
    // Starts Printing from index start. Prints a total of size elements
    public void printForward(){
        int j=start;
        for(int i=0; i<size; i++){
            if(i!=(size-1)){
                System.out.print(cir[j]+",");
                j=(j+1)%cir.length;
            }else{
                System.out.print(cir[j]+".");
            }
        }
        System.out.println();
    }
    public void printBackward(){
        int j=(start+size-1)%cir.length;
        for(int i=0; i<size; i++){
            if(i!=(size-1)){
                System.out.print(cir[j]+",");
                j=(j-1)%cir.length;
                if(j<0){
                    j=cir.length-1;
                }
                
            }else{
                System.out.print(cir[j]+".");
            }
        }
        System.out.println();
    }
    
// With no null cells
    public void linearize(){
        Object[] newLin= new Object[size];
        int j=start;
        for(int i=0; i<size; i++){
            newLin[i]=cir[j];
            j=(j+1)%cir.length;
        }
        cir=newLin;
    }
    
// Do not change the Start index
    public void resizeStartUnchanged(int newcapacity){
        Object[] cir2= new Object[newcapacity];
        int j=start;
        int k=start;
        for(int i=0; i<size; i++){
            cir2[j]=cir[k];
            j=(j+1)%cir2.length;
            k=(k+1)%cir.length;
        }
        cir=cir2;    
    }
    
// Start index becomes zero
    public void resizeByLinearize(int newcapacity){
        Object[] newLin=new Object[newcapacity];
        int j= start;
        for(int i=0; i<size; i++){
            newLin[i]=cir[j];
            j=(j+1)%cir.length;
        }
        cir=newLin;
    }
    
    /* pos --> position relative to start. Valid range of pos--> 0 to size.
     * Increase array length by 3 if size==cir.length
     * use resizeStartUnchanged() for resizing.
     */
    public void insertByRightShift(Object elem, int pos){
      if(size==cir.length){
        resizeStartUnchanged((cir.length+3));
      }
      for(int i=start+size;i>pos+1;i--){
          cir[i%cir.length]=cir[(i-1)%cir.length];
      }
      cir[start+pos]=elem;
      size++;
        
    }
    
    public void insertByLeftShift(Object elem, int pos){
        if(size==cir.length){
          resizeStartUnchanged(cir.length+3);
      }
      for(int i=0;i<=pos;i++){
          cir[(i+(start-1))%cir.length]=cir[(i+start)%cir.length];
      }
      cir[pos+start]=elem;
      size++;
      start--;
      if(start<0){
          start=cir.length-1;
      }
    }
    
    /* parameter--> pos. pos --> position relative to start.
     * Valid range of pos--> 0 to size-1
     */
    public void removeByLeftShift(int pos){
        for(int i=pos;i<size-1;i++){
          cir[(start+i)%cir.length]=cir[(start+i+1)%cir.length];
      }
      cir[(start+(size-1))%cir.length]=null;
      size--;
    }
    
    /* parameter--> pos. pos --> position relative to start.
     * Valid range of pos--> 0 to size-1
     */
    public void removeByRightShift(int pos){
        for(int i=start+pos;i>start;i--){
          cir[i%cir.length]=cir[(i-1)%cir.length];
      }
      cir[start%cir.length]=null;
      size--;
      start++;
    }
    
    
//This method will check whether the array is palindrome or not
    public void palindromeCheck(){
        int result=0;
      for(int i=0;i<size/2;i++){
          if(cir[(i+start)%cir.length]!=cir[(start+size-1-i)%cir.length]){
              result++;
              break;
          }
      }
      if(result==0){
          System.out.println("This array is a palindrome.");
      }else{
          System.out.println("This array is NOT a palindrome.");
      }
    }
    
    
//This method will sort the values by keeping the start unchanged
    public void sort(){
        for(int i=0;i<size-1;i++){
          int minPos=i+start;
          Object temp;
          for(int j=i+1;j<size;j++){
              if((int)cir[minPos%cir.length]>(int)cir[(j+start)%cir.length]){
                  minPos=j+start;
              }
          }
          temp=cir[(i+start)%cir.length];
          cir[(i+start)%cir.length]=cir[minPos%cir.length];
          cir[minPos%cir.length]=temp;
      }
    }
    
//This method will check the given array across the base array and if they are equivalent interms of values return true, or else return false
    public boolean equivalent(CircularArray k){
        boolean result=true;
      for(int i=0;i<size;i++){
          if(cir[(i+start)%cir.length]!=k.cir[(i+k.start)%k.cir.length]){
              result=false;
          }
      }
        return result; // Remove this line
    }
}