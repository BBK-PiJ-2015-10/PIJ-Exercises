class Point {
Double x;
Double y;
}

Double distancetoPoint (Double x1,Double y1,Double x2,Double y2) {
       return Math.pow((Math.pow((x2-x1),2)+Math.pow((y2-y1),2)),1/2);
}       

Double distancetoOrigin (Double x3,Double y3) {
       return distancetoPoint(0,0,x3,y3) ;
} 

void moveTo (Point C) {
       C.x= C.x+1
       C.y= C.y+1
}

class Point2 {
    Double x;
    Double y;
    void oppo (Double x, Double y) {
    this.x=-x;
    this.y=-y;
    }
}        

println "Please enter coordinate x of first point";
String str = System.console().readLine();
Double x=Double.parseDouble(str);
println "Please enter coordinate y of first point";
str = System.console().readLine();
Double y=Double.parseDouble(str);
Point A=new Point();
A.x=x;
A.y=y;

println "Please enter coordinate x of second point";
str = System.console().readLine();
x=Double.parseDouble(str);
println "Please enter coordinate y of second point";
str = System.console().readLine();
y=Double.parseDouble(str);
Point B=new Point();
B.x=x
B.y=y


println "The distance between A and B is " + distancetoPoint(A.x,A.y,B.x,B.y);
println "The distance between B and origin is " + distancetoOrigin(B.x,B.y);
moveTo (B)
println "The new coordinates of point B are " +B.x  +"," +B.y;
Point2 Z =new Point2();
Z.x=B.x
Z.y=B.y
Z.oppo(Z.x,Z.y);
println "The opposite coordinates are " +Z.x +"" +Z.y