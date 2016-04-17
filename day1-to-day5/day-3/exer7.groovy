println "Please enter some text, all in lowercase please"
String str = System.console().readLine()
Integer len=str.length()
char t='z'
boolean finished = false
while (!finished) {
   Integer count = 0
   Integer output = 0
   println "Which letter would you like to count"
   char f = System.console().readLine()
      if (f!=t) {
         for (count=0;count<len;count++){
             char c = str.charAt(count)
             if (c==f) {
                 output = output+1    
             }
         }
       println "There are " +output  +" in your text "  
       t = f
      }
      else {
      finished = true
      }
}
