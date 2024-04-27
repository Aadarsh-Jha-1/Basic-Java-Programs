mport java.util.*;

class Solution {
    public static void main(String[] args) {
        // TODO: Create a new ArrayList to hold the starship crew members.
        List<String> crewMembers = new ArrayList<>();
        
        // TODO: Add the name of the captain to the crew list.
        crewMembers.add("Jack Sparrow");
        
        // TODO: Add the name of an engineer to the crew list.
        crewMembers.add("Tony Stark");

        // TODO: Greet the captain using their position in the list.
         System.out.println("Welcome Captain "+crewMembers.get(0));

        // TODO: Display the total number of crew members aboard the starship.
        System.out.println("Total Number Of Crew Members = "+crewMembers.size());
    }
}
