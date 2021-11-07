package Lesson2;

public class FirstProgram {
    public static void main(String[] args) {
        System.out.println("Привет");
        long summa = calculate(3, 5);
        System.out.println(summa);
        long othersumma = calculate(5, 4);
        System.out.println(othersumma);

        long minuss = minus(9, 4);
        System.out.println(minuss);

        long miltiplayandsum = multiplyandsumma(3);
        System.out.println(miltiplayandsum);


    }

    /**
     * слождение двух аргументов и возвращать результат
     *
     * @param arg1 первый арг
     * @param arg2 второй арг
     * @return результат сложения 2х чисел
     */
    public static int calculate(int arg1, int arg2) {
        // Результат сложения двух чисел
        // результат должен быть совместим по типу с аргументами
        // над которыми осуществляется операция сложения
        int result = arg1 + arg2;
        return result;

    }

    /**
     * @param arg1 арг 1
     * @param arg2 арг 2
     * @return результат вычетания 2х чисел
     */
    public static int minus(int arg1, int arg2) {
        // Результат вычетания двух чисел
        // результат должен быть совместим по типу с аргументами
        // над которыми осуществляется операция вычетания
        int result = arg1 - arg2;
        return result;
    }
    public static int multiplyandsumma(int arg1) {
        int result = 3 * arg1 + 2;
        result = result - 11;
        return result;
    }

}
