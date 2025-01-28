class Break
{
public static void main(String [] args)
{
int number=0;
while(number<10)
{
number=number+1;
if(number==5)// check if the number is equal to 5 and if its true the loop terminates at this iteration.
break;
System.out.println(number);// To print the number upto 4 (until the break condition is reached)
}
System.out.println("After break")
}}

/* Output
1
2
3
4
After break
*/
