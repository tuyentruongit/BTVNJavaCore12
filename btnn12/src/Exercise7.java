import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise7 {
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi kí tự S1");
        String str1 = new Scanner(System.in).nextLine();
        System.out.println("Nhập chuỗi kí tự S2");
        String str2 = new Scanner(System.in).nextLine();
        int index = str1.indexOf(str2);
        if (index!=-1){
            System.out.println("S2 có xuất hiện trong S1");
            System.out.println("Chuỗi S1 sau khi loại bỏ chuỗi S2 là");
            String delete = str1 .replaceAll(str2,"");
            System.out.println(delete);
            return;
        }else {
            System.out.println("S2 không xuất hiện trong s1");
        }
        System.out.println(str1);
    }
}
