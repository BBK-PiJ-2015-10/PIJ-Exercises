println "Please enter a number"
Integer number1 = Integer.parseInt(System.console().readLine())
println "Please enter a second number"
Integer number2 = Integer.parseInt(System.console().readLine())
Integer cum = 0
for (count=1;count<=number2;count++){
cum = cum + number1
}
println "The multiplication of both numbers is " +cum