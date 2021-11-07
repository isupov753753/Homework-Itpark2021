package Lesson2;

public class Equation {
    public static void main(String[] args) {
        System.out.println("Автоматизация вычисления формулы объема цилиндра");
        System.out.println("Объем цилиндра равен 3.14*R^2*h");
        System.out.println("Известно, что R = 4, h = 6");

        long formulaq = Q(4,6);
        System.out.print("Объем цилиндра равен  ");
        System.out.print(formulaq);
    }

    public static int Q (int arg1, int arg2) {
        long result = (long) (3.14 * arg1 * arg1 * arg2);
        return (int) result;
    }

    }