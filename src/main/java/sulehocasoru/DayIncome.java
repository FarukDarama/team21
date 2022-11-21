package sulehocasoru;

public class DayIncome {
    String dayName;
    int income;

    public DayIncome(String dayName, int income) {
        this.dayName = dayName;
        this.income = income;
    }

    public DayIncome() {
        this.dayName = "";
        this.income =0;
    }

    public String getDayName() {
        return dayName;
    }

    public void setDayName(String dayName) {
        this.dayName = dayName;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    @Override
    public String toString() {
        return "DayIncome{" +
                "dayName='" + dayName + '\'' +
                ", income=" + income +
                '}';
    }
}
