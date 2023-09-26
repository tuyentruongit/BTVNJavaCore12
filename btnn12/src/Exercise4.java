import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise4 {
    public static void main(String[] args) {
       inputString();
    }

    private static void inputString() {
        System.out.println("Nhập chuỗi bất kì");
        String input = new Scanner(System.in).nextLine().trim().replaceAll("\\s+", " ");;
        String[] strings = input.split(" ");
        int count = 0;
        String str2 = strings[0];
        for (int i = 1; i < strings.length; i++) {
            if (str2.length()<strings[i].length()){
                str2=strings[i];
                count=i;
            }
        }
        System.out.println("Từ dài nhất trong chuỗi là :" + str2 + "\nXuất hiện ở vị trí thứ "+ (count));
    }
}
