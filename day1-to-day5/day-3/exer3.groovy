println "Please type the price of your purchase to the nearest decimals, e.g.  10.55"
double pur = Double.parseDouble(System.console().readLine())
println "Please type the amount being handed to cashier to the nearest decimal "
double paid = Double.parseDouble(System.console().readLine())
double change = paid - pur
String schange
schange = change
println "You will be given " +schange