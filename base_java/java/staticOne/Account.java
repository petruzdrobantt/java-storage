package staticOne;

import java.util.Date;

public class Account {
    private final String accountNumber;
    private static int count = 1;

    private String getAccountNumber(String bankName){
        Date date = new Date();
        String accNo =  (date.getYear() + 1900) + "-" +bankName+"-" + count;
        count += 1;
        return accNo;
    }

    public Account(String bankName){
        this.accountNumber = getAccountNumber(bankName);
    }

    public String getAccountNumber(){
        return accountNumber;
    }
}
