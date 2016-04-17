
Double paymentcalc (amount,interest) {
   Double payment;
   payment = amount * (1+interest/100);
   println "The amount to paid this year is " +payment
   return payment;
   }   


println "Please enter amount to borrow";
String str = System.console().readLine();
Double loan = Double.parseDouble(str);
println "Please enter the time to pay the loan in years";
str = System.console().readLine();
Double term = Double.parseDouble(str);
println "Please enter the annual interest rate";
str = System.console().readLine();
Double rate = Double.parseDouble(str);
Double Firstpayment
Firstpayment = paymentcalc(loan,rate);
println "The amount borrowed is " +loan;
println "The first payment is" +Firstpayment;