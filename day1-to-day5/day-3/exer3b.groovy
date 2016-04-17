println "Please scan the price of the item you want to buy"
Double price = Double.parseDouble(System.console().readLine())
println "Please enter the amount being handed to cashier"
Double paid = Double.parseDouble(System.console().readLine())
Double change = paid - price
String str1 = change
Integer len = str1.length()
String period ='.'
Double num1
Double num2
for (count=0;count<len;count++){
   char loc=str1.charAt(count)
   switch (loc) {
      case '.':
      num1=Double.parseDouble(str1.substring(0,count))
      num2=Double.parseDouble(str1.substring(count+1,count+3))
      break;
    }
}
Integer balance1 = num1
Integer b50 = 0
Integer b20 = 0
Integer b10 = 0
Integer b5 = 0
Integer c2 = 0
Integer c1 = 0
for (count=0;count<=num1;count++){
    if (balance1>=50) {
    b50 = 1 + b50
    balance1 = balance1 - 50
    } 
    else { 
      if (balance1>=20) {
      b20 = 1 +b20
      balance1 = balance1 - 20    
      } 
      else {
         if (balance1>=10) {
         b10 = 1 + b10
         balance1 = balance1 - 10
         }  
         else {
           if (balance1>=5) {
           b5= 1 + b5
           balance1 = balance1 - 5
           }
           else {
              if (balance1>=2) {
              c2 = 1 + c2
              balance1 = balance1 - 2
              }
              else {
                 if (balance1>=1) {
                 c1 = 1 + c1
                 balance1 = balance1 - 1
                 }
              }   
           }        
         }  
      }
    }
}
println "You will get " +b50 +" - 50 bills"    
println "You will get " +b20 +" - 20 bills"
println "You will get " +b10 +" - 10 bills" 
println "You will get " +b5 +" - 5 bills"
println "You will get " +c2 +" - 2 coins"
println "You will get " +c1 +" - 1 coins"


Integer balance2 = num2
Integer c50 = 0
Integer c20 = 0
Integer c10 = 0
Integer c05 = 0
Integer c02 = 0
Integer c01 = 0
for (count=0;count<=num2;count++){
    if (balance2>=50) {
    c50 = 1 + c50
    balance2 = balance2 - 50
    } 
    else { 
      if (balance2>=20) {
      c20 = 1 +c20
      balance2 = balance2 - 20    
      } 
      else {
         if (balance2>=10) {
         c10 = 1 + c10
         balance2 = balance2 - 10
         }  
         else {
           if (balance2>=5) {
           c05= 1 + c05
           balance2 = balance2 - 5
           }
           else {
              if (balance2>=2) {
              c02 = 1 + c02
              balance2 = balance2 - 2
              }
              else {
                 if (balance2>=1) {
                 c01 = 1 + c01
                 balance2 = balance2 - 1
                 }
              }   
           }        
         }  
      }
    }
}
println "You will get " +c50 +" - 50 cents coins"    
println "You will get " +c20 +" - 20 cents coins"
println "You will get " +c10 +" - 10 cents coins" 
println "You will get " +c05 +" - 5 cents coins"
println "You will get " +c02 +" - 2 cents coins"
println "You will get " +c01 +" - 1 cents coins"