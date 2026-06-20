import java.util.Scanner;

public class Bus_Ticket {

    static String Seats[][] = new String[9][5];

    static void View() {
        System.out.println("\n========= BUS SEATING ARRANGEMENT =========\n");

        for (int i = 0; i < 9; i++) {

            // 2-seat side
            System.out.print(Seats[i][0] + "  ");
            System.out.print(Seats[i][1]);

            // Gap in the middle
            System.out.print("     ");

            // 3-seat side
            System.out.print(Seats[i][2] + "  ");
            System.out.print(Seats[i][3] + "  ");
            System.out.print(Seats[i][4]);

            System.out.println("\n");
        }

        Scanner get = new Scanner(System.in);
        System.out.print("Do you want to book a bus ticket (Yes/No): ");
        String choice = get.nextLine();

        if (choice.equalsIgnoreCase("Yes")) {
            Booking();
        } else {
            System.out.println("Thank you for visiting our Bus Reservation System.");
        }
    }

    static void Booking() {

        Scanner get = new Scanner(System.in);

        System.out.print("Enter Row Number (1-9): ");
        int T_row = get.nextInt();
        T_row--;

        System.out.print("Enter Seat Number (1-5): ");
        int T_col = get.nextInt();
        T_col--;

        if (Seats[T_row][T_col].equals("SEATS FREE")) {
            Seats[T_row][T_col] = " BOOKED ";
            System.out.println("Your bus ticket has been booked successfully.");
        } else {
            System.out.println("Sorry! This seat is already booked.");
        }

        View();
    }

    Bus_Ticket() {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++) {
                Seats[i][j] = "SEATS FREE";
            }
        }
    }

    public static void main(String[] args) {

        Bus_Ticket bus = new Bus_Ticket();

        Scanner get = new Scanner(System.in);

        System.out.print("Do you want to reserve a bus ticket (Yes/No): ");
        String choice = get.nextLine();

        if (choice.equalsIgnoreCase("Yes")) {
            View();
        } else {
            System.out.println("Thank you for visiting our Bus Reservation System.");
        }
    }
}