package com.company.polynoms;

public class FirstOrSecond {
    private int i;
    private int firstOrSecond;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int isFirstOrSecond() {
        return firstOrSecond;
    }

    public void setFirstOrSecond(int firstOrSecond) {
        this.firstOrSecond = firstOrSecond;
    }


    public FirstOrSecond(int i, int firstOrSecond) {
        this.i = i;
        this.firstOrSecond = firstOrSecond;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof FirstOrSecond)) {
            return false;
        }

        FirstOrSecond fc = (FirstOrSecond) obj;
        return (fc.i == this.i && fc.firstOrSecond == this.firstOrSecond);
    }

    @Override
    public int hashCode() {
        return -(firstOrSecond) * i;
    }
}
