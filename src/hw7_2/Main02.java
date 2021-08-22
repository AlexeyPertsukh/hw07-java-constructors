/*
* Создать массив из телефонов.
Пройтись циклом по массиву и вызвать у
каждого телефона метод info;

1. Добавить в свои классы конструкторы(по три штуки)
2. Добавить инкапсуляцию(сетеры и гетеры)
3. Создать методы для сравнения данных в объектах


 */

package hw7_2;

public class Main02 {

    public static void main(String[] args) {

        //иницализация массива объектов
        Phone[] phones = new Phone[6];


        //заполнение массива объектов (без использования конструктора)
        phones[0] = new Phone();
        phones[1] = new Phone("2E E450A 2018");
        phones[2] = new Phone( "Galaxy S21 5G", 6.2, 8, 128, 4000);
        phones[3] = new Phone( "Galaxy S21 5G", 6.2, 8, 128, 4000);
        phones[4] = new Phone( "Nokia 1.3", 5.71, 1, 16, 3000);
        phones[5] = new Phone("Lenovo K520", 5.7, 4, 32, 3000);


        //Вывод на печать через метод info()
        System.out.println("Массив объектов класса Телефон");
        System.out.println("------------------------------");

        for (int i = 0; i < phones.length; i++) {
              System.out.println("Телефон " + (i + 1));
              phones[i].info();
              System.out.println();
        }

        //сравнение соседних телефонов между собой
        for (int i = 0; i < phones.length-1; i++) {
            System.out.printf("Сравнение телефона %d и %d: %b  \n", i+1, i+2, phones[i].equals(phones[i+1]));
        }


    }


}
