package GeekBrains;

import java.io.IOException;
import java.util.Arrays;

public class ArrayTest {
    public void arrMh(String[][] array) throws MyArraySizeException,MyArrayDataException {
        if (array.length==4 && array[0].length==4 && array[1].length==4 && array[2].length==4 && array[3].length==4){ // проверка размера массива
                int s = 0;
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        try {
                            s += (Integer.parseInt(array[i][j]));
                        } catch (NumberFormatException e) {
                           // e.printStackTrace();
                            throw new MyArrayDataException("преобразование не удалось: в ячейке массива "
                              +"["+i+"]"+"["+j+"]"+" записано " +array[i][j]);
                        }
                    }
                }
            System.out.println(Arrays.deepToString(array));
            System.out.println("Сумма массива: "+s);}
        else {
            try {
                throw new MyArraySizeException("Задан массив неверного размера");
            }catch (MyArraySizeException e){
                e.printStackTrace();
                System.out.println("Задайте новый массив");
            }
        }
    }
}

