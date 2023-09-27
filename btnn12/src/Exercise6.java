import java.util.Arrays;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi bất kì không quá 20 từ, mỗi từ không quá 10 kí tự");
        String string;
        String[] strings ;
        do {
             string = new Scanner(System.in).nextLine().trim().replaceAll("\\s+", " ");
             strings = string.split(" ");
             if (strings.length<=20){
                 break;
             }
            System.out.println("Chuỗi của bạn đã quá số từ cho phép, vui long nhập lại");
        }while (true);
       sortArray( strings);
       printString(strings);

    }

    private static void printString( String[] strings ) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            stringBuilder.append(strings[i]).append(" ");
        }
        System.out.println(stringBuilder);
    }

    private static void sortArray(String[] strings) {
        String str;
        for (int i = 0; i < strings.length -1; i++) {
            for (int j = i+1; j < strings.length; j++) {
                if (strings[i].compareToIgnoreCase(strings[j])>0){
                    str = strings[i];
                    strings[i]= strings[j];
                    strings[j]=str;
                }
            }
        }
    }
}
