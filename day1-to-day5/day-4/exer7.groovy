class Point {
   int x;
   int y;
   int getValue(){
   return x;
   }
   void setValue(int x) {
   this.x=x;
   }
   ;
   boolean isEven(){
      if (x % 2 == 0) {
      return true}
      else {
      return false}
   }
   ;
   void prettyPrint() {
   println x;
   }
   ;
   void toStr() {
   String y=x
   println y;
   }
   ;    
   //Point clone(){
   //Point copy = new Point();
   //copy.x=-x
   //return copy;
   //}
   //;
}

println "Please type a first coordinate";
String str=System.console().readLine();
int n1 = Integer.parseInt(str);


Point A = new Point();
A.x=n1;

A.prettyPrint()
A.toString()