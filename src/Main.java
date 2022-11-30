import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Customer customer1 = new Customer("Erbolot", "Zholborsov", Country.UZBEKISTAN, LocalDate.of(2000, 2, 3), 122);
        Customer customer2 = new Customer("Erbol", "Zholborsev", Country.UZBEKISTAN, LocalDate.of(2002, 2, 3), 122);
        Customer customer3 = new Customer("Osmon", "Zholborsuv", Country.USA, LocalDate.of(2003, 2, 3), 122);
        Customer customer4 = new Customer("Adil", "Aytbaev", Country.KYRGYZSTAN, LocalDate.of(2003, 2, 3), 122);
        Customer customer5 = new Customer("Aybek", "Zholdoshev", Country.RUSSIA, LocalDate.of(2003, 2, 3), 122);
        Scanner scanner = new Scanner(System.in);
        Customer[] customers = {customer1, customer2, customer3, customer4, customer5};
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("If you want to see all customers ages write 1\nIf you want to find customers by country write 2 \n" +
                "If you want to see all customers write 3\nIf you want to see customer's countries write 4");
        while (true) {
            switch (scanner.nextInt()) {
                case 1:
                    for (Customer customer : customers) {
                        customer.agemethod(customers);
                    }
                    break;
                case 2:
                    System.out.println(Arrays.toString(customer1.countrymethod2(customers, scanner1.nextLine())));
                    break;
                case 3:
                    System.out.println(Arrays.toString(customer1.allcustomers(customers)));
                    break;
                case 4:
                    System.out.println(Arrays.toString(customer4.sortmethod(customers)));
                    break;
                default:
                    System.out.println("JOk");
            }
        }
    }
}
