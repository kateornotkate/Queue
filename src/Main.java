import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>(generateClients());
        while (!queue.isEmpty()) {
            Person person = queue.poll();
            person.useTickets();
            if (person.getTickets() > 0) {
                queue.offer(person);
            }
            System.out.println(person);
        }
    }

    static List<Person> generateClients() {
        List<Person> list = new LinkedList<>();
        list.add(new Person("Питер", "Паркер", 3));
        list.add(new Person("Тони", "Старк", 2));
        list.add(new Person("Эдди", "Брок", 4));
        list.add(new Person("Брюс", "Беннер", 2));
        list.add(new Person("Стив", "Роджерс", 3));
        return list;
    }
}