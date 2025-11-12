import java.util.Date;

class Account{
    private int accNo;
    private String name;
    private String address;
    private String phoneNumber;
    private Date dateOfBirth;
    private double balance;

    public Account(int accNo, String name, String address, Date dateOfBirth, String phoneNumber, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}

class SavingsAccount extends Account{
    private double fixedDepositAmount;
    private double fdInterestRate;
    private boolean fdActive;

    public SavingsAccount(int accNo, String name, String address, Date dateOfBirth, String phoneNumber, double balance) {
        super(accNo, name, address, dateOfBirth, phoneNumber, balance);
        this.fixedDepositAmount = 0.0;
        this.fdActive = false;
    }

    public void deposit(double amount){
        setBalance(this.getBalance() + amount);
    }

    public void withdraw(double amount){
        setBalance(this.getBalance() - amount);
    }

    public void fixedDeposit(double amount, double interestRate){
        if(amount > getBalance()){
            System.out.println("Insuffiecient funds");
            return;
        }

        withdraw(amount);
        this.fixedDepositAmount = amount;
        this.fdInterestRate = interestRate;
        this.fdActive = true;
    }

    public void liquidate(int fixedDepositTermMonths){
        if (!fdActive) {
            System.out.println("No active fixed deposit.");
            return;
        }

        double interest = fixedDepositAmount * (fdInterestRate / 100) * (fixedDepositTermMonths / 12.0);
        double total = fixedDepositAmount + interest;
        deposit(total);
        fdActive = false;
        fixedDepositAmount = 0;
        System.out.println("FD liquidated. Amount credited: " + total);
    }
}

class LoanAccount extends Account{
    private double interestRate;
    private boolean activeLoan;

    public LoanAccount(int accNo, String name, String address, Date dateOfBirth, String phoneNumber, double balance, double interestRate) {
        super(accNo, name, address, dateOfBirth, phoneNumber, balance);
        this.interestRate = interestRate;
        activeLoan = true;
    }

    public void payEmi(double emiAmount){
        double interestPortion = getBalance() - interestRate;
        double principalPortion = emiAmount - interestPortion;

        setBalance(getBalance() - principalPortion);
        if (getBalance() <= 0) {
            setBalance(0);
            activeLoan = false;
            System.out.println("Loan fully repaid. Debt 0.");
        }
    }

    public void topUpLoan(double topUpAmount){
        setBalance(getBalance() + topUpAmount);
        activeLoan = true;
        System.out.println("Top-up loan added. New balance: " + getBalance());
    }

    public void repayment(){
        double totalDue = getBalance();
        setBalance(0);
        System.out.println("Loan fully repaid. Total paid: " + totalDue);
    }
}

public class InheritanceOne {
    static void main() {

    }
}
