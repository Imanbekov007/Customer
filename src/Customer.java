import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

public class Customer implements service {
    private String name;
    private String surname;
    private Country country;
    private LocalDate dateofbirth;
    private int pochta;

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", country=" + country +
                ", dateofbirth=" + dateofbirth +
                ", pochta=" + pochta +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public LocalDate getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(LocalDate dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public int getPochta() {
        return pochta;
    }

    public void setPochta(int pochta) {
        this.pochta = pochta;
    }

    public Customer(String name, String surname, Country country, LocalDate dateofbirth, int pochta) {
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.dateofbirth = dateofbirth;
        this.pochta = pochta;
    }


    @Override
    public int agemethod(Customer[] customers) {
        int b = 0;
        for (Customer a : customers) {
            int age = 0;
            LocalDate now = LocalDate.now();
            Period period = Period.between(dateofbirth, now);
            age = period.getYears();
            System.out.println(age + " years old");
            return age;
        }
        return 0;
    }

    @Override
    public Country[] sortmethod(Customer[] customers) {
       Country[]countries=new Country[customers.length];
       int index =0;
        for (Customer country:customers) {
            countries[index]=country.getCountry();
            index++;
        }
        Arrays.sort(countries);
        return countries;
    }


    @Override
    public Customer[] countrymethod2(Customer[] customers, String countryName) {
        int a = 0;
        for (Customer customer : customers) {
            if (customer.getCountry().name().equals(countryName.toUpperCase())) {
                a++;
            }
        }
        Customer[] customers1 = new Customer[a];
        int b = 0;
        for (Customer customer : customers) {
            if (customer.getCountry().name().equals(countryName.toUpperCase())) {
                customers1[b] = customer;
                b++;
            }
        }
        return customers1;
    }

    @Override
    public Customer[] allcustomers(Customer[] customers) {
        return customers;
    }
}

