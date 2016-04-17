println "Please enter a first number"
String s1 = System.console().readLine()
Integer number1 = Integer.parseInt(s1)
println "Please enter a second number"
String s2 = System.console().readLine()
Integer number2 = Integer.parseInt(s2)
Integer counter = number1
Integer sum = 0
while (counter > 0 ) {
sum = sum + number2
counter = counter - 1
}
println "The product of the two numbers is " +sum 