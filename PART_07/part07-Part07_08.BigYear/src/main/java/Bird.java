
public class Bird {

    private String name;
    private String nameLatin;
    private int observation;

    public Bird(String name, String nameLatin, int observation) {
        this.name = name;
        this.nameLatin = nameLatin;
        this.observation = observation;
    }

    public String getName() {
        return this.name;
    }

    public void setObservation(int observation) {
        this.observation += observation;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.nameLatin + "): " + this.observation + " observations"; //To change body of generated methods, choose Tools | Templates.
    }

}
