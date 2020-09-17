//Mickie Blair
//Java I – CIST 2371
//Final Project Invoice - TestInvoice2 Class

package FinalProjectInvoice;

public class TestInvoice2 
{
    
    
        public static void main(String[] args) 
        {
            System.out.println("Invoice2 Constructor Tests\n");
            
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
            Invoice2 test1=new Invoice2(100, 212.12, 1, 15, 2015);
            
            //display test1 results
            test1.displayResults();
            
            //test 2 
            System.out.println();
            System.out.println();
            System.out.println ("Constructor Test 2 - Invalid Month");
            System.out.println("------------------------------------");
            System.out.println ("Data to be sent to constructor:\n"
                                + "Invoice Number:\t 1245\n"
                                + "Balance Due:\t 315.21\n"
                                + "Month:\t\t 15\n"
                                + "Day:\t\t 15\n"
                                + "Year:\t\t 2016\n");
            //create test2 object
            Invoice2 test2=new Invoice2(1245, 315.21, 15, 15, 2016);
            
            //display test2 results
            test2.displayResults();
            
            //test 3 
            System.out.println();
            System.out.println();
            System.out.println ("Constructor Test 3a - February Test - Days > 28");
            System.out.println("------------------------------------");
            System.out.println ("Data to be sent to constructor:\n"
                                + "Invoice Number:\t 4588\n"
                                + "Balance Due:\t 825.72\n"
                                + "Month:\t\t 2\n"
                                + "Day:\t\t 30\n"
                                + "Year:\t\t 2012\n");
            //create test3 object
            Invoice2 test3a=new Invoice2(4588, 825.72, 2, 30, 2012);
            
            //display test3 results
            test3a.displayResults();
            
            //test 3b 
            System.out.println();
            System.out.println();
            System.out.println ("Constructor Test 3b - February Test - Days < 28");
            System.out.println("------------------------------------");
            System.out.println ("Data to be sent to constructor:\n"
                                + "Invoice Number:\t 4588\n"
                                + "Balance Due:\t 825.72\n"
                                + "Month:\t\t 2\n"
                                + "Day:\t\t 21\n"
                                + "Year:\t\t 2012\n");
            //create test3 object
            Invoice2 test3b=new Invoice2(4588, 825.72, 2, 21, 2012);
            
            //display test3 results
            test3b.displayResults();


            //test 4a 
            System.out.println();
            System.out.println();
            System.out.println ("Constructor Test 4a - 31 day Months - Days > 31");
            System.out.println("------------------------------------");
            System.out.println ("Data to be sent to constructor:\n"
                                + "Invoice Number:\t 7251\n"
                                + "Balance Due:\t 129.92\n"
                                + "Month:\t\t 7\n"
                                + "Day:\t\t 35\n"
                                + "Year:\t\t 2014\n");
            //create test4 object
            Invoice2 test4a=new Invoice2(7251, 129.92, 7, 35, 2014);
            
            //display test results
            test4a.displayResults();
            
            //test 4b 
            System.out.println();
            System.out.println();
            System.out.println ("Constructor Test 4b - 31 day Months - Days < 31");
            System.out.println("------------------------------------");
            System.out.println ("Data to be sent to constructor:\n"
                                + "Invoice Number:\t 7251\n"
                                + "Balance Due:\t 129.92\n"
                                + "Month:\t\t 7\n"
                                + "Day:\t\t 28\n"
                                + "Year:\t\t 2014\n");
            //create test4 object
            Invoice2 test4b=new Invoice2(7251, 129.92, 7, 28, 2014);
            
            //display test results
            test4b.displayResults();
            
           
            //test 5a
            System.out.println();
            System.out.println();
            System.out.println ("Constructor Test 5a - 30 day Months - Days > 30");
            System.out.println("------------------------------------");
            System.out.println ("Data to be sent to constructor:\n"
                                + "Invoice Number:\t 3269\n"
                                + "Balance Due:\t 719.33\n"
                                + "Month:\t\t 9\n"
                                + "Day:\t\t 31\n"
                                + "Year:\t\t 2013\n");
            //create test5 object
            Invoice2 test5a=new Invoice2(3269, 719.33, 9, 31, 2013);
            
            //display test results
            test5a.displayResults();
            
            //test 5b
            System.out.println();
            System.out.println();
            System.out.println ("Constructor Test 5b - 30 day Months - Days < 30");
            System.out.println("------------------------------------");
            System.out.println ("Data to be sent to constructor:\n"
                                + "Invoice Number:\t 3269\n"
                                + "Balance Due:\t 719.33\n"
                                + "Month:\t\t 9\n"
                                + "Day:\t\t 27\n"
                                + "Year:\t\t 2013\n");
            //create test5 object
            Invoice2 test5b=new Invoice2(3269, 719.33, 9, 27, 2013);
            
            //display test results
            test5b.displayResults();
            
        }

}

