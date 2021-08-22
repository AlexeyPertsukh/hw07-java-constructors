package hw7_1;

//Класс - собака
public class Dog {
    private String  nickname;       //кличка
    private String  breed;          //порода
    private double  weight;         //вес
    private boolean isVaccina;        //прививки

    public Dog()
    {
        this("неизвестно", "неизвестно", 0, false);
    }

    public Dog(String  nickname)
    {
        this(nickname, "неизвестно", 0, false);
    }

    public Dog(String  nickname, String  breed, double  weight, boolean isVaccina){
        setNickname(nickname);
        setBreed(breed);
        setWeight(weight);
        setVaccina(isVaccina);
    }

    //Set
    public void setNickname(String nickname)
    {
        this.nickname = nickname;
    }

    public void setBreed(String breed)
    {
        this.breed = breed;
    }

    public void setWeight(double weight)
    {
        if (weight >= 0) {
            this.weight = weight;
        }
    }

    public void setVaccina(boolean isVaccina)
    {
        this.isVaccina = isVaccina;
    }

    //Get
    public String getNickname()
    {
        return nickname;
    }

    public String getBreed()
    {
        return breed;
    }

    public double getWeight()
    {
        return weight;
    }

    public boolean getIsVaccina()
    {
        return isVaccina;
    }

    //
    public void info()
    {
        String vacStr = getIsVaccina() ? "есть" : "нет";

        System.out.printf("Кличка: %s \n",   getNickname() );
        System.out.printf("Порода: %s \n",   getBreed() );
        System.out.printf("Вес: %.1f кг \n", getWeight() );
        System.out.printf("Прививки: %s \n", vacStr );
    }

    //Сравнение объектов Dog
    public boolean equals(Dog dogCmp){
        boolean res = ( this.nickname.equals(dogCmp.nickname)   &&
                this.breed.equals(dogCmp.breed)                 &&
                this.weight == dogCmp.weight                    &&
                this.isVaccina == dogCmp.isVaccina
        );
        return res;
    }

}
