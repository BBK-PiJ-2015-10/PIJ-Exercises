println "Please type a number"
String str1 = System.console().readLine()
Double num1 = Double.parseDouble(str1)
println "Please type a second number"
String str2 = System.console().readLine()
Double num2 = Double.parseDouble(str2)
Double total
enum operation {
adds,
subs,
multi,
divi,
}
println "Please specify the operation you want to perform: "
println " adds, subs, multi, divi "
String operation = System.console().readLine()
switch (operation) {
case adds:
total = num1 + num2
println "The addition is: " +total
break;
case subs:
total = num1 - num2
println "The substraction is: " +total
break;
case multi:
total = num1 *  num2
println "The multiplicaiton is: " +total
break;
case divi:
total = num1 / num2
println "The division is: " +total
}
