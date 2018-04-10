package Lab14.task5449;

/**
 * @author akryukov
 *         17.07.2017
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String print(){
        return "(" + x + ";" + y + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //одинаковые ссылки, не объекты
        if (o == null //если другой объект существует
                || getClass() != o.getClass()) return false; // возвращает класс, если классы разные то объекты разные

        Point point = (Point) o; //явное преобразование, явное прев-е типа

        if (x != point.x) return false;//сравнение приватных полей объектов
        return y == point.y;

    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}
