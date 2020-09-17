//Mickie Blair
//Java I – CIST 2371
//Final Project Invoice - TestInvoice Class

package FinalProjectInvoice;

public class TestInvoice 
{
    
        public static void main(String[] args) 
        {
            System.out.println("Invoice Constructor Tests\n");
            
            //test 1 
            System.out.println ("Constructor Test 1 - Invoice Test");
            System.out.println("------------------------------------");
            System.out.println ("Data to be sent to constructor:\n"
                                + "Invoice Number:\t 100\n"
                                + "Balance Due:\t 212.12\n"
                                + "Month:\t\t 1\n"
                                + "Day:\t\t 15\n"
                                + "Year:\t\t 2015\n");
            //create test1 object
            Invoice test1=new Invoice(100, 212.12, 1, 15, 2015);
            
            //display test1 results
            test1.displayResults();
            
            //test 2 
            System.out.println();
            System.out.println();
            System.out.println ("Constructor Test 2- Month Invalid");
            System.out.println("------------------------------------");
            System.out.println ("Data to be sent to constructor:\n"
                                + "Invoice Number:\t 1245\n"
                                + "Balance Due:\t 315.21\n"
                                + "Month:\t\t 15\n"
                                + "Day:\t\t 15\n"
                                + "Year:\t\t 2016\n");
            //create test2 object
            Invoice test2=new Invoice(1245, 315.21, 15, 15, 2016);
            
            //display test2 results
            test2.displayResults();
            
            //test 3 
            System.out.println();
            System.out.println();
            System.out.println ("Constructor Test 3 - Day Invalid");
            System.out.println("------------------------------------");
            System.out.println ("Data to be sent to constructor:\n"
                                + "Invoice Number:\t 4588\n"
                                + "Balance Due:\t 825.72\n"
                                + "Month:\t\t 5\n"
                                + "Day:\t\t 45\n"
                                + "Year:\t\t 2012\n");
            //create test3 object
            Invoice test3=new Invoice(4588, 825.72, 5, 45, 2012);
            
            //display test3 results
            test3.displayResults();
            
            //test 4 
            System.out.println();
            System.out.println();
            System.out.println ("Constructor Test 4 - Year Out of Range");
            System.out.println("------------------------------------");
            System.out.println ("Data to be sent to constructor:\n"
                                + "Invoice Number:\t 7251\n"
                                + "Balance Due:\t 129.92\n"
                                + "Month:\t\t 7\n"
                                + "Day:\t\t 21\n"
                                + "Year:\t\t 2010\n");
            //create test4 object
            Invoice test4=new Invoice(7251, 129.92, 7, 21, 2010);
            
            //display test results
            test4.displayResults();
         
            
            //test 5 
            System.out.println();
            System.out.println();
            System.out.println ("Constructor Test 5 - All Data Valid");
            System.out.println("------------------------------------");
            System.out.println ("Data to be sent to constructor:\n"
                                + "Invoice Number:\t 3269\n"
                                + "Balance Due:\t 719.33\n"
                                + "Month:\t\t 9\n"
                                + "Day:\t\t 28\n"
                                + "Year:\t\t 2013\n");
            //create test5 object
            Invoice test5=new Invoice(3269, 719.33, 9, 28, 2013);
            
            //display test results
            test5.displayResults();       
        }
}
