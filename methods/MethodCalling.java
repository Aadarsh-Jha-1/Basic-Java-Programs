package methods;

public class MethodCalling {
	
	//Method Declaration 
	public int add(int a, int b) { 

        return a + b; 

    } 

  

    public static void main(String[] args) { 

    	MethodCalling obj = new MethodCalling(); 

        int result = obj.add(3, 5); // Method calling 

        System.out.println("Result: " + result); 

    } 

}


/* In this example: 

1. We identified the add method to call. 

2. Provided arguments 3 and 5 to the method. 

3. Method lookup identified the add method in the MethodCalling class. 

4. Context with parameters a=3 and b=5 is pushed onto the call stack. 

5. The method body is executed, computing 3 + 5. 

6. The result 8 is returned. 

7. The context is popped off the call stack, and control returns to the caller. 

8. The result is printed to the console.  */
 