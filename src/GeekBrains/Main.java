package GeekBrains;

import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
//Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
//        Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException с детализацией, в как1ой именно ячейке лежат неверные данные.
//        В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException и вывести результат расчета.


public class Main {
    public static void main(String[] args) throws MyArraySizeException {
        String[][]arr ={
                {"1","1","1","1"},
                {"2","2","2"},
                {"3","3","3","3"},
                {"4","4","4","4"}};

        String[][]arrToo =new String[4][4];
        ArrayTest arrr = new ArrayTest();
     arrr.arrMh(arr);

    }
}





