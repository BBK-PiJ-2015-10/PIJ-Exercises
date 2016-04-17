// This section is to enter the original matrix

println " Please enter the # rows of your 2X matrix ";
int l = Integer.parseInt(System.console().readLine());

println " Please enter the # columns of your 2X matrix ";
int m = Integer.parseInt(System.console().readLine());

//This section is to change a coordinate in the matrix

println "Please enter the row position that you are trying to change ";
int rch = Integer.parseInt(System.console().readLine());

println "Please enter the column position that you are trying to change ";
int cch = Integer.parseInt(System.console().readLine());

println "Please enter the value that you are trying to change ";
int vch = Integer.parseInt(System.console().readLine());

println Matrices.Matrix(l,m)
println "Wait"
println Matrices.Coordinates(rch, cch, vch, Matrices.Matrix(l,m))

//This section is to change a row in a matrix

println "Please enter the row position that you are trying to change: ";
int rrch = Integer.parseInt(System.console().readLine());

println "Please specify the # columns in the row that you want to change: "
int crrch = Integer.parseInt(System.console().readLine());
int [] Replacerow;
Replacerow = new int [crrch];
for (count=0;count<crrch;count++) {
    println "Please enter a value";
    Replacerow[count]= Integer.parseInt(System.console().readLine());
    }
    
println Matrices.setRow(rrch,Replacerow, Matrices.Matrix(l,m));

// This section is to change a column in the matrix

//println "Please enter the column position that you are trying to change: ";
//int ccch = Integer.parseInt(System.console().readLine());

//println "Please specify the # rows in the row that you want to change: "
//int rccch = Integer.parseInt(System.console().readLine());
//int [] Replacecol;
//Replacecol = new int [rccch];
//for (count=0;count<rccch;count++) {
    //println "Please enter a value";
    //Replacecol[count]= Integer.parseInt(System.console().readLine());
//    }

  
//println Matrices.setCol(ccch,Replacecol, Matrices.Matrix(l,m));

//println Matrices.Matrix(l,m);
//println Matrices.toS(Matrices.Matrix(l,m));
