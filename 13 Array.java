import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] sportsInventory = {7, 8, 10, 3, 6}; // Represents inventory for 5 sports: soccer balls, tennis rackets, cricket bats, basketballs, volleyball
        
         // Print out the whole array
         System.out.println("Sports inventory: " + Arrays.toString(sportsInventory));

        // Print out the number of items for soccer balls (index 0)
        System.out.println("Soccer balls in inventory: " + sportsInventory[0]);
        
        // Finding and printing the total types of items in sports inventory
        int totalTypes = sportsInventory.length;
        System.out.println("Total types of sports items in the inventory: " + totalTypes);
    }
}
