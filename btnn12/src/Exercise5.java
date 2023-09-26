import java.util.Arrays;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        System.out.println("Nhâp họ tên đẩy đủ của bạn");
        String name = new Scanner(System.in).nextLine().trim().replaceAll("\\s+", " ");;
        String[] strings = name.split(" ");
        String str2 ;
        for (int i = strings.length-1; i > 0 ; i--) {
            str2=strings[i];
            strings[i]=strings[i-1];
            strings[i-1]=str2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            stringBuilder.append(strings[i]).append(" ");
        }
        System.out.println(stringBuilder);
    }
}
