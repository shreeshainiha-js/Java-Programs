class CopyArray {
    public static void main(String[] args) {
        int [] arr1 = new int [] {1, 2, 3, 4, 5};     
         //Create another array arr2 with size of arr1    
        int arr2[] = new int[arr1.length];    
        //Copying all elements of one array into another    
        for (int i = 0; i < arr1.length; i++) {     
            arr2[i] = arr1[i];     
        }      
         //Display array1    
        System.out.println("Elements of original array: ");    
        for (int i = 0; i < arr1.length; i++) {     
           System.out.print(arr1[i]);    
        }     
            
        System.out.println();    
            
        //Display array2     
        System.out.println("Elements of new array: ");    
        for (int i = 0; i < arr2.length; i++) {     
           System.out.print(arr2[i]);    
        }     
    }    
}   

/* Output
Elements of original array: 
12345
Elements of new array: 
12345
*/
