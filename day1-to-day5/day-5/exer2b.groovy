int Fob (int n) {
    if ( (n==1) || (n==2) ) {
    return 1;
    }
    else {
    int result = Fob(n-1) + Fob(n-2);
    return result;
    }
}    

//int LFob (int n) {
    //int result = 0
    //int cresult = 0
    //for (i=n;i>0;i--) {
        //if ( i<=0) {
        //result=0
        //}
        //if ( (i==1) || (i==2) ) {
        //result=1
        //}
        //else {
        //result = 

println Fob(4)