GROUP DETAILS:
Group 11, Class CSE 4A
Akshatha Ramesh    	1KS17CS003
Amogh R			1KS17CS005
Nikhil Subramanya  	1KS17CS046

EXECUTION OF THE PROGRAM:
Our program accepts two command line arguments (M,N). So to run the program, we have to type the command 
	javac HA01G11.java			: to compile the program 
	java HA01G11	M  N			: to execute the program, where M and N is the range of numbers in which we are checking if they 											  are perfectly divisible by it’s digits.  

DESCRIPTION:
1) The main() function accepts two command line arguments M and N. It checks which number is greater and passes the smaller number first to the function passNumber().
2) The function passNumber() increments the value of I through the range M to N. It passes each number in the range to the function checkNumber(). It also prints the digits which are perfectly divisible within the given range.
3) The function checkNumber() extracts each digit of the given number and checks if the number is divisible by the digit. It returns 0 if the number is not divisible by a digit.
4) The function checkDivisible() returns 1 if the number is divisible by the digit. Otherwise it returns 0.

CHALLENGES/ISSUES:
We faced a problem when our program extracted only one digit, checked only with respect to that digit and gave output as DIVISIBLE.
Example:
java HA01G11 1 100
The number 1 is perfectly divisible
The number 2 is perfectly divisible
The number 3 is perfectly divisible
The number 4 is perfectly divisible
The number 5 is perfectly divisible
The number 6 is perfectly divisible
The number 7 is perfectly divisible
The number 8 is perfectly divisible
The number 9 is perfectly divisible
The number 11 is perfectly divisible
The number 21 is perfectly divisible
The number 22 is perfectly divisible
The number 31 is perfectly divisible
The number 33 is perfectly divisible
The number 41 is perfectly divisible
The number 42 is perfectly divisible
The number 44 is perfectly divisible
The number 51 is perfectly divisible
The number 55 is perfectly divisible
The number 61 is perfectly divisible
The number 62 is perfectly divisible
The number 63 is perfectly divisible
The number 66 is perfectly divisible
The number 71 is perfectly divisible
The number 77 is perfectly divisible
The number 81 is perfectly divisible
The number 82 is perfectly divisible
The number 84 is perfectly divisible
The number 88 is perfectly divisible
The number 91 is perfectly divisible
The number 93 is perfectly divisible
The number 99 is perfectly divisible

Later, we solved the logical error by completely tracing the program due to which we got the correct output.
Example:
java HA01G11 1 100
The number 1 is perfectly divisible
The number 2 is perfectly divisible
The number 3 is perfectly divisible
The number 4 is perfectly divisible
The number 5 is perfectly divisible
The number 6 is perfectly divisible
The number 7 is perfectly divisible
The number 8 is perfectly divisible
The number 9 is perfectly divisible
The number 11 is perfectly divisible
The number 12 is perfectly divisible
The number 15 is perfectly divisible
The number 22 is perfectly divisible
The number 24 is perfectly divisible
The number 33 is perfectly divisible
The number 36 is perfectly divisible
The number 44 is perfectly divisible
The number 48 is perfectly divisible
The number 55 is perfectly divisible
The number 66 is perfectly divisible
The number 77 is perfectly divisible
The number 88 is perfectly divisible
The number 99 is perfectly divisible
