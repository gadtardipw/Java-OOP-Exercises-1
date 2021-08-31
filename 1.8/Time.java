public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second)  {
        this.second =second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString() {
        return String.format("%02d", hour) + ":" + String.format("%02d", minute) + ":" + String.format("%02d", second);
    }

    public Time nextSecond() {
        if (this.second == 59) {
            this.second = 0;
            this.minute = this.minute + 1;
        }
        else {
         this.second = this.second + 1;   
        }
        return this;
    }

    public Time previousSecond() {
        if (this.second == 0) {
            this.second = 0;
            this.minute = this.minute - 1;
        }
        else {
         this.second = this.second + 1;   
        }
        return this;
    }

}