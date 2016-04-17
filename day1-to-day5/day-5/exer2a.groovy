int Fact (int n ) {
   if (n == 1) {
   return 1;
   }
   else {
   result = n * Fact(n-1);
   return result;
   }
}   

int LFact (int n ) {
   int result = 1
   for (i=n;i>=1;i--) {
   result = i * result
   ;
   }
   return result;
}   

println LFact(1)
println Fact(1)