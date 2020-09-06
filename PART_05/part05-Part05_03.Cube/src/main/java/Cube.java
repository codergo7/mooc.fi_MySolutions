public class Cube {
    /*private int edgeLength;
    private int volume;

    public Cube(int edgeLength) {
        this.edgeLength = edgeLength;
    }

    public int volume(){
        this.volume = this.edgeLength * this.edgeLength * this.edgeLength;
        return this.volume;
    }
    
    @Override
    public String toString() {
        return "The length of the edge is " + this.edgeLength + " and the volume " + this.volume; 
        
    }*/
    
    private int length;
    public Cube(int edgeLength) {
        this.length = edgeLength;
    }
    public int volume() {
        return this.length * this.length * this.length;
    }
    @Override
    public String toString() {
        return "The length of the edge is " + this.length + " and the volume " + volume();
    }
}
