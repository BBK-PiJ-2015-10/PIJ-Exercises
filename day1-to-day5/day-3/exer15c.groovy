//Integer count = 0
//class Point {
//double x;
//double y;
//}
//println "Please enter x coordinate of first point rectangle 1"
//c1 = Double.parseDouble(System.console().readLine())
//println "Please enter y coordinate of first point retangle 1"
//c2 = Double.parseDouble(System.console().readLine())

//Point A = new Point();
//A.x = c1;
//A.y = c2;
//println "Please enter x coordinate of second point rectangle 1"
//c1 = Double.parseDouble(System.console().readLine())
//println "Please enter y coordinate of second point rectangle 1"
//c2 = Double.parseDouble(System.console().readLine())
//Point B = new Point();
//B.x = c1;
//B.y = c2;

//println "Please enter x coordinate of first point rectangle 2"
//c1 = Double.parseDouble(System.console().readLine())
//println "Please enter y coordinate of first point retangle 2"
//c2 = Double.parseDouble(System.console().readLine())
//Point C = new Point();
//C.x = c1;
//C.y = c2;
//println "Please enter x coordinate of second point rectangle 1"
//c1 = Double.parseDouble(System.console().readLine())
//println "Please enter y coordinate of second point rectangle 2"
//c2 = Double.parseDouble(System.console().readLine())
//Point D = new Point();
//D.x = c1;
//D.y = c2;

//println "Please enter x coordinate of fifth point"
//c1 = Double.parseDouble(System.console().readLine())
//println "Please enter y coordinate of fifth point"
//c2 = Double.parseDouble(System.console().readLine())
//Point E = new Point();
//E.x = c1;
//E.y = c2;

//double disxAB
//double disyAB
//disxAB = Math.abs(A.x-B.x)
//disyAB = Math.abs(A.y-B.y)
//double disxAE
//double disyAE
//disxAE = Math.abs(A.x-E.x)
//disyAE = Math.abs(A.y-E.y)

//double disxCD
//double disyCD
//disxCD = Math.abs(C.x-D.x)
//disyCD = Math.abs(C.y-D.y)
//double disxCE
//double disyCE
//disxCE = Math.abs(C.x-E.x)
//disyCE = Math.abs(C.y-E.y)

if ( disxAB>=disxAE && disyAB>=disyAE && disxCD>=disxCE && disyCD>=disyCE )
{
 println "The point is inside both rectangles "
 }
else {if (disxAB>=disxAE && disyAB>=disyAE ) {
        println "The point is inside the first rectangle"
        }
      else {
          if (disxCD>=disxCE && disyCD>=disyCE ) {
               println "The point is inside the second rectangle"
          }
          else {
               println "The point is outside borth rectangles"
          }
      }         
 }    
     