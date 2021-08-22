package hw7_1;

//Класс - автомобиль
public class Car {

    private String  model;
    private String  color;
    private int     year;       //год выпуска
    private double  engVolume;  //объем двигателя


    public Car()
    {
        this("неизвестно", "неизвестно", 0, 0 );
    }

    public Car(String  model)
    {
        this(model, "неизвестно", 0, 0 );
    }

    public Car(String  model, String  color, int year, double  engVolume)
    {
        setModel(model);
        setColor(color);
        setYear(year);
        setEngVolume(engVolume);
    }

    //Set
    public void setModel(String model)
    {
        this.model = model;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public void setYear(int year)
    {
        if(year >= 0) {
            this.year = year;
        }
    }

    //Get
    public String getModel()
    {
        return model;
    }

    public String getColor()
    {
        return color;
    }

    public int getYear()
    {
        return year;
    }

    public double getEngVolume()
    {
        return engVolume;
    }

    public void setEngVolume(double engVolume)
    {
        if (engVolume >= 0) {
            this.engVolume = engVolume;
        }
    }

    //
    public void info()
    {
        System.out.printf("Модель: %s \n", getModel() );
        System.out.printf("Год выпуска: %d \n", getYear());
        System.out.printf("Цвет: %s \n", getColor() );
        System.out.printf("Объем двигателя: %.1f л\n", getEngVolume() );
    }

    //Сравнение объектов Car
    public boolean equals(Car carCmp){
        boolean res = ( this.model.equals(carCmp.model)     &&
                        this.color.equals(carCmp.color)     &&
                        this.year == carCmp.year            &&
                        this.engVolume == carCmp.engVolume
                );
        return res;
    }

}
