public class CircularArray{
  Object[]cir;
  int start;
  int size;
  public CircularArray(Object[]lin, int st, int sz){
    start=st;
    size=sz;
    cir=new Object[lin.length];
    for(int i=0;i<size;i++,st=(st+1)%cir.length){
      cir[st]=lin[i];
    }
  }
  public void print(){
    for(int st=start,i=0;i<size;st=(st+1)%cir.length,i++){
      if(i==0) System.out.print("{"+cir[st]+", ");
      else if(i==size-1){
        System.out.println(cir[st]+"}");
        return;
      }
      else System.out.print(cir[st]+", ");
    }
    System.out.println("EMPTY LIST");
  }
  
  //This method will check whether the values of the circular array is following a palindromic sequence or not
  //Return true if yes; otherwise return false
  public boolean palindrome(){
    return false; //remove this line
  }
  
  //This method will check whether the values in the SPECIFIED RANGE of the circular array is following a palindromic sequence or not
  //Return true if yes; otherwise return false
  //Here, rangeStart and rangeEnd are the positions on the circular array starting from the index start. Position of start is 0 (zero)
  public boolean palindrome(int rangeStart, int rangeEnd){
    return false; //remove this line
  }
  
  //This method will check whether the first half of the values of the circular array is exact repetition of the second half or not
  //For this method, you can assume that, number of values will always be even.
  //Return true if yes; otherwise return false
  public boolean exactRepetition(){
    return false; //remove this line
  }
  
  //This method will check whether the first half of the values in the SPECIFIED RANGE of the circular array is exact repetition of the second half or not
  //For this method, you can assume that, number of values in the SPECIFIED RANGE will always be even.
  //Return true if yes; otherwise return false
  //Here, rangeStart and rangeEnd are the positions on the circular array starting from the index start. Position of start is 0 (zero)
  public boolean exactRepetition(int rangeStart, int rangeEnd){
    return false; //remove this line
  }
  
  //This method will check whether the values of the circular array is following a sorted sequence (either ascending or descending) or not
  //Return true if yes; otherwise return false
  public boolean sortCheck(){
    return false; //remove this line
  }
  
  //This method will check whether the values in the SPECIFIED RANGE of the circular array is following a sorted sequence (either ascending or descending) or not
  //Return true if yes; otherwise return false
  //Here, rangeStart and rangeEnd are the positions on the circular array starting from the index start. Position of start is 0 (zero)
  public boolean sortCheck(int rangeStart, int rangeEnd){
    return false; //remove this line
  }
}