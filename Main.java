package GeekBrains;

import org.w3c.dom.ls.LSOutput;

public class Main {

    static  final int SIZE = 10_000_000;
    static final int HALF = SIZE/2;


    public static void main(String[] args) {
mhetodOne();
              mhetodTwo();
    }


   static void mhetodOne(){
        float[] arr = new float [SIZE];
       for (int i = 0; i < arr.length; i++) {
           arr[i]=1;
       }
       long a = System.currentTimeMillis();
       for (int j = 0; j < arr.length;j++) {
       arr[j] = (float)(arr[j] * Math.sin(0.2f + j / 5) * Math.cos(0.2f + j / 5) * Math.cos(0.4f + j / 2));
   }
       System.out.println(System.currentTimeMillis() - a);

    }


    //  Второй разбивает массив на два массива,
    //  в двух потоках высчитывает новые значения
    //  и потом склеивает эти массивы обратно в один.


    //System.arraycopy(массив-источник, откуда начинаем брать данные из массива-источника, массив-назначение, откуда начинаем записывать данные в массив-назначение, сколько ячеек копируем)
    static void mhetodTwo(){
        long a = System.currentTimeMillis();
             // 1 поток из первой половин
        new Thread(new MyRunnableClass()).start();
            // 2 поток из второй половины
        new Thread(new MyRunnableClassTwo()).start();
        System.out.println(System.currentTimeMillis() - a);
    }

    static class MyRunnableClass implements Runnable {
        @Override
        public void run() {


                      float[] arr = new float [SIZE];
                      float[] arrHalf = new float [HALF];
                    System.arraycopy(arr,0,arrHalf,0, arr.length/2);
                    for (int i = 0; i < arrHalf.length; i++) {
                        arr[i]=1;
                    }

                    for (int j = 0; j < arrHalf.length;j++) {
                        arr[j] = (float)(arr[j] * Math.sin(0.2f + j / 5) * Math.cos(0.2f + j / 5) * Math.cos(0.4f + j / 2));
                    }
                    System.arraycopy(arrHalf,0,arr,0, arrHalf.length);
            }
        }

static class MyRunnableClassTwo implements Runnable {

    @Override
    public void run() {
        float[] arr = new float [SIZE];
        float[] arrHalf = new float [HALF];

        System.arraycopy(arr,arr.length/2,arrHalf,0, arr.length/2);
        for (int i = 0; i < arrHalf.length; i++) {
            arr[i]=1;
        }

        for (int j = 0; j < arrHalf.length;j++) {
            arr[j] = (float)(arr[j] * Math.sin(0.2f + j / 5) * Math.cos(0.2f + j / 5) * Math.cos(0.4f + j / 2));
        }

        System.arraycopy(arrHalf,0,arr,arrHalf.length/2+1, arrHalf.length);
    }
}
    }



