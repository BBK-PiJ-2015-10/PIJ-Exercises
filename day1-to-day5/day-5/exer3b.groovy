class Point {
  double x;
  double y;
  }

Point Paper (String name) {
  Paper.x = 2;
  Paper.y = 3;
  double baselong= 3
  int len = name.length()
  if (len == 0 ) {
       return ;
  }
  else {
       newshort=baselong;
       newlong=baseshort*2;
       String name2=name.substring(0,len-1);
       baselong = newshort;
       baseshort = newlong;
       return PaperSize(name2);
   }       
}    
   
PaperSize("000")