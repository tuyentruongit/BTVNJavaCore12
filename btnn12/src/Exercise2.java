import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        inputStrings();
    }

    private static void inputStrings() {
        System.out.println("Nhập chuỗi kí tự bất kì");
        String str = new Scanner(System.in).nextLine();
        StringBuilder str2  =convertToInterlacedForm(str);
        System.out.println("Chuỗi kí tự sau khi chuyển sang xen kẽ chữ in hoa");
        System.out.println(str2);
    }

    private static StringBuilder  convertToInterlacedForm(String str) {
        StringBuilder str2  = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (i%2==0){
                str2.append(Character.toUpperCase(c));
            }
            if (i%2!=0){
                str2.append(Character.toLowerCase(c));
            }
        }return str2;
    }

}
