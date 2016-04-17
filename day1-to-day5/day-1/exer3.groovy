println "Please enter a first number"
String s1 = System.console().readLine()
Integer numberA = Integer.parseInt(s1)
println "Please enter a second number"
String s2 = System.console().readLine()
Integer numberB = Integer.parseInt(s2)
println "Please enter a third number"
String s3 = System.console().readLine()
Integer numberC = Integer.parseInt(s3)
Integer first = 0
Integer second = 0
Integer third = 0
if (numberA<=numberB & numberA<=numberC & numberB<=numberC) {
    third = numberA
    second = numberB
    first = numberC
}
if (numberA<=numberB & numberA<=numberC & numberC<=numberB) {
    third = numberA
    second = numberC
    first = numberB
}
if (numberB<=numberA & numberB<=numberC & numberA<=numberC) {
    third = numberB
    second = numberA
    first = numberC
}
if (numberB<=numberA & numberB<=numberC & numberC<=numberA) {
    third = numberB
    second = numberC
    first = numberA
}
if (numberC<=numberB & numberC<=numberA & numberA<=numberB) {
    third = numberC
    second = numberA
    first = numberB
}
if (numberC<=numberA & numberC<=numberB & numberB<=numberA) {
    third = numberC
    second = numberB
    first = numberA
}
println "The ascending order of the numbers entered is: " +third +" " +second +" " +first