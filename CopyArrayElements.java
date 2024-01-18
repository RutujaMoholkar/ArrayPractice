package ArrayCode;


/* Que.2 --Write a Java program to copy elements from one array to another.
 */

public class CopyArrayElements {

	public static void main(String[] args) {
		
		  //Initialize array     
        int [] firstArr = new int [] {101,23,56,79,22,10};     
        
         //Create second array of the size of first array  
        int secondArr[] = new int[firstArr.length];   
        
        //Copying all elements of one array into another    
        for (int i = 0; i < firstArr.length; i++) {     
            secondArr[i] = firstArr[i];     
        }     
        
     
        System.out.println("Original Array Elements : ");    
        for (int i = 0; i < firstArr.length; i++) {     
           System.out.println(firstArr[i]);    
        }     
            
        System.out.println();    
             
        System.out.println("New Array Elements : ");    
        for (int i = 0; i < secondArr.length; i++) {     
           System.out.println(secondArr[i] );    
        }     		

	}

}
