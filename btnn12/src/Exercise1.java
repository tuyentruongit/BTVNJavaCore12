import javax.sound.midi.MidiFileFormat;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println(" Số thuận nghịch có 6 chữ số :" );
        print();
    }

    private static boolean soThuanNghich(int number ) {
        String str2 = Integer.toString(number);
        for (int i = 0; i < str2.length()/2; i++) {
            if (str2.charAt(i)!= str2.charAt(str2.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    private static void print(){
        for (int i = 100000; i <1000000 ; i++) {
            if (soThuanNghich(i)){
                System.out.println(i);
            }
        }
    }
}
