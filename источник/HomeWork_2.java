import java.util.*;

public class HomeWork_2 {
    public static void main(String[] args) {
        //Продвинутый
        // Задание №1: Написать цикл, который будет прибавлять число к result до тех пор,
        // пока не получиться больше 1_000_000.
        // Дано:
        double increment = 0.01123;
        double result = 0;
        // Вывести на экран, количество итераций, которое потребовалось, чтобы дойти до миллиона.
        // Если число отрицательное, то сразу заканчиваем цикл, ничего не выводя.
        // Внимание: число может измениться, и не должно приводить к изменению вашего кода.
        int count = 0;
        while (result <=1000000){
            if(increment > 0){
            result +=increment;
            count++;
        }
            else break;
        }
        System.out.println("Результат 1 задания " + count);

        // Задание №2: Дан массив единиц, произвольной длины. Создать цикл, который заменяет каждый
        // нечетный элемент на 0;
        // Например, дано: [1,1,1,1,1]
        // Ожидаемый результат: [0,1,0,1,0]
        // Подсказка: прочитай про операнд "%".

        int[] list = {1, 1, 1, 1, 1,};
        for(int i = 0; i < list.length; i++){
            if(((i+1) % 2) > 0){
                list[i] = 0;
            }
        }
        System.out.println("Результат 2 задания " + Arrays.toString(list));

        //Задача №3
        //Создать два массив чисел:
        // 1,2,5,7,10
        // 2,3,2,17,15
        // Создать массив чисел, в котором будут: все числа из этих двух массивов,
        // и результат умножения чисел с одинаковым порядковым номером
        //
        //Ожидаемый результат:
        //1,2,5,7,10,2,3,2,17,15,2,6,10,119,150
        //(первый массив - 1,2,5,7,10), (второй массив - 2,3,2,17,15),
        //(результат перемножения - (1*2), (2*3), (5*2), (7*17), (10*15)

        int[] array1 = {1,2,5,7,10};
        int[] array2 = {2,3,2,17,15};
        int length1 = array1.length;
        int length2 = array2.length;
        int length3 = length1 >= length2 ? length2 : length1;
        int[] array3 = new int[length3];
        int counts = 0;

            for(int i = 0; i < length3; i++){
               array3[i] = array1[i] * array2[i];
        }
        int[] arrays = new int[(length1 + length2 + length3)];
        for(int i = 0; i < array1.length; i++){
            arrays[counts] = array1[i];
            counts++;
        }
        for(int i = 0; i < array2.length; i++){
            arrays[counts] = array2[i];
            counts++;
        }
        for(int i = 0; i < array3.length; i++){
            arrays[counts] = array3[i];
            counts++;
        }
        System.out.println("Результат 3 задания " + Arrays.toString(arrays));

        //Задача №4
        //В слове "Hello world!" заменить l на r, сделать все буквы заглавными, выбрать первые 8 символов

        String ky = new String("Hello world!");
        String str = ky.replace('l', 'r').substring(0,8).toUpperCase();
        System.out.println("Результат 4 задания " + str);

    }
}
