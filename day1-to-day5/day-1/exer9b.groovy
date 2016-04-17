println "Please enter a number (end with -1) "
String str = System.console().readLine()
Integer prior = Integer.parseInt(str)
Integer balance = 1
boolean finished = false
while (!finished) {
  println "Please enter a number (end with -1) "
  str = System.console().readLine()
  number = Integer.parseInt(str)
  if (number != -1 ) {
      if (number == prior + 1 || number == prior - 1 ) {
      balance = 1 * balance 
      }
      else {
      balance = 0 * balance
      }
      prior = number
  } else {
  finished = true
  } 
}
if (balance == 1 ) {
println "The numbers are consecutive"
}
else { 
println "The numbers are not consecutive"
}