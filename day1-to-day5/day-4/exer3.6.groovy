
Double paymentcalc (amount,interest,duration) {
   Double total = 0;
   Double comp = 1;
   for (i=1;i<=duration;i++) {
   comp = (1+interest/100)*comp;
   }
   total = comp * amount
   return total;
   }   

//void annualpayments (a3,i3,d3) {
  // Double payment;
   //Double comp = 1;
   //Double factor =1;
   //for (i=1;i<=d3;i++) {
   //comp = (1+i3/100)*comp;
   //}
   //factor = (comp-1)/(i3/100);
   //payment = paymentcalc(a3,i3,d3)/factor; 
   //println "Cum comp is " +payment
   //}  

//Double intpayperiod (a2,i2,d2) {
  // Double balance
   //balance = paymentcalc(a2,i2,d2);
   //return balance
   //} 
  

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
//annualpayments(loan,rate,term);
