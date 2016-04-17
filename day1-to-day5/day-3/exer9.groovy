println "Please enter a word"
String str = System.console().readLine()
Integer len=str.length()
Integer count = 0
Integer rcount = len-1

for (count=0;count<len;count++){
    print str.charAt(count)
    }
for (count=0;count<len;count++) {
    print str.charAt(rcount)  
    rcount = rcount-1
    }
    