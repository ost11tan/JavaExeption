/*Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, 
необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше. */



package less1;
import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        int[] a1 = new int[] {6,10,7};
        int[] a2 = new int[] {2,5,2};
        System.out.println(Arrays.toString(minusArr(a1,a2)));
        System.out.println(Arrays.toString(divArr(a1,a2)));
        System.out.println(Arrays.toString(divIntArr(a1,a2)));
    }

    /*Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.*/
    public static int[] minusArr(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length];
        if (arr1.length != arr2.length){
            throw new RuntimeException(String.format("Длина массива1 (%d) не равна длине массива2 (%d)",
                    arr1.length, arr2.length));
        }
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i]-arr2[i];
        }
        return result;
    }

    /*Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, 
необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше. */
    public static int[] divArr(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length];
        if (arr1.length != arr2.length){
            throw new RuntimeException(String.format("Длина массива1 (%d) не равна длине массива2 (%d)",
                    arr1.length, arr2.length));
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i]==0){
                throw new RuntimeException("Деление на 0 не приветствуется");
            }
            result[i] = arr1[i]/arr2[i];
        }
        return result;
    }

    //При делении получается дробное число.
    public static int[] divIntArr(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        if (arr1.length != arr2.length) {
            throw new RuntimeException(String.format("Длина массива1 (%d) не равна длине массива2 (%d)",
                    arr1.length, arr2.length));
        }
        for (int i = 0; i < arr1.length; i++) { 
            if (arr2[i] == 0) {
                throw new RuntimeException("Деление на 0 не приветствуется");
            }
            result[i] = arr1[i] / arr2[i];
            if (arr1[i] % arr2[i] != 0) {
                throw new RuntimeException("При делении получилось дробное число");
            }
        }
        return result;
    }
}