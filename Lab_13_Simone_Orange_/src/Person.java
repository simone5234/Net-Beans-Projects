
public class Person {
    
        private String firstName;
        private String lastName;
        private Height height;
        private String hometown;
        private String state;
        


    public Person(String firstName, String lastName, Height height, String hometown, String state){
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.hometown = hometown;
        this.state = state;
        
    }
    
    public Person(String firstName, String lastName, Height height){
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.hometown = "N/A";
        this.state = "N/A";
        
    }
    
    public Person(){
        
        this.firstName = "No";
        this.lastName = "Name";
        height = new Height();
        this.hometown = "N/A";
        this.state = "N/A";
        
    }
    


        @Override
    public String toString() { 
       
        if (state.equals("PA")) {
          
            return "Person {firstName= " + getFirstName() + ", lastName= " + setLastName(lastName) + ", hometown= " + hometown + ", state= " + "Pennsylvania" + ", height=Height{" + height.toString() + "}}\n"; 
            
        } else if (state.equals("N/A")) {
            
            return "Person {firstName= " + getFirstName() + ", lastName= " + setLastName(lastName) + ", hometown= " + hometown + ", state= " + "N/A" + ", height=Height{" + height.toString() + "}}\n";
            
        } else {
            
            return "Person {firstName= " + getFirstName() + ", lastName= " + setLastName(lastName) + ", hometown= " + hometown + ", state= " + "out-of-state" + ", height=Height{" + height.toString() + "}}\n";
            
        }

    }
    
    public void initials() {
        
            String firstInitial = firstName.substring(0, 1);
            String lastInitial = lastName.substring(0, 1);
            System.out.println((firstInitial + "." + lastInitial + "."));
    }
    
    public void initials(int option) {
        
        if (option == 1) {
            String firstInitial = firstName.substring(0, 1);
            System.out.println((firstInitial + "." + lastName));
        }
        else if (option == 2) {
            String lastInitial = lastName.substring(0, 1);
            System.out.println((firstName + " " + lastInitial + "."));
        }
    }

    public String getFirstName() {
        firstName = firstName.toLowerCase();
        String firstName2 = firstName.substring(0,1).toUpperCase();
        String firstName3 = firstName.substring(1);
        firstName = firstName2 + firstName3;
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String setLastName(String lastName) { 
        this.lastName = (lastName.toUpperCase());
        return this.lastName;
    }

    public Height getHeight() {
        return height;
    }

    public void setHeight(Height height) {
        this.height = height;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
