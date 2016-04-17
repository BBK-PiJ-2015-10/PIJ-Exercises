println "Please type a number"
String str1 = System.console().readLine()
Double num1 = Double.parseDouble(str1)
println "Please type a second number"
String str2 = System.console().readLine()
Double num2 = Double.parseDouble(str2)
Double total = 0
println "Please specify the operation you want to perform: "
println " A for Addition, S for substraction, M for multiplication, and D for division "
char oper = System.console().readLine()
switch (oper) {
case 'A':
total = num1 + num2
println "The addition is: " +total
break;
case 'S':
total = num1 - num2
println "The substraction is: " +total
break;
case 'M':
total = num1 *  num2
println "The multiplicaiton is: " +total
break;
case 'D':
total = num1 / num2
println "The division is: " +total
}