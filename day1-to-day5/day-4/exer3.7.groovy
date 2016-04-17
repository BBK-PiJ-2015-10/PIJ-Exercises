
Double annualpayments (amount,interest,duration) {
   Double mortgage = 0;
   Double comp = 1;
   for (i=1;i<=duration;i++) {
   comp = (1+interest/100)*comp;
   }
   mortgage = ((interest/100)*amount*comp)/(comp-1)
   return mortgage;
   }   

Double totalpayment (amount,interest,duration) {
    Double total = 0;
    total = annualpayments(amount,interest,duration)*duration;
   return total;
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
Double annual=0;
annual = annualpayments(loan,rate,term);
println "The amount borrowed is " +loan;
println "The amount to pay each year is " +annual;
Double totalp=0;
totalp = totalpayment(loan,rate,term);
println "The total amount to pay is " +totalp;