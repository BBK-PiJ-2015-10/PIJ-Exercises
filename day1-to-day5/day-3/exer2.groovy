println "Please type the command-line calculation"
String str1 = System.console().readLine()
Integer len = str1.length()
String oper
Integer cum = 0
Double num1
Double num2
Double result
for (count = 0;count<len;count++){
     char selec=str1.charAt(count)
     switch (selec) {
     case '+':
     num1=Double.parseDouble(str1.substring(0,count))
     num2=Double.parseDouble(str1.substring(count+1,len))
     result = num1+num2
     cum = cum + 1
     break;
     case '-':
     cum = cum + 2
     num1=Double.parseDouble(str1.substring(0,count))
     num2=Double.parseDouble(str1.substring(count+1,len))
     result = num1-num2
     break;
     case '*':
     cum = cum + 3
     num1=Double.parseDouble(str1.substring(0,count))
     num2=Double.parseDouble(str1.substring(count+1,len))
     result = num1*num2
     break;
     case '/':
     cum = cum + 4
     num1=Double.parseDouble(str1.substring(0,count))
     num2=Double.parseDouble(str1.substring(count+1,len))
     result = num1/num2
     break;
     }
}
println result