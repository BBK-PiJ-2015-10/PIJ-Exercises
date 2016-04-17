


println "Please enter a word"
String str1 = System.console().readLine()
println isPalindrome(str1)

String isPalindrome (String str) {
   int n = str.length()
   if (n<=1) {
   return "It is a Palindrome";
   }
   else {
   char first = str.charAt(0)
   char last = str.charAt(n-1)
        if (first == last) {
            String result=str.substring(1,n-1);
            return isPalindrome(result); 
        }
        else  {
        return "It is not a Palindrome";
        }
   }     
}

