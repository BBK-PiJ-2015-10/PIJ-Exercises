println "Please enter some text"
String str = System.console().readLine()
Integer l=str.length()
Integer count
for (count=0;count<l;count++) {
println str.charAt(count)
}