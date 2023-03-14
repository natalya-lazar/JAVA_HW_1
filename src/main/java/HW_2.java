public class HW_2 {
    public static void main(String[] args) {
//        1. Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
        String str1 = "Hello World!";
        String str2 = "Hello";
        System.out.println(str1.contains(str2));
//        2. Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
        String str3 = new StringBuilder(str1).reverse().toString();
        System.out.println(str3);
        System.out.println(str1.equals(new StringBuilder(str3).reverse().toString()));
//        4. Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
        int numb1 = 3;
        int numb2 = 56;
        StringBuilder str4 = new StringBuilder().append(numb1).append(" + ").append(numb2).append(" = ").append(numb1 + numb2);
        StringBuilder str5 = new StringBuilder().append(numb1).append(" - ").append(numb2).append(" = ").append(numb1 - numb2);
        StringBuilder str6 = new StringBuilder().append(numb1).append(" * ").append(numb2).append(" = ").append(numb1 * numb2);
        System.out.println(str4 + "\n" + str5 + "\n" + str6);
//        5. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
//        str4.insert(str4.indexOf("="),"равно").deleteCharAt(str4.indexOf("="));
//        str5.insert(str5.indexOf("="),"равно").deleteCharAt(str5.indexOf("="));
//        str6.insert(str6.indexOf("="),"равно").deleteCharAt(str6.indexOf("="));
//        System.out.println(str4 + "\n" + str5 + "\n" + str6);
//        6. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().\
        str4.replace(str4.indexOf("="), str4.indexOf("=") + 1, "равно");
        str5.replace(str5.indexOf("="), str5.indexOf("=") + 1, "равно");
        str6.replace(str6.indexOf("="), str6.indexOf("=") + 1, "равно");
        System.out.println(str4 + "\n" + str5 + "\n" + str6);
    }
}
