/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. 
Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
2. Если необходимо, исправьте данный код (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

Дан следующий код, исправьте его там, где требуется (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя. */
package less2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getString();
        
    }

    // 1. Метод запрашивает ввод дробного числа и возвращает введенное значение.
    // При вводе текста вместо числа ввод данных запрашивается повторно.
    public static void getNumber() {
        Scanner scanner = new Scanner(System.in);
        float number = 0;
        boolean invalidInput = true;
        while (invalidInput) {
            System.out.print("Введите дробное число: ");
            try {
                number = scanner.nextFloat();
                invalidInput = false;
            } catch (Exception e) {
                System.out.println("Вы ввели неверный формат.");

                scanner.nextLine();

            }
        }
        System.out.println("Ваше число: " + number);
    }
    
   /* Задание 2
    try {
        int d = 0;
        double catchedRes1 = 0;
        if (d != 0){
            double catchedRes1 = intArray[8] / d;}
        System.out.println("catchedRes1 = " + catchedRes1);
     } catch (ArithmeticException e) {
        System.out.println("Catching exception: " + e);
     }
     */

/*Задание 3

public static void three(String[] args) {
   try {
       int a = 90;
       int b = 3;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 , 3, 4};
       abc[3] = 9;
   
   } catch (NullPointerException ex) {
       System.out.println("Указатель не может указывать на null!");
   } catch (IndexOutOfBoundsException ex) {
       System.out.println("Массив выходит за пределы своего размера!");
   }
}
public static void printSum(Integer a, Integer b)  {
   System.out.println(a + b);
}*/

/*Задание 4
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
public static void getString () {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите дробное число: ");
    String userStr = scanner.nextLine();
    if (userStr.isEmpty()) {
        throw new RuntimeException("Пустая строка!");
    } else {
        getNumber();
    }
}

}
