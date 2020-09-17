//Mickie Blair
//Java I – CIST 2371
//Final Project Invoice - Invoice Class

package FinalProjectInvoice;

public class Invoice 
{
    private int invoiceNumber;      //field for invoice number
    private double balanceDue;      //field for balance due
    private int month;              //field for month
    private int day;                //field for day
    private int year;               //field for year
    
    public Invoice(int number, double balance, int month, int day, int year)
        {
            //force invoice number to be 0 if it's less than 1000
            if (number < 1000)
            {
                invoiceNumber = 0;
            }
            else 
            {
                invoiceNumber = number;
            }
            
            //balance field
            balanceDue = balance;
            
            //if month is not between 1 and 12 force month to be 0
            if (month < 1 || month > 12)
            {
                this.month = 0;
            }
            else
            {
                this.month = month;
            }
            
            //if day is not between 1 and 31 force month to be 0
            if (day < 1 ||day > 31)
            {
                this.day = 0;
            }
            else
            {
                this.day = day;
            }
            
            //if year is not between 2011 and 2017 force month to be 0
            if (year < 2011 || year > 2017)
            {
                this.year = 0;
            }
            else
            {
                this.year = year;
            }
        }
    
    public void displayResults()
    {
        System.out.println("Test Results:");
        System.out.println("------------------------------------");
        System.out.printf("Invoice Number: \t%11d\n", invoiceNumber);
        System.out.printf("Balance Due:\t\t$%10.2f\n", balanceDue);
        System.out.printf("Due Date: \t\t %02d-%02d-%04d\n", month, day, year);
    }
}
