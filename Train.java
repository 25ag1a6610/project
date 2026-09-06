import java.util.Scanner;
import java.util.Random;

class seat {
    int code;
    String Name;
    int seatno;

}

class reservation extends seat {
    Random R = new Random();
    Scanner s;

    reservation(Scanner sc) {
        s = sc;
    }

    void booking() {
        
        System.out.print("Enter name:");
        Name = s.nextLine();
        System.out.println("================SEATS SELECTION=================");
        System.out.println("1.GENERAL  2.NON-AC    3.AC");
        System.out.print("Enter choice:");
        int choice = s.nextInt();
        code = 100 + R.nextInt(500);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("=====================================================================");
        System.out.println("                          RESERVATION CONFORMED");
        System.out.println("=====================================================================");

        seatno = 0;
        if (choice == 1) {
            System.out.println("Name:" + Name);
            seatno = 1 + R.nextInt(100);
            System.out.println("SeatNo:" + seatno);
            System.out.println("reservation no:" + code);
            System.out.println("=====================================================================");
            System.out.println(" ");

        } else if (choice == 2) {
            System.out.println("Name:" + Name);
            seatno = 201 + R.nextInt(200);
            System.out.println("SeatNo:" + seatno);
            System.out.println("reservation no:" + code);
            System.out.println("=====================================================================");
            System.out.println(" ");

        } else if (choice == 3) {
            System.out.println("Name:" + Name);
            seatno = 401 + R.nextInt(300);
            System.out.println("SeatNo:" + seatno);
            System.out.println("reservation no:" + code);
            System.out.println("=====================================================================");
            System.out.println(" ");

        }

    }

}

class reserved extends seat {
    Scanner s;

    reserved(Scanner sc) {
        s = sc;
    }

    void check(reservation B) {
        int key = s.nextInt();
        if (key == B.code) {
            System.out.println("=====================================================================");
            System.out.println("                       STATUS:CONFORMED");
            System.out.println("=====================================================================");
            System.out.println("Name:" + B.Name);
            System.out.println("SeatNo:" + B.seatno);

            System.out.println("reservation code:" + B.code);
            System.out.println("=====================================================================");

        }

    }

}

public class Train {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        reservation B = new reservation(sc);

        while (true) {
            System.out.println("================ WELCOME TO INDIAN RAILWAYS=================");
            System.out.println("1.NEW RESERVATION   2.STATUS    3.EXIT");
            System.out.print("Enter your option:");
            int option = sc.nextInt();
            sc.nextLine();

            if (option == 1) {
                B = new reservation(sc);
                B.booking();

            }
            if (option == 2) {
                System.out.print("Enter reservation no:");

                reserved r = new reserved(sc);

                r.check(B);

            }

            if (option == 3) {
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("=====================================================================");
                System.out.println("THANK YOU !");
                System.out.println("=====================================================================");
                break;
            }

        }
        sc.close();
    }

}