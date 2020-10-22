package ConditionalOperator;

public class B_Conditional_And {
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;

    public B_Conditional_And(int count, int capacity, boolean open) {
        // Write conditional statement below
        if(count < 1 || count > 8) {
            System.out.println("Invalid reservation");

            guestCount = count;
            restaurantCapacity = capacity;
            isRestaurantOpen = open;
        }
    }

    public void capacityOfRestaurant() {
        if(restaurantCapacity >= guestCount && isRestaurantOpen) { // what if we will do this thing >+.
            System.out.println("Reservation confirmed.");
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
            System.out.println("");
        }

    }
}

