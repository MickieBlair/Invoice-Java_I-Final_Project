//Mickie Blair
//Java I – CIST 2371
//Final Project Invoice - Invoice2 Class

package FinalProjectInvoice;

public class Invoice2 
{

    private int invoiceNumber;      //field for invoice number
    private double balanceDue;      //field for balance due
    private int month;              //field for month
    private int day;                //field for day
    private int year;               //field for year
    
    public Invoice2(int number, double balance, int month, int day, int year)
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
            
            //month and day if statements
            if (month < 1 || month > 12)
                {
                    this.month = 0;
                    this.day = 0;
                }
            else if (month == 2) 
                {
                    this.month = month;

                    if (day>28)
                        {
                            this.day = 28;
                        }    
                    else
                        {
                            this.day = day;
                        }
                }
            else if (month == 1 || month == 3 || month == 5 || month == 7 
                     || month == 8 || month == 10 || month == 12) 
                {
                    this.month = month;

                    if (day>31)
                        {
                            this.day = 31;
                        }    
                    else
                        {
                            this.day = day;
                        }
                }
            
            else if (month == 4 || month == 6 || month == 9 || month == 11) 
                   
                {
                    this.month = month;

                    if (day>30)
                        {
                            this.day = 30;
                        }    
                    else
                        {
                            this.day = day;
                        }
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

