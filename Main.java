/*
Lesson 1
05/09/2018
Lanshchikova Svetlana
 */
package geekbrains.ru.Lesson1;

public class Main {
    public static void main(String[] args) {
/*
2. Создать переменные всех пройденных типов данных,
и инициализировать их значения
*/
        byte b1 = 10;
        short s1 = -155;
        int a1 = 10;
        long l1 = 56L;

        float f1 = 34.7f;
        double d1 = 542.9;

        boolean bol = true;
        char c1 = 'a';

        String str = "Hello!";
/*
3. Написать метод вычисляющий выражение a * (b + (c / d))
и возвращающий результат,где a, b, c, d – входные параметры
этого метода
*/
        System.out.println(calculator(2, 43, 20, 4));
/*
4. Написать метод, принимающий на вход два числа, и проверяющий
что их сумма лежит в пределах от 10 до 20(включительно), если да –
вернуть true, в противном случае – false
*/
        System.out.println(amount(2,22));
/*
5. Написать метод, которому в качестве параметра передается целое
число, метод должен напечатать в консоль положительное ли число
передали, или отрицательное; Замечание: ноль считаем положительным
числом.
 */
        positive_negative(0);
/*
6. Написать метод, которому в качестве параметра передается целое
число, метод должен вернуть true, если число отрицательное
 */
        System.out.println(negative_true(-7));
/*
7. Написать метод, которому в качестве параметра передается строка,
обозначающая имя, метод должен вывести в консоль сообщение «Привет,
указанное_имя!»
 */
        message("Артём");
    }

    static int calculator(int a, int b, int c, int d){
        return a * (b + (c / d));
    }

    static boolean amount(int a, int b){
        int summ =  a + b;
        boolean bol;
        if(summ >= 10 && summ <= 20){
            bol = true;
        } else {
            bol = false;
        }
        return bol;
    }

    static void positive_negative(int a){
        if(a < 0){
            System.out.println("Число является отрицательным!");
        } else {
            System.out.println("Число является положительным!");
        }
    }

    static boolean negative_true(int a){
        boolean bol = false;
        if (a < 0){
            bol = true;
        }
        return bol;
    }

    static void message(String str){
        System.out.println("Привет, " + str + "!");
    }

}