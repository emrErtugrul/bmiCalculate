import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float boy,kilo;
        double vki;

        Scanner inp = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu giriniz : ");
        boy= inp.nextFloat();

        System.out.println("Lütfen kilonuzu giriniz :  ");
        kilo= inp.nextFloat();

        vki=(kilo/(boy*boy));
        System.out.println("Vücut Kitle İndeksiniz :  "+vki);

    }
}
