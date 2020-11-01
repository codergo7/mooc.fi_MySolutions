public class Literacy implements Comparable {
    
    private String name;
    private String year;
    private String gender;
    private double population;

    public Literacy(String name, String year, String gender, Double population) {
        this.name = name;
        this.year = year;
        this.gender = gender;
        this.population = population;
    }

    public Literacy() {
    }

    public double getPopulation() {
        return population;
    }
    
    

    public String setGender() {
        String[] pieces = gender.split(" ");
        this.gender = pieces[0];
        return this.gender;
    }

    @Override
    public String toString() {
        
        return this.name + " (" + this.year + "), " + setGender() + ", " + this.population ; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(Object pop) {
        Literacy pops = (Literacy) pop;
        if(this.population > pops.population) return 1;
        
        if(this.population < pops.population) return -1;
        
        return 0;
        //int otherpops = (int) pops.population;
        //int thispop = (int) this.population;
        
        //return thispop - otherpops; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}