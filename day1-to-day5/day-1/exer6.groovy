println "Please enter a first number"
String s1 = System.console().readLine()
Integer number1 = Integer.parseInt(s1)
println "Please enter a second number"
String s2 = System.console().readLine()
Integer number2 = Integer.parseInt(s2)
println "Please enter a third number"
String s3 = System.console().readLine()
Integer number3 = Integer.parseInt(s3)

Integer balance = number1
Integer rest = number1 + number2
Integer counter = -1
while (balance >= 0 ) {
balance = balance - number2
rest = rest - number2
counter = counter + 1
}
println "is " +counter +"with a reminder of" +rest