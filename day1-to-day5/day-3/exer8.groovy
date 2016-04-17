println "Please enter a word"
String str = System.console().readLine()
Integer len=str.length()
Integer count = 0
Integer rcount = len-1
Integer ind = 1
for (count=0;count<len;count++){
    if (str.charAt(count) == str.charAt(rcount) ) {
        ind = 1 * ind
        rcount = rcount-1
    }
    else {
    ind = 0 * ind
    rcount = rcount -1
    }    
}
if (ind==1) {
    println "This is a Palindrome"
    }
else {
    println "This is not a Palindrome"
    }