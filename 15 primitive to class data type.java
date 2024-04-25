class Solution {
    public static void main(String[] args) {
        // TODO: Declare an Integer variable for account balance and initialize it with a value
        Integer accountBalance = 1500;
        // TODO: Declare a primitive int variable for the withdrawal amount and initialize it with a value
        int withdrawal = 500;
        // TODO: Perform a withdrawal by subtracting the withdrawal amount from the account balance (consider auto-unboxing and auto-boxing)
        Integer withBal = Integer.valueOf(withdrawal);
        Integer remainings = accountBalance-withBal;
        // TODO: Print the new account balance as a string
        System.out.println(remainings.toString());
    }
}
