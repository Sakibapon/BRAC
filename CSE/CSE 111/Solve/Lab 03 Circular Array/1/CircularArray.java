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
    start =st;
    size=sz;
    cir=new Object[lin.length];
    
    for(int i=0;i<sz;i++){
    	cir[st]=lin[i];
    	st=(st+1)%cir.length;
    }
  }
  
  //Prints from index --> 0 to cir.length-1
  public void printFullLinear(){
        for(int i=0;i<cir.length;i++){
        	System.out.print(cir[i]+" ");
        }
        System.out.println();
  }
  
  // Starts Printing from index start. Prints a total of size elements
  public void printForward(){
    int index=start;
    for(int i=0;i<size;i++){
    	System.out.print(cir[index]+" ");
    	index=(index+1)%cir.length;
    }
    System.out.println();
  }
  
  
  public void printBackward(){
	  int index=(start+(size-1))%cir.length;
	    for(int i=0;i<size;i++){
	    	if(index<0){
	    		index=cir.length-1;
	    	}
	    	System.out.print(cir[index]+" ");
	    	index=(index-1)%cir.length;
	    }
	    
  }
  
  // With no null cells
  public void linearize(){
    Object[] newArray=new Object[size];
    int indx=start;
    
    for(int i=0;i<size;i++){
    	newArray[i]=cir[indx];
    	indx=(indx+1)%cir.length;
    }
    cir=newArray;
  }
  
  // Do not change the Start index
  public void resizeStartUnchanged(int newcapacity){
    Object[] newArray=new Object[newcapacity];
    int indx=start;
    int indx2=start;
    
    for(int i=0;i<size;i++){
    	newArray[indx2]=cir[indx];
    	indx=(indx+1)%cir.length;
    	indx2=(indx2+1)%newArray.length;
    }
    
    cir=newArray;
  }
  
  // Start index becomes zero
  public void resizeByLinearize(int newcapacity){
    Object[] newArray=new Object[newcapacity];
    int indx=start;
    
    for(int i=0;i<size;i++){
    	newArray[i]=cir[indx];
    	indx=(indx+1)%cir.length;
    }
    cir=newArray;
  }
  
  /* pos --> position relative to start. Valid range of pos--> 0 to size.
   * Increase array length by 3 if size==cir.length
   * use resizeStartUnchanged() for resizing.
   */
  public void insertByRightShift(Object elem, int pos){
	  if(size==cir.length){
	        resizeStartUnchanged(cir.length+3);
	    }
	    for(int i=start+size;i>start+pos;i--){
	        cir[i%cir.length]=cir[(i-1)%cir.length];
	    }
	    cir[(start+pos)%cir.length]=elem;
	    size++;
	  
  }
  
  public void insertByLeftShift(Object elem, int pos){
	  if(size==cir.length){
	    	resizeStartUnchanged(cir.length+3);
	    }
	    for(int i=((start+(cir.length-1))%cir.length);i<start+pos;i++){
	    	cir[i%cir.length]=cir[(i+1)%cir.length];
	    }
	    cir[(start+pos)%cir.length]=elem;
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
    for(int i=start+pos;i<start+size-1;i++){
    	cir[i%cir.length]=cir[((i+1)%cir.length)];
    }
    cir[(start+size-1)%cir.length]=null;
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
    start++;
    size--;
  }
  
  
  //This method will check whether the array is palindrome or not
  public void palindromeCheck(){
    int flag=0;
    for(int i=0;i<size/2;i++){
    	if(cir[(start+i)%cir.length]!=cir[(((start+size-1)-i)%cir.length)]){
    	flag=1;
    	break;
    	}
    	else{
    		continue;
    	}
    }
    if(flag==1){
    	System.out.println("This array is NOT a palindrome.");
    }
    else{
    	System.out.println("This array is a palindrome.");
    }
  }
  
  
  //This method will sort the values by keeping the start unchanged
  public void sort(){
    Object temp;
    for(int i=1;i<=size;i++){
    	for(int j=start;j<start+size-i;j++){
    		if((int)cir[j%cir.length]>(int)cir[(j+1)%cir.length]){
    			temp=cir[j%cir.length];
    			cir[j%cir.length]=cir[(j+1)%cir.length];
    			cir[(j+1)%cir.length]=temp;
    		}
    	}
    }
    
  }
  
  //This method will check the given array across the base array and if they are equivalent interms of values return true, or else return false
  public boolean equivalent(CircularArray k){
    boolean flag=true;
    for(int i=0;i<size;i++){
    	if(cir[(start+i)%cir.length]!=k.cir[((k.start+i)%(k.cir.length))]){
    	flag=false;
    	break;
    	}
    }
    return flag;
  }
  
  public Object secondLastNeg(){
	  int lastindx=(start+size-1)%cir.length;
	  
	  for(int i=0;i<size;i++,lastindx=(lastindx-1)%cir.length){
		  if(lastindx<0){
			  lastindx=cir.length-1;
		  }
		  if((int)cir[lastindx]<0){
			  cir[lastindx]=0;
			  break;
		  }
	  }
	  lastindx=(start+size-1)%cir.length;
	  for(int i=0;i<size;i++,lastindx=(lastindx-1)%cir.length){
		  if(lastindx<0){
			  lastindx=cir.length-1;
		  }
		  if((int)cir[lastindx]<0){
			  return cir[lastindx];
		  }
	  }
	  
	  
	  return 7;
  }
  
  
}