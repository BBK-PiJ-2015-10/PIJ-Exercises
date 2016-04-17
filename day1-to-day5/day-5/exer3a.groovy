Double PaperSize (String name) {
  double oriy= 1189
  int len = name.length()
  if (len == 0 ) {
       return 1;
  }
  if (len == 1) {
       double result = 841;
       }
  else {
       double x = basey;
       String name2=name.substring(0,len-1);
       basey = x;
       basex = y;
       return PaperSize(name2);
   }       
}    
   
PaperSize("000")