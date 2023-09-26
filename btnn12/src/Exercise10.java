import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi kí tự S1");
        String str1 = new Scanner(System.in).nextLine();
        System.out.println("Nhập chuỗi kí tự S2");
        String str2 = new Scanner(System.in).nextLine();
        int index = str2.indexOf(str1);
        if (index==-1){
            System.out.println("chuỗi S1 không có trong S2");
            return;
        }
        String result = str2.replace(str1,"");
        System.out.println("loại bỏ chuỗi S1 , S2 có chuỗi là :"+result );
    }
}
