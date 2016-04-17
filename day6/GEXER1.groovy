println "Please enter first number";
int x1=Integer.parseInt(System.console().readLine());
println "Please enter second number";
int x2=Integer.parseInt(System.console().readLine());
println "Please specify operation to perform: (add, subtract, multiply, divide, modulus ";

enum Operation {
   ADD,
   SUBTRACT,
   MULTIPLY,
   DIVIDE,
   MODULUS,
}

Operation oper;

String str=System.console().readLine();
if (str=="add") { 
   oper = "ADD";
   }
if (str=="subtract") { 
   oper = "SUBTRACT";
   }
if (str=="multiply") { 
   oper = "MULTIPLY";
   }
if (str=="divide") { 
   oper = "DIVIDE";
   }
if (str=="modulus") { 
   oper = "MODULUS";
   }
   
switch (oper) {
case "ADD":
println Calculator.add(x1,x2); 
break;
case "SUBTRACT":
println Calculator.subtract(x1,x2); 
break;
case "MULTIPLY":
println Calculator.multiply(x1,x2); 
break;
case "DIVIDE":
println Calculator.divide(x1,x2); 
break;
case "MODULUS":
println Calculator.modulus(x1,x2); 
break;
}