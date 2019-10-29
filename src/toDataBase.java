import java.util.Scanner;

public class toDataBase {

    int cpr;
    String firstName;
    String lastName;
    int height;
    int weight;
    String description;
    String address;
    int phone;


    Scanner sc = new Scanner(System.in);

    public int enterCpr() {
        System.out.println("indtast cpr:");
        cpr = sc.nextInt();
        return cpr;
    }
    public String enterFirstName() {
        System.out.println("indtast fornavn");
        firstName = sc.next();
        return firstName;
    }

    public int changeCpr() {
        System.out.println("hvilke cpr vil du ændre");
        cpr = sc.nextInt();
        return cpr;
    }
    public String enterLastName() {
        System.out.println("indtast efternavn:");
        lastName = sc.nextLine();
        sc.nextLine();
        return lastName;
    }
    public int enterheight() {
        System.out.println("indtast height:");
        height = sc.nextInt();
        return height;
    }
    public int enterWeight() {
        System.out.println("indtast Weight:");
        weight = sc.nextInt();
        return weight;
    }
    public String enterDescription() {
        System.out.println("indtast Beskrivelse:");
        description = sc.nextLine();
        sc.nextLine();
        return description ;
    }
    public String enteraddress() {
        System.out.println("indtast adresse:");
        address = sc.nextLine();
        return address;
    }
    public int enterPhone() {
        System.out.println("indtast telefonnummer:");
        phone = sc.nextInt();
        return phone;
    }

}


