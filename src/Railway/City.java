package Railway;

//Справочник
public class City {
    String Name;

    public City(String name) {
        this.Name = name;

    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } ;
        if (o == null){
            return false;
        }
        if (this.getClass() != o.getClass())
        {
            return false;
        }


        return false;
    }
}
