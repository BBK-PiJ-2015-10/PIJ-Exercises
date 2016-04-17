
Double Power (double a, double b) {
     if (b==0) {
     return 1;
     }
     else {
     Double result = a * Power(a,b-1);
     return result;
     }
}

println Power(2,3)