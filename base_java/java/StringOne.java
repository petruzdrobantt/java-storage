import java.lang.*;
import java.util.*;

public class StringOne
{
	public static void main(String args[])
	{
        System.out.print("Type your email>>>");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
        System.out.println(" ");

        String username = str.substring(0, str.indexOf("@"));
        System.out.printf("Username is %s \n", username );

        String domain = str.substring(str.indexOf("@") + 1);
        System.out.printf("Domain is %s \n", domain);

        String id = domain.substring(0,domain.indexOf("."));
        if(id.equals("gmail"))
            System.out.println("Id is on gmail \n");
        else
            System.out.println("Id is not on gmail \n");
	}
}
