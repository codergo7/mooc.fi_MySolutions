public class Timer {

    private ClockHand hunderd;
    private ClockHand second;

    public Timer() {
        this.second = new ClockHand(60);
        this.hunderd = new ClockHand(100);
    }

   

    public void advance() {
        this.hunderd.advance();
        if (this.hunderd.value() == 0) {
            this.second.advance();

        }
    }

    @Override
    public String toString() {
        return this.second + ":" + this.hunderd; //To change body of generated methods, choose Tools | Templates.
    }

}
