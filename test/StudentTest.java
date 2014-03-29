import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat
public class StudentTest {
    @Test
    public void shouldReturnStudent() throws Exception {
        Student student = new Student("Mary","2120",true);

        assertThat(student.getName(),is("Mary")) ;
        assertThat(student.getStudentNumber(),is("2120")) ;
        assertTrue(student.getIsResident()) ;
    }

    @Test
    public void shouldReturnFeesForResidentStudent() throws Exception {
        Student newStudent = new Student("ken","122",true);
        assertThat(newStudent.getFees() ,is(80000));

    }

    @Test
    public void shouldReturnFeesForNonResidentStudent() throws Exception {
        Student newStudent = new Student("ken","122",false);
        assertThat(newStudent.getFees() ,is(50000));

    }

}
