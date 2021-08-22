package hw7_1;

//Класс - государство
public class State {
    private  String  name;               //название
    private String   capitalCity;        //столица
    private double   populationMln;       //население млн. чел.
    private double   area;               //площадь км2

    public State(){
        this("неизвестно", "неизвестно", 0, 0);
    }

    public State(String  name){
        this(name, "неизвестно", 0, 0);
    }

    public State(String  name, String  capitalCity, double populationMln, double  area){
        setName(name);
        setCapitalCity(capitalCity);
        setPopulationMln(populationMln);
        setArea(area);
    }


    //Set
    public void setName(String name) {
        this.name = name;
    }

    public void setCapitalCity(String capitalCity) {
        this.capitalCity = capitalCity;
    }

    public void setPopulationMln(double populationMln) {
        if(populationMln >= 0) {
            this.populationMln = populationMln;
        }
    }

    public void setArea(double area) {
        if (area >= 0) {
            this.area = area;
        }
    }

    //Get
    public String getName() {
        return name;
    }

    public String getCapitalCity() {
        return capitalCity;
    }

    public double getPopulationMln() {
        return populationMln;
    }

    public double getArea() {
        return area;
    }

    //
    public void info()
    {
        System.out.printf("%s \n", getName() );
        System.out.printf("Столица: %s \n", getCapitalCity() );
        System.out.printf("Население: %.3f млн. чел. \n", getPopulationMln());
        System.out.printf("Площадь: %.1f км2 \n", getArea() );
    }

    //Сравнение объектов State
    public boolean equals(State stateCmp){
        boolean res = ( this.name.equals(stateCmp.name)         &&
                this.capitalCity.equals(stateCmp.capitalCity)   &&
                this.populationMln == stateCmp.populationMln    &&
                this.area == stateCmp.area
        );
        return res;
    }


}
