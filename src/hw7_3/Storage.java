package hw7_3;

import java.util.Arrays;

public class Storage {
    private  int[] data; //хранилище
    private  int   cnt;  //счетчик количества чисел в хранилище

    public Storage()
    {
        data = new int[20]; //начальный размер Storage
    }

    //копирование массива - пока не знаем стандартные методы копирования массива в Arrays., пишем свой метод
    private void arrCopy(int[] arrFrom, int[] arrTo )
    {
        for (int i = 0; i < arrFrom.length; i++) {
            if(arrTo.length > i) {
                arrTo[i] = arrFrom[i];
            }
            else{
                break;  //если заполнили приемник - выходим (когда размеры arrFrom и arrTo разные), на всякий случай
            }
        }
    }

    //тестируем метод arrCopy при копировании массивов разной длины
    public void testArrCopyRandom(){

        int[] arrFrom = new int[(int) (Math.random() * 12) + 10];
        int[] arrTo = new int[(int) (Math.random() * 5) + 5];

        for (int i = 0; i < arrFrom.length; i++) {
                arrFrom[i] =  (int) (Math.random() * 100);
            }

        System.out.println("Тестируем arrCopy с массивами разной длины:");
        System.out.printf("int[%d] arrFrom = %s  \n", arrFrom.length, Arrays.toString(arrFrom));
        arrCopy(arrFrom, arrTo);
        System.out.printf("int[%d] arrTo = %s  \n", arrTo.length, Arrays.toString(arrTo));

    }


    //добавление числа в хранилище
    public void  add(int val){
        if(cnt >= data.length)      //хранилище заполнено - увеличиваем его размер на 50%
        {
            int[] tmp = new int[data.length];

            arrCopy(data, tmp);
            data = new int[data.length + (data.length / 2)];
            arrCopy(tmp, data);
        }

        data[cnt] = val;    //ввод числа в хранилище
        cnt++;
    }

    //распечатывание хранилища
    public void showAll(){
        System.out.println("Storage: ");

        for (int i = 0; i < cnt ; i++) {
            System.out.printf("%3d", data[i]);

            if(i < (cnt - 1)){
                System.out.print(",  ");
            }

            if( ((i+1) % 20 == 0 || (i == (cnt - 1))) ){
                System.out.println();
            }
        }
    }

}
