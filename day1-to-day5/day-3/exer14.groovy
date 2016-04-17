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
double disxAB
double disyAB
disxAB = Math.abs(A.x-B.x)
disyAC = Math.abs(A.y-B.y)
double disxAC
double disyAC


if (disxAB>=disxAC && disyAB>=disyAC ) {
   println "The point is inside the rectangle"
   }
else {
   println "The point is outside the rectangle"
   }