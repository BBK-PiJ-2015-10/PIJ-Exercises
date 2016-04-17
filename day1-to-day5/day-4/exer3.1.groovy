
Double paymentcalc (amount,interest) {
   Double payment;
   payment = amount * (1+interest/100);
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
Double Cumpayment=0;
for (i=0;i<=term;i++) {
     Cumpayment = paymentcalc(loan,rate);
     }
println "The amount borrowed is " +loan;
println "The total payment is" +Cumpayment;