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




println "The smalles nunber is " +third     