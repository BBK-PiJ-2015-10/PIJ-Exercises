println "Please enter a first number"
String s1 = System.console().readLine()
Integer number = Integer.parseInt(s1)
Integer high = number
while (number != -1) {
println "Please enter another number "
s1 = System.console().readLine()
number = Integer.parseInt(s1)
if (high <= number ) {
   high = number
   }
}
println "The highest number entered was " +high   