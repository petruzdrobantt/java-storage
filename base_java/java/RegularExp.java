import java.util.Scanner;

public class RegularExp {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String number = sc.next();

        boolean isBinary = number.matches("[01]+");
        System.out.println("Is binary "+ isBinary);

        boolean isHexa = number.matches("[0-9a-f]+");
        System.out.println("Is hexadecimal "+ isHexa);

        boolean isDate = number.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}");
        System.out.println("Is date "+isDate);
    }
}
