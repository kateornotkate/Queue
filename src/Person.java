public class Person {
    private String name;
    private String surname;
    private int tickets;

    public Person(String name, String surname, int tickets) {
        this.name = name;
        this.surname = surname;
        this.tickets = tickets;
    }

    public int getTickets() {
        return tickets;
    }

    public void useTickets() {
        if (tickets > 0) {
            tickets--;
        }
    }

    public String toString() {
        if (tickets == 0) {
            return name + " " + surname + " прокатился на аттракционе в последний раз.";
        } else {
            return name + " " + surname + " прокатился на аттракционе. Оставшееся кол-во билетов: " + tickets;
        }
    }
}