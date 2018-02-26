import Railway.City;
import Railway.Controller;
import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class railway {

    @Test
    public void test(){

        Controller C = new Controller();
        City msc = new City ("Москва");
        City omsk = new City("Омск");
        C.addCity(msc);

        C.linkCities(msc, omsk);
        Assert.assertTrue(C.checkLink(msc, omsk));
        //ArrayList <City> List = new ArrayList<>();
        //City msc = new City ("Москва");
        //List.add(msc);

       // Assert.assertTrue(List.contains(msc)); //проверка
    }
}
