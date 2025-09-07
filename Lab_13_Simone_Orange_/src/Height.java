
public class Height {
        private int feet;
        private int inches;
    
    
    public Height(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }
    public Height() {
        this.feet = 5;
        this.inches = 6;
    }
    

        @Override
    public String toString() { 
        if ((feet == 5) && (inches == 6)) {
            return "5'6\"";
        }
        else {
            return feet + "'" + inches + "\"";
        }
    }

    public int getFeet() {
        return feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }
    
    
    
}
