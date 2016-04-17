
Double paymentcalc (amount,interest,duration) {
   Double payment;
   Double cumpay = 0;
   for (i=1;i<=duration;i++) {
   payment = amount * (1+interest/100);
   amount = payment;
   println "The payment for year " +i +" is " +payment
   cumpay = payment + cumpay;
   }
   return cumpay;
   }   

Double annualpayments (amount,interest,duration) {
   Double payment;
   Double cumpay = 0;
   for (i=1;i<=duration;i++) {
   payment = amount * (1+interest/100);
   amount = payment;
   println "The payment for year " +i +" is " +payment
   cumpay = payment + cumpay;
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
     Cumpayment = paymentcalc(loan,rate,term);
     }
println "The amount borrowed is " +loan;
println "The total amount to pay is " +Cumpayment;