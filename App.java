public class App {

    public static void main(String[] args) {

        float itemPrice = 3.99f;
        int moneyInWallet = 20;

        int numOfFriends = 4;
        final int ageInYears = 36;

        String firstName = "Joffrey";
        String lastName = "Drummond";
        String middleName = "Edward";

        float remainingMoneyInWallet = moneyInWallet - itemPrice;

        int friendsAvg = ageInYears / numOfFriends;

        String fullName = firstName + middleName + lastName;

        System.out
                .println("After buying the combo meal, I only have " + remainingMoneyInWallet + " left in my wallet!");
        System.out.println("I have  " + friendsAvg + " really close friends.");
        System.out.println("My full name is " + fullName);

    }

}
