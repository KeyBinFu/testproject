package com.fubin.code;

public class Mydate implements Comparable<Mydate>{

    private int year;
    private int moth;
    private int day;

    public Mydate(int year, int moth, int day) {
        this.year = year;
        this.moth = moth;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMoth() {
        return moth;
    }

    public void setMoth(int moth) {
        this.moth = moth;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Mydate{" +
                "year=" + year +
                ", moth=" + moth +
                ", day=" + day +
                '}';
    }

    @Override
    public int compareTo(Mydate o) {
        if(year - o.getYear() != 0){
            return year - o.getYear();
        }
        if(moth - o.getMoth() != 0){
            return moth - o.getMoth();
        }
        return day-o.getDay();
    }
}
