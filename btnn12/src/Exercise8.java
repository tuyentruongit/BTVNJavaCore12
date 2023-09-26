import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi kí tự S1");
        String str1 = new Scanner(System.in).nextLine();
        System.out.println("Nhập chuỗi kí tự S2");
        String str2 = new Scanner(System.in).nextLine();
        int count = 0 ;
        int i = 0;
        int j = 0;
        while (i<str1.length()){
            while (j<str2.length()){
                if (str1.charAt(i)==str2.charAt(j)){
                    j++;
                    count = j -i;
                    break;
                } else if (str1.charAt(i)!=str2.charAt(j)) {
                    j++;
                    count=-1;
                }
            }
            i++;
        }
       if (count!=-1){
           System.out.println("S1 xuất hiện ở vị trí thứ " + count + " của chuỗi S2");
           return;
       }
        System.out.println("S1 không xuất hiện trong mảng "+ count);

    }
}
