package lesseon2;

public class DZ {

    public static void main(String[] args) {
        System.out.println(Sum(4, 9));
        printSign(-10);
        System.out.println(Number(-50));
        printStringNTimes("5 раз", 5);
        System.out.println(Year(2021));
    }

    public static boolean Sum(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }

       public static void printSign(int a) {
        if (a >= 0) {
            System.out.println("Положительное"+a);
        }
        else {
            System.out.println("Отрицательное"+a);
        }
    }

       public static boolean Number(int a) {
       return a < 0;
    }

    public static void printStringNTimes(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }

      public static boolean Year(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}