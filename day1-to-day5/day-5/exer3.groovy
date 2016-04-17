String PaperSize (String name) {
  double basex = 841
  double basey= 1189
  int len = name.length()
  if (len == 0 ) {
       return;
  }
  else {
       double x = basey;
       double y = basex * 2;
       String name2=name.substring(0,len-1);
       basey = x;
       basex = y;
       return PaperSize(name2);
   }       
}    
   
PaperSize("000")