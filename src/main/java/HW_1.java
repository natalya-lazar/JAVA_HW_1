import java.util.Random;

public class HW_1 {
    public static void main(String[] args) {
//        1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
        int i = myRandom(0, 2000);
        System.out.println(i);

//        2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        System.out.println(Integer.toBinaryString(i));
        int n = highestBitNumber(i);
        System.out.println(n);

//        3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        int[] m1 = findMultiples(n, i, Short.MAX_VALUE);

//        4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
        int[] m2 = findNonMultiples(n, Short.MIN_VALUE, i);

    }

    //    1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
    static int myRandom(int min, int max){
        Random random = new Random();
        return random.nextInt(min, (max + 1));
    }

    //    2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
    static int highestBitNumber(int number) {
        return Integer.toBinaryString(number).length();
    }

    //    3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
    static int[] findMultiples(int divider, int min, int max) {
        int size = 0;
        for (int i = min; i <= max; i++) {
            if (i % divider == 0) size++;
        }
        int[] multiples = new int[size];
        int index = 0;
        for (int i = min; i <= max; i++) {
            if (i % divider == 0) multiples[index++] = i;
        }
        return multiples;
    }

    //    4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
    static int[] findNonMultiples(int divider, int min, int max) {
        int size = 0;
        for (int i = min; i <= max; i++) {
            if (i % divider != 0) size++;
        }
        int[] nonMultiples = new int[size];
        int index = 0;
        for (int i = min; i <= max; i++) {
            if (i % divider != 0) nonMultiples[index++] = i;
        }
        return nonMultiples;
    }
}
