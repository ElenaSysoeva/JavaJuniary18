package Lab14.task2662;

public class Interval {
    public int a;
    public int b ;
    public Integer c;



    public Interval (int a, int b)
    {
      this.a = a;
      this.b =b;

    }

    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Interval inter = (Interval) obj;
        if (a != inter.a) return false;

        return true;
    }

}
