import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi kí tự S1");
        String str1 = new Scanner(System.in).nextLine();
        System.out.println("Nhập chuỗi kí tự S2");
        String str2 = new Scanner(System.in).nextLine();
        System.out.println("Nhập vị trí mà bạn muốn chèn S1 vào S2");
        int k = new Scanner(System.in).nextInt();
        String string ="";
        for (int i = 0; i < k -1; i++) {
            char a = str2.charAt(i);
            string = string.concat(String.valueOf(a));
        }
        for (int j = 0; j < str1.length(); j++) {
                char a = str1.charAt(j);
                string = string.concat(String.valueOf(a));
        }
        for (int j = k -1; j < str2.length(); j++) {
                char a = str2.charAt(j);
                string = string.concat(String.valueOf(a));
        }
        System.out.println(string);
    }
}
