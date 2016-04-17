
Double paymentcalc (amount,duration,interest) {
   Double cumpayment;
   for (i=0;i<=duration;i++) {
   payment = amount * (1+interest/100);
   amount = cumpayment;
   }   
   return cumpayment;
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
Double total;
total = paymentcalc(loan,term,rate);