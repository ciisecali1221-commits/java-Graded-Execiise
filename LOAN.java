import java.util.Date;
public class LOAN {
    private double annualInterestRate;
    private  int NumberOfYear;
    private double LoanAmount;
    private Date loanDate;

public LOAN(){
    annualInterestRate=2.5;
    NumberOfYear=1;
    LoanAmount=1000;
    loanDate=new Date();
}
public LOAN(double annualInterestRate, int NumberOfYear, double loanAmount){
    this.annualInterestRate=annualInterestRate;
    this.NumberOfYear=NumberOfYear;
    this.LoanAmount=LoanAmount;
    loanDate=new Date();

}
public double getAnnualInterestRate(){
    return annualInterestRate;
}
public int getNumberOfYear(){
    return NumberOfYear;
}
public double getLoanAmount(){
    return LoanAmount;
}
public java.util.Date getLoanDate(){
    return loanDate;
}
//setters
public void setAnnualInterestRate(double annualInterestRate){
    this.annualInterestRate=annualInterestRate;
}
public void setNumberOfYear(int NumberOfYear){
    this.NumberOfYear=NumberOfYear;
}
public void setLoanAmount(double LoanAmount){
    this.LoanAmount=LoanAmount;
}
public double getMonthlyPayment(){
    double MonthlyInterestRate= annualInterestRate /1200;
    int numberOfPayment=NumberOfYear*12;
    return LoanAmount*MonthlyInterestRate/(1-1/Math.pow(1+MonthlyInterestRate,numberOfPayment));


}
public double getTotalPayment(){
    return getMonthlyPayment()*NumberOfYear*12;
}

    public static void main(String[] args) {
        LOAN loan1=new LOAN();
        LOAN loan2=new LOAN(5.0, 10, 500);
        System.out.println("Monthly payment:" + loan1.getMonthlyPayment());
        System.out.println("Total payment" + loan1.getTotalPayment());
    }

}
