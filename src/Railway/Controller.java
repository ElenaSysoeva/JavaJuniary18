package Railway;

import jdk.nashorn.internal.runtime.regexp.joni.constants.Arguments;

import javax.xml.crypto.Data;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

//абстрактный класс
public class Controller {
    ArrayList<City> list = new ArrayList<>();
    ArrayList<Part> listParts = new ArrayList<>();

    public void addCity(City c) {


        //добавлялись города;
        list.add(c);


    }

    public void linkCities(City a, City b) { ///выбрасывать исключения, если нет связи М-Н, тупой пользователь,е сли города нет в арэй листе
        if (a != b) {

            // array создать связи
            Part link = new Part(a, b);
            Part link2 = new Part(b, a);
            listParts.add(link);   //добавили города
            listParts.add(link2);
        } else {
            throw new IllegalArgumentException(); //если совпадает то обрабатываем ошибку
        }


    }

    public Boolean checkLink(City a, City b) {
        //проверить, что для пары  городов есть связь
        for (int i = 0; i < listParts.size(); i++) {
            if (listParts.get(i).a == a && listParts.get(i).b == b) {
                return true;
            }
        }


        return false;
    }

    public Trip createTrip(City cityFrom, City cityTo, String number, String dateDep) {

        String pattern = "HH:mm:ss dd.MM.yyyy";
        DateTimeFormatter format = DateTimeFormatter.ofPattern(pattern);
        LocalDateTime dateNew = LocalDateTime.parse(dateDep, format);
        LocalDateTime current = LocalDateTime.now();
        if (current.isAfter(dateNew))
        {
            throw new IllegalArgumentException("Дата не может быть меньше today"); //если false
        }

        return new Trip(cityFrom, cityTo, number, dateNew);
    }


}
//ДЗ стопы должны быть уникальными в рамках трипа,
//какой стоп после какого идет, какой стоп куда положить и (уникальный, по порядку)
//стопы в контроллере, коллекция. (ассациативный массив)
//добавляем стопы и то, что положили ()