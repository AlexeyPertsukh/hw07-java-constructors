/*
*Создать хранилище для типа данных int.(класс Storage)
Поле массив int[].
Есть метод add, который принимает значение в параметры
и помещает его в хранилище.
Есто метод showAll, который выводит на консоль все
элементы хранилища.

public class Storage {
    private int[] data;

    public void add(int value) {

    }

    public void showAll() {

    }
}

public class Home {
    public static void main(String[] args) {
        Storage storage1 = new Storage();
        storage1.add(7);
        storage1.add(5);
        storage1.add(8);
        storage1.showAll();//7 5 8

        Storage storage2 = new Storage();
        storage2.add(3);
        storage2.add(2);
        storage2.add(1);
        storage2.add(1);
        storage2.add(1);
        storage2.add(3);
        storage2.showAll();//3 2 1 1 1 3

        storage1.add(6);
        storage1.showAll();//7 5 8 6
    }

 */

package hw7_3;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {

        Storage storage = new Storage();
        Scanner sc = new Scanner(System.in);

        //storage.testArrCopyRandom();    //Тестируем метод копирование массивов с массивами разной длины

        //ввод количества цифр для записи в Storage
        int numValInput;

        do {
            System.out.print("Введите количество чисел для записи в Storage: ");
            numValInput = sc.nextInt();
        }while(numValInput < 1);

        //ввод чисел в Storage

        for (int i = 0; i < numValInput; i++) {
            storage.add( (int)(Math.random() * 100 ));  //заполнение Storage случайными числами
            }

        System.out.println();

        storage.showAll();

    }
}
