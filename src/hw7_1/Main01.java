/*
. Создать три класса(любые: автомобиль, собака, государство)
Реализовать метод info - печатает на консоль.
В main создать по три объекта каждого.
Демонстрация метода info.

1. Добавить в свои классы конструкторы(по три штуки)
2. Добавить инкапсуляцию(сетеры и гетеры)
3. Создать методы для сравнения данных в объектах

 */
package hw7_1;

public class Main01 {
    public static void main(String[] args) {

        //Создание объектов и их заполнение (без использования конструктора)
        //Государства
        State   state1 = new State();
        State   state2 = new State("ФРГ");
        State   state3 = new State("Монголия", "Улан-Батор", 3.25, 1_564_116 );
        State   state4 = new State("Монголия", "Улан-Батор", 3.25, 1_564_116 );

        System.out.println("\n---ГОСУДАРСТВА---");
        System.out.println("Государство 1");
        state1.info();

        System.out.println();
        System.out.println("Государство 2");
        state2.info();

        System.out.println();
        System.out.println("Государство 3");
        state3.info();

        System.out.println();
        System.out.println("Государство 4");
        state4.info();

        System.out.println();
        System.out.println("Сравнение государств 2 и 3: " + state2.equals(state3));
        System.out.println("Сравнение государств 3 и 4: " + state3.equals(state4));

        //Автомобили
        Car car1 = new Car();
        Car car2 = new Car("Daewoo Lanos");
        Car car3 = new Car("BMW 520", "черный", 1989, 2.0 );
        Car car4 = new Car("BMW 520", "черный", 1989, 2.0 );

        System.out.println("\n---АВТОМОБИЛИ---");
        System.out.println("Автомобиль 1");
        car1.info();

        System.out.println();
        System.out.println("Автомобиль 2");
        car2.info();

        System.out.println();
        System.out.println("Автомобиль 3");
        car3.info();

        System.out.println();
        System.out.println("Автомобиль 4");
        car4.info();

        System.out.println();
        System.out.println("Сравнение автомобилей 2 и 3: " + car2.equals(car3));
        System.out.println("Сравнение автомобилей 3 и 4: " + car3.equals(car4));


        //Собаки
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("Тузик");
        Dog dog3 = new Dog("Фриц", "немецкая овчарка", 8, true);
        Dog dog4 = new Dog("Фриц", "немецкая овчарка", 8, true);

        System.out.println("\n---СОБАКИ---");
        System.out.println("Собака 1");
        dog1.info();

        System.out.println();
        System.out.println("Собака 2");
        dog2.info();

        System.out.println();
        System.out.println("Собака 3");
        dog3.info();

        System.out.println();
        System.out.println("Собака 4");
        dog4.info();

        System.out.println();
        System.out.println("Сравнение собак 2 и 3: " + dog2.equals(dog3));
        System.out.println("Сравнение собак 3 и 4: " + dog3.equals(dog4));

    }
}
