println "Please enter a number"
Integer number = Integer.parseInt(System.console().readLine())
Integer cum = 0
for (count=1;count<=number;count++){
x= number % count
if (x==0) {
  cum = 1 + cum
} 
else {
  cum = 0 + cum
}
}  
if (cum<=2) {
println "The number is prime"
}
else {
println "The number is not prime"
}