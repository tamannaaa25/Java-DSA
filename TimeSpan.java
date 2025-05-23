public class TimeSpan {
    private int hours,minutes;
    TimeSpan(int hours,int minutes){
        this.hours=hours;
        this.minutes=minutes;
        normalize();
    }

    public int getHours(){
        return hours;
    }

    public int getMinutes(){
        return minutes;
    }

    public void add(int hours, int minutes){
        this.hours+=hours;
        this.minutes+=minutes;
        normalize();
    }

    public void add(TimeSpan tp){
        this.add(tp.getHours(), tp.getMinutes());
    }

    public double getTotalHours() {
        return hours + (minutes / 60.0);
    }

    public String toString(){
        return hours + " Hours, " + minutes + " Minutes";
    }
    
     private void normalize() {
        if (minutes >= 60) {
            hours += minutes / 60;
            minutes = minutes % 60;
        }
    }
}
