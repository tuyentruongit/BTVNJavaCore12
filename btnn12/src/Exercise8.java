import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi kí tự S1");
        String str1 = new Scanner(System.in).nextLine();
        System.out.println("Nhập chuỗi kí tự S2");
        String str2 = new Scanner(System.in).nextLine();
        int count = -1;
        for (int i = 0; i <= str2.length() - str1.length(); i++) {
            boolean find = true;
            for (int j = 0; j < str1.length(); j++) {
                if (str2.charAt(i + j) != str1.charAt(j)) {
                    find = false;
                    break;
                }
            }
            if (find) {
               count=i;
            }
        }
       if (count!=-1){
           System.out.println("S1 xuất hiện ở vị trí thứ " + count + " của chuỗi S2");
           return;
       }
        System.out.println("S1 không xuất hiện trong mảng "+ count);

    }
}
