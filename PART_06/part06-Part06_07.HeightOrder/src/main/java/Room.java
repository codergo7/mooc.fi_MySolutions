
import java.util.ArrayList;

public class Room {

    private ArrayList<Person> list;

    public Room() {

        this.list = new ArrayList<>();
    }

    public Person take() {
        Person shortestPerson = shortest();
        this.list.remove(shortestPerson);

        return shortestPerson;
    }

    public Person shortest() {
        if (this.list.isEmpty()) {
            return null;
        }
        String name = this.list.get(0).getName();
        int shortestHeight = this.list.get(0).getHeight();
        for (Person person : list) {
            if (person.getHeight() < shortestHeight) {
                shortestHeight = person.getHeight();
                name = person.getName();
            }
        }
        return new Person(name, shortestHeight);
    }

    public void add(Person person) {
        this.list.add(person);
    }

    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return this.list;
    }
}
