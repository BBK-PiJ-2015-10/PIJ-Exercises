Integer binaryconverter (String str) {
  Integer len=str.length();
  String str2 = ""
  for (i=len-1;i>=0;i--) {
       str2 = str2+str.charAt(i);
  }      
  Double cum = 0
  for (i=0;i<=len-1;i++) {
      char c = str2.charAt(i)
      if (c=='1') { 
      cum = power(i) + cum;
      }
  }
  return cum;
}

Double power (int n) {
  if (n==0) {
      power=1;
  }
  if (n==1) {
      power=2;
  }
  if (n==2) {
      power=2*2
  }
  if (n>=3) {
      power = Math.pow(2.0,n)
  }        
  return power;   
}             


String decimalconverter(Integer num1) {
   Integer num2;
   Integer num3;
   Integer num4 =0;
   String str3="";
   String a1=1;
   String a2=0;
   Boolean finished=false
   while (!finished) {
       num2 = num1 / 2;
       num3 = num1 % 2;
       num1=num2
          if (num3==1) {
             str3=a1+str3
          }
          else {
             str3=a2+str3
          }      
       if (num2==0) {
       finished = true;
       }   
    }
    return str3;
}
   
   
println "Please enter the binary number";
String str = System.console().readLine();
println "The total is " +binaryconverter(str);
println "Please enter a decimal number";
String str1 = System.console().readLine();
Integer num1= Integer.parseInt(str1);
println "The binary translation is " +decimalconverter(num1)
