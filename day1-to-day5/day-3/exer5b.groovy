println "Please enter some text, all in lowercase please"
String str = System.console().readLine()
Integer len=str.length()
Integer count = 0
Integer output = 0
println "Please enter a a letter, all in lowercase please"
char f = System.console().readLine()
for (count=0;count<len;count++){
char c = str.charAt(count)
if (c==f) {
output = output+1
}
}
println "The letter - " +f +" -" +" can be found " +output + " times"