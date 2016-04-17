Integer count = 0
class Rectangle {
Point x;
Double y;
}
println "Please enter x coordinate of first point"
c1 = Double.parseDouble(System.console().readLine())
println "Please enter y coordinate of first point"
c2 = Double.parseDouble(System.console().readLine())
Rectangle A = new Rectangle();
A.x = c1;
A.y = c2;
println "Please enter x coordinate of second point"
c1 = Double.parseDouble(System.console().readLine())
println "Please enter y coordinate of second point"
c2 = Double.parseDouble(System.console().readLine())
Rectangle B = new Rectangle();
B.x = c1;
B.y = c2;

double area
double peri

area = Math.abs(A.x-B.x) * Math.abs(A.y-B.y)

peri = 2 * Math.abs(A.x-B.x) + 2 * Math.abs(A.y-B.y)

println "The total are is " +area
println "The perimeter is " +peri