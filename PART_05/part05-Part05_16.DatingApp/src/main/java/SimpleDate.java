
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public void advance(int days) {
    SimpleDate newDate = new SimpleDate( this.day, this.month, this.year );

    for (int i = 0; i < days; i++) {
            newDate.advance();
    }
    
    this.day = newDate.day;
    this.month = newDate.month;
    this.year = newDate.year;
    
        }

   

    
    public SimpleDate afterNumberOfDays(int days) {
    SimpleDate newDate = new SimpleDate( this.day, this.month, this.year );

    for (int i = 0; i < days; i++) {
            newDate.advance();
            
        }

    return newDate;
}
    
    public void advance(){
        if(this.day<=30){
            this.day +=1;
        }
        if(this.day==31 && this.month<12){
            this.day=1;
            this.month+=1;
        }
        if(this.day == 31 && this.month==12){
            this.day=1;
            this.month=1;
            this.year+=1;
        }
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

}
