class ReverseArray {
    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 3, 4, 5};  
        System.out.println("Original array: ");  
        for (int i = 0; i < arr.length; i++) {  
            System.out.println(arr[i]);  
        }  
        System.out.println();  
        System.out.println("Array in reverse order: ");  
        //Loop array in reverse order  
        for (int i = arr.length-1; i >= 0; i--) {  
            System.out.println(arr[i]);  
        }  
    }  
}  

/* Output
Original array: 
1
2
3
4
5

Array in reverse order: 
5
4
3
2
1

*/
