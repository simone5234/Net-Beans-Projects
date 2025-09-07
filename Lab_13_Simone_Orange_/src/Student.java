
public class Student extends Person {
    private String Major;
    private String AcademicYear;
    private double GPA;

    
    
    public Student(String firstName, String lastName, Height height, String hometown, String state, String Major, String AcademicYear, double GPA) {
        super(firstName, lastName, height, hometown, state);
        
        this.Major = Major;
        this.AcademicYear = AcademicYear;
        this.GPA = GPA;
    }
    
    public Student() {
        super();

        this.Major = "IST";
        this.AcademicYear = "Sr.";
        this.GPA = 3.0;
    }
    
    @Override
      public String toString() { 
          
            return super.toString() + "Student{" + "major=" + this.Major + ", " + "academicYear=" + this.AcademicYear + ", GPA=" + GPA + "}\n";
            
      }
    
    //get & set starts here

    public String getMajor() {
        return Major;
    }

    public void setMajor(String Major) {
        this.Major = Major;
    }

    public String getAcademicYear() {
        return AcademicYear;
    }

    public void setAcademicYear(String AcademicYear) {
        this.AcademicYear = AcademicYear;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    
}//end of Student class brace
