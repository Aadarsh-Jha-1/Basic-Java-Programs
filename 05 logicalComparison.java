class Solution {
    public static void main(String[] args) {
        //Declare and initialize variables for fuel capacity (1500 gallons), consumption (120 gallons/hour), and flight duration (2 hours)
        int fuelCapacity = 1500;
        int consumptionPerHour = 120;
        int flightDuration = 2;

        //Calculate the remaining fuel after the flight
        int remainingFuel = fuelCapacity - (flightDuration * consumptionPerHour);
        

        //Use a logical operation to determine if the remaining fuel is more than half of the fuel capacity
        boolean fuelForNextJourney = remainingFuel > (fuelCapacity/2);

        //Print out the result in a format: "Enough fuel for the next journey? true/false"
        
        System.out.println("Enough fuel for the next journey? " + fuelForNextJourney);
    }
}
