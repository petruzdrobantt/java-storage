import java.util.Scanner;

public class RegularExp2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String noSpecial = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("No special "+ noSpecial);

        String noExtraSpace = str.replaceAll("\s[\s]+", " ");
        System.out.println("No extra space "+noExtraSpace);

        int wordCount = str.split("\\s+").length;
        System.out.println("Word count "+ wordCount);
    }
}
