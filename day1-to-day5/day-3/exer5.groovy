println "Please enter some text, all in lowercase please"
String str = System.console().readLine()
Integer len=str.length()
Integer count = 0
Integer output = 0
for (count=0;count<len;count++){
char c = str.charAt(count)
if (c=='e') {
output = output+1
}
}
println "The letter -e- can be found " +output + " times"