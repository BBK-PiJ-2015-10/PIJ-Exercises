println "Please enter a first number"
String s1 = System.console().readLine()
Integer number = Integer.parseInt(s1)
Integer prior = number - 1
Integer tcount = 1
Integer ccount = 1
boolean finished = false
boolean consec = true
while (!finished) {
println "Please enter a number"
s1 = System.console().readLine()
number = Integer.parseInt(s1)
    if (number != -1) {
        tcount = tcount + 1
        if (number == prior + 1 ) {
            ccount = ccount + 2
            prior = number
        }    
        else {
        prior = number
        }
    }
    else {
        finished = true
    }
}
if ( tcount == ccount ) {
println "Numbers are consecutive"
}
else {
println "Numbers are not consecutive"
}