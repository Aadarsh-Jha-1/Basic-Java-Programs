class Solution {
    public static void main(String[] args) {
        // Creating a 2D array with quantities of different types of sports equipment.
        // The first array contains quantities of footballs, the second array - for basketballs, and the third - for volleyballs.
        int[][] equipmentStorage = {
            {15, 20}, // quantities of footballs
            {12, 25}, // quantities of basketballs
            {18, 30} // quantities of volleyballs
        };
      
        // Print out the quantity of footballs in storage without using arithmetic operations
        System.out.println("Footballs in storage - Size 1: " + equipmentStorage[0][0] + ", Size 5: " + equipmentStorage[0][1]);
    }
}
