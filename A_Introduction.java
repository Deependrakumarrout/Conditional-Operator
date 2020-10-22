package ConditionalOperator;

public class A_Introduction {

  /*

    // Here i am creating a program which is intro of the codeAcademy online site by myself ->
    // Its a restaurant program:

    int restaurantCapacity;
    int guestCount;
    boolean isRestaurantOpen;
    boolean isConfirmed;

    public A_Introduction(int capacity, int count, boolean isOpen) {
        // A minimum hotel policy for each room of guestCount 2 guest per room.
        if (count < 1 || count > 3) {
            System.out.println("Access denied...(Sorry) we don't have sufficient room.\nIts our your policy " +"(" + count +" guest are greater then each guestCount per room.)\n");
        }
        restaurantCapacity = capacity;
        guestCount = count;
        isRestaurantOpen = isOpen;
    }

    public void capacityOfRestaurant() {
        if (restaurantCapacity >= guestCount && isRestaurantOpen) {
            System.out.println("Booking confirmed.");
            isConfirmed = true;
        } else {
            System.out.println("Out of our services.");
            isConfirmed = false;
        }
    }

     public void informUser() {
            if (!isConfirmed) {
                    System.out.println("Sorry confirmation denied.\n");
            }
            else {
                System.out.println("Please have a mile.\n");
            }
        }


        public static void main (String[] args) {
            A_Introduction twoUser = new A_Introduction(12, 2, true);
            A_Introduction threeUser = new A_Introduction(8,3,true);
            A_Introduction fourUser = new A_Introduction(5,4,true); // But i want to declare the fourUser in the constructor so that it should show in which object i did'nt get room.
            A_Introduction user1 = new A_Introduction(2,3,true);
            A_Introduction user2 = new A_Introduction(47,5,false);

            // In the above how can i know that which object is showing the Access denied how should i implement it.

            twoUser.capacityOfRestaurant();
            twoUser.informUser();

            threeUser.capacityOfRestaurant();
            threeUser.informUser();

            //fourUser.capacityOfRestaurant();
            //fourUser.informUser();

            user1.capacityOfRestaurant();
            user1.informUser();

            user2.capacityOfRestaurant();
            user2.informUser();

        }

   */

    // There below codes are writing from codeAcademy.

    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;

    public A_Introduction(int count, int capacity,boolean open) {
        if(count < 1 || count > 8) {
            System.out.println("Invalid reservation!");
        }
        guestCount = count;
        restaurantCapacity = capacity;
        isRestaurantOpen = open;
    }

    public void confirmReservation() {
        if (restaurantCapacity >= guestCount && isRestaurantOpen) {
            System.out.println("Reservation confirmed");
            isConfirmed = true;
        } else {
            System.out.println("Reservation denied");
            isConfirmed = false;
        }
    }

    public void informUser() {
        if(!isConfirmed) {
            System.out.println("Unable to confirm reservation, please contact restaurant.");
        } else {
            System.out.println("Please enjoy your meal!");
        }
    }

    public static void main(String[] args) {
        A_Introduction partyOfThree = new A_Introduction(3, 12, true);
        A_Introduction partyOfFour = new A_Introduction(4, 3, true);
        A_Introduction partyOfTen = new A_Introduction(6, 7, true);

        partyOfThree.confirmReservation();
        partyOfThree.informUser();

        partyOfFour.confirmReservation();
        partyOfFour.informUser();

        partyOfTen.confirmReservation();
        partyOfTen.informUser();

    }
}
