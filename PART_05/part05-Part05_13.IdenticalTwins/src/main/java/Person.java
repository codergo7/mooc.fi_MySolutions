
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public SimpleDate getBirthday() {
        return birthday;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }
    
    
    
    public boolean equals (Object compared){
        if(this == compared){
            return true;
        }
        if(!(compared instanceof Person)){
        return false;
    }
        
        Person test = (Person) compared;
        
        if(this.name.equals(test.name) && this.height == test.height && this.weight == test.weight && this.birthday.equals(test.birthday)){
            return true;
        }
        return false;
    }

    // implement an equals method here for checking the equality of objects
}
