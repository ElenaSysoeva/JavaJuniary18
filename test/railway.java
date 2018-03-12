import Railway.City;
import Railway.Controller;
import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class railway {

    @Test
    public void test(){
        Boolean cat = false;
        try {
            City omsk = new City("Омск");
            Controller C = new Controller();
            C.addCity(omsk);
            C.linkCities(omsk, omsk);


        }catch (IllegalArgumentException e){
            cat = true;

        }

        Assert.assertTrue(cat);

    }



    @Test
    public void checkcity(){

        Controller C = new Controller();
        City msc = new City ("Москва");
        City omsk = new City("Омск");
        City nov = new City ("Новосибирск");
        C.addCity(msc);
        C.addCity(omsk);

        C.linkCities(msc, omsk); //связь
        Assert.assertTrue(C.checkLink(msc, omsk)); //возвращает False если не найдено в связях
        Assert.assertTrue(C.checkLink(omsk, msc));  //проверка

        Assert.assertFalse(C.checkLink(omsk, nov)); //проверка
        Assert.assertFalse(C.checkLink(msc, nov));  //проверка

    }

    @Test
    public void checkaddcity(){ //проверка добавляем один и тот же город => return false
     Controller C = new Controller();
    City nov1 = new City("Новосибирск") ;
    City nov2 = new City ("Новосибирск");
    Boolean rezult = false;

    try{
        C.addCity(nov1);
        C.addCity(nov2);
    }
    catch  (IllegalArgumentException e){

            rezult = true;
        }

        Assert.assertTrue(rezult);

    }
}
