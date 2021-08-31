public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int newDay) {
        this.day = newDay;
    }

    public void setMonth(int newMonth) {
        this.month = newMonth;
    }

    public void setYear(int newYear) {
        this.year = newYear;
    }

    public void setDate(int newDay, int newMonth, int newYear) {
        this.day = newDay;
        this.month = newMonth;
        this.year = newYear;
    }

    public String toString() {
        return String.format("%02d", day) + "/" + String.format("%02d", month) + "/" + year;
    }
}