public class Date {
    private int month , day;
    public Date(int m , int d){
        this.month=m;
        this.day=d;
    }

    public int daysInMonth(){
        return day;
    }

    public int getDay(){
        return day;
    }

    public int getMonth(){
        return month;
    }

    public void nextDay(){
        day++;
        
    }

    public String toString(){
        return month + "/" + day;
    }

    public int absoluteDay(){
        return month*30+day;
    }

}
