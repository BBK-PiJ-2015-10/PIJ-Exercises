println "Please enter the short string, all in lower case"
String str1 = System.console().readLine()
Integer len1 = str1.length()
println "Please enter some text, all in lowercase please"
String str2 = System.console().readLine()
Integer len2=str2.length()
Integer count = 0
Integer output = 0
String str3
for (count=0;count<=(len2-len1);count++){
str3 = str2.substring(count,len1+count)
if (str3==str1) {
output = output+1
}
}
println "The string" +str1 +" -" +" can be found " +output + " times" //