class Date{
    
    private int month;
    private int day;
    private int year;
    
    public Date(int m, int d, int y){
        
        if(m > 0 && m <= 12){
            this.month = m;
            
        }
        
        else{
            this.month = 1;
        }
        
        if(d > 0 && d <= 30){
            this.day = d;
            
        }
        else{
            this.day = 1;
        }
        
        if(y >= 0){
            this.year = y;
        }
        else{
            this.year = 2017;
        }
        
    }
    
    int getMonth(){
        return month;
    }
    
    void setMonth(int m){
        if(m > 0 && m <= 12)
        this.month = m;
        else
            this.month = 1;
    }
    
    int getDay(){
        return day;
    }
    
    void setDay(int d){
        if(d > 0 && d <= 30)
        this.day = d;
        else day = 1;
    }
    
    int getYear(){
        return year;
    }
    
    void setYear(int y){
        if(y > 0)
        this.year = y;
        else this.year = 2017;
    }
    
    public void displayDate(){
        System.out.print(getDay() + "/" + getMonth() + "/" + getYear());
    }
    
    
}