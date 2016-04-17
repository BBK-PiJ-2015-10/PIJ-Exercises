
Double paymentcalc (amount,interest) {
   Double payment;
   Double cumpay = 0;
   for (i=0;i<3;i++) {
   payment = amount * (1+interest/100);
   amount = payment
   cumpay = payment + cumpay
   }
   return cumpay;
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
Double Cumpayment=0;
for (i=0;i<=term;i++) {
     Cumpayment = paymentcalc(loan,rate);
     }
println "The amount borrowed is " +loan;
println "The total payment is" +Cumpayment;