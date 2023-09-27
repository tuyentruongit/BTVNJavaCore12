import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise3 {
    public static void main(String[] args) {
       input();
    }

    private static void input() {
        System.out.println("Nhập chuỗi bất kì");
        String input = new Scanner(System.in).nextLine().trim().replaceAll("\\s+", " ");;
        String[] str = input.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j <str[i].length() ; j++) {
                char c = str[i].charAt(j);
                if (j==0){
                    stringBuilder.append(Character.toUpperCase(c));
                }
                if (j!=0) {
                    stringBuilder.append(Character.toLowerCase(c));
                }
            }
            stringBuilder.append(" ");
        }
        System.out.println(stringBuilder);
    }
}
