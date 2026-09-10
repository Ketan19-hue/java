class TicketBooking {

    private boolean seatAvailable = true;


    synchronized void bookTicket(String customerName) {

        System.out.println(customerName + " is trying to book a ticket...");

        if (seatAvailable) {
            System.out.println(customerName + " booked the seat successfully.");
            seatAvailable = false;
        } else {
            System.out.println(customerName + " failed. Seat is already booked.");
        }
    }
}

class Customer extends Thread {

    TicketBooking booking;
    String customerName;

    Customer(TicketBooking booking, String customerName) {
        this.booking = booking;
        this.customerName = customerName;
    }

    @Override
    public void run() {
        booking.bookTicket(customerName);
    }
}

public class inh {

    public static void main(String[] args) {


        TicketBooking booking = new TicketBooking();


        Customer c1 = new Customer(booking, "Rahul");
        Customer c2 = new Customer(booking, "Aman");
        Customer c3 = new Customer(booking, "Rohit");


        c1.start();
        c2.start();
        c3.start();
    }
}