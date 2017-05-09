// The goal of this exercise is providing additional practice with
// double-precision numbers. Write a program that asks the user for
// the total amount borrowed for a mortgage, the number of years to
// pay it back, and the interest rate (in this exercise, we assume
// it is a fixed rate). The program can then calculate how much must
// be paid at the end

print "Enter the total amount borrowed: ";
String str = System.console().readLine();
int amount = Integer.parseInt(str);

print "Enter the number of years to pay it back: ";
str = System.console().readLine();
int term = Integer.parseInt(str);

print "Enter the interest rate: ";
str = System.console().readLine();
double interest = Double.parseDouble(str);

double interestAmount = amount * interest
double yearlyAmount = (amount + interestAmount) / term

println("The total amount to be paid is: " + amount + interestAmount)

println("The money to be paid every year is: " + yearlyAmount)

println("The number of years before the interest is paid is: " + interestAmount / yearlyAmount)
