class Palindrome{  
 public static void main(String args[]){  
  int r,sum=0,temp;    
  int n=454;
  
  temp=n; //store input in temperory variable    
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum) //check of final sum and temperory variable's values are equal    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}  

/* Output
palindrome number
*/