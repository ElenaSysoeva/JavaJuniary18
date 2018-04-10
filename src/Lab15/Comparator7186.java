package Lab15;

import java.util.Comparator;

public class Comparator7186 implements Comparator<Integer> {
    int number;

    public Comparator7186(int n) {
        this.number = n;
    }


    @Override
    public int compare(Integer o1, Integer o2) {
        int number = this.number;

        int d1 = Math.abs(o1 - number);
        int d2 = Math.abs(o2 - number);
        if (d1 > d2) {
            return 1;
        } else if (d1 == d2) {
            return 0;
        } else {
            return -1;
        }
    }


}



