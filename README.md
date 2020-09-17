# Invoice-Java_I-Final_Project
 Final Project for Java I.  Creating an invoice with input and data validation. 

## Data Validation
Invoice Constructor Tests

### Constructor Test 1 - Invoice Test
Data to be sent to constructor:
 * Invoice Number:	 100
 * Balance Due:	 	212.12
 * Month:		 	1
 * Day:		 	15
 * Year:		 	2015

#### Test Results:
 * Invoice Number: 		 	    	   0
 * Balance Due:			   $    212.12
 * Due Date: 			 01-15-2015

### Constructor Test 2- Month Invalid
Data to be sent to constructor:
 * Invoice Number:	 1245
 * Balance Due:	 	315.21
 * Month:		 	15
 * Day:		 	15
 * Year:			 2016

#### Test Results:
 * Invoice Number: 	                                            1245
 * Balance Due:		                   $    315.21
 * Due Date: 			 00-15-2016


### Constructor Test 3 - Day Invalid
Data to be sent to constructor:
 * Invoice Number:	 	4588
 * Balance Due:	 	825.72
 * Month:			 5
 * Day:			 45
 * Year:		 	2012

#### Test Results:
 * Invoice Number: 	                                            4588
 * Balance Due:		                   $    825.72
 * Due Date: 			 05-00-2012


### Constructor Test 4 - Year Out of Range
Data to be sent to constructor:
 * Invoice Number:	 	7251
 * Balance Due:	 	129.92
 * Month:		 	7
 * Day:		 	21
 * Year:		 	2010

#### Test Results:
 * Invoice Number: 	       		            7251
 * Balance Due:			   $    129.92
 * Due Date: 			 07-21-0000


### Constructor Test 5 - All Data Valid
Data to be sent to constructor:
 * Invoice Number:	 	3269
 * Balance Due:	 	719.33
 * Month:			9
 * Day:		 	28
 * Year:			2013

####Test Results:
 * Invoice Number: 	      		            3269
 * Balance Due:			   $    719.33
 * Due Date: 			 09-28-2013
