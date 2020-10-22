package ConditionalOperator;

/*
int x = 4, y = 3, z = 2;
        // int p =
        x/=(x++)+(x--)+(y++)+(y++)+(z++)+(z++);

        // x+(z++)+(z++)+(y++)+(--z); // 2
        //x*= x+y+z+(x++)+x/z+z%x; // 68
        //x= x + 1;
        // (y--)+(y++)+(x++)+(z++); // 11
        // (x++)+x+(y++)+(z++)+x/y/z + x; // 19

        System.out.println(x);
*/

public class C_Conditional_Or {

    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;


    public C_Conditional_Or(int count, int capacity, boolean open) {
        // Write conditional statement below
        if(count < 1 || count > 9) {
        System.out.println("Invalid reservation!\n");
        }
        guestCount = count;
        restaurantCapacity = capacity;
        isRestaurantOpen = open;
    }


    public void reservationConfirmed(){
        if(restaurantCapacity >= guestCount && isRestaurantOpen) {
            System.out.println("Reservation confirmed");
            isConfirmed = true;
        } else {
            System.out.println("Reservation denied");
            isConfirmed = false;
        }
    }

    public void informUser() {
        if(!isConfirmed) {
            System.out.println("Sorry please contact to restaurant.");
        } else {
            System.out.println("Please enjoy your meal!");
        }
    }


    public static void main(String[] args) {

        C_Conditional_Or threeCapacity = new C_Conditional_Or(11,3,true);
        C_Conditional_Or fiveCapacity = new C_Conditional_Or(4,5,true);

        fiveCapacity.reservationConfirmed();
        fiveCapacity.informUser();

        threeCapacity.reservationConfirmed();
        threeCapacity.informUser();


    }
}
