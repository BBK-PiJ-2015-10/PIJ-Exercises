
Double paymentcalc (amount,interest,duration) {
   Double payment;
   Double cumpay = 0;
   for (i=1;i<=duration;i++) {
   payment = amount * (1+interest/100);
   amount = payment;
   cumpay = payment + cumpay;
   }
   return cumpay;
   }   

void annualpayments (amount,interest,duration) {
   Double payment;
   for (i=1;i<=duration;i++) {
   payment = amount * (1+interest/100);
   amount = payment;
   println "The payment for year " +i +" is " +payment
   }
   }  

Double intpayperiod (a2,i2,d2) {
   Double balance
   balance = paymentcalc(a2,i2,d2);
   
   
   
   
   
   return balance
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
Cumpayment = paymentcalc(loan,rate,term);
println "The amount borrowed is " +loan;
println "The total amount to pay is " +Cumpayment;
annualpayments(loan,rate,term);
double test;
test = intpayperiod(loan,rate,term);
println "Please work" +test