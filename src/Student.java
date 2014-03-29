public class Student {
    public String name;
    public String studentNumber;
    public boolean isResident;
    public final  int tuitionFees = 50000;
    public final  int accomodationFees = 30000;

    public Student(String name, String studentNumber, boolean isResident) {

        this.name = name;
        this.studentNumber =studentNumber;
        this.isResident =isResident;
    }


    public String getStudentNumber() {
        return studentNumber;
    }

    public String getName() {
        return name;
    }

    public boolean getIsResident() {
        return isResident;
    }
    public int getFees(){
        if (isResident) return tuitionFees+accomodationFees;
        else return tuitionFees;
    }
}
