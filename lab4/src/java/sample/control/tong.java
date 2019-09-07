package sample.control;

import java.io.Serializable;

public class tong implements Serializable {

    private int so1;
    private int so2;
    private int sum;

    public int getSo1() {
        return so1;
    }

    public void setSo1(int so1) {
        this.so1 = so1;
    }

    public int getSo2() {
        return so2;
    }

    public void setSo2(int so2) {
        this.so2 = so2;
    }

    public int getSum() {
        int tong = getSo1() + getSo2();
        return tong;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
