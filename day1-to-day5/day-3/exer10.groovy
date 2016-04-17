Integer count = 0
class Point {
double x;
double y
}
println "Please enter x coordinate of first point"
c1 = Double.parseDouble(System.console().readLine())
println "Please enter y coordinate of first point"
c2 = Double.parseDouble(System.console().readLine())
Point A = new Point();
A.x = c1;
A.y = c2;
println "Please enter x coordinate of second point"
c1 = Double.parseDouble(System.console().readLine())
println "Please enter y coordinate of second point"
c2 = Double.parseDouble(System.console().readLine())
Point B = new Point();
B.x = c1;
B.y = c2;
println "Please enter x coordinate of third point"
c1 = Double.parseDouble(System.console().readLine())
println "Please enter y coordinate of third point"
c2 = Double.parseDouble(System.console().readLine())
Point C = new Point();
C.x = c1;
C.y = c2;
double disAB
double disAC
double disBC

disAB = (Math.abs(A.x-B.x) + Math.abs(A.y-B.y))
disAC = (Math.abs(A.x-C.x) + Math.abs(A.y-C.y))
disBC = (Math.abs(B.x-C.x) + Math.abs(B.y-C.y))

     if (disAB<=disAC && disAB<=disBC ) {
      println "Points A and B are closer" 
      }
     else {
         if (disAC<=disAB && disAC<=disBC ) {
         println "Points A and C are closer" 
         }
         else {
         println "Points C and B are closer " 
         }
     } 