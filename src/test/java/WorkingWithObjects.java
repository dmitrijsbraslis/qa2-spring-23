import model.Student;
import org.junit.jupiter.api.Test;

public class WorkingWithObjects {
    @Test
    public void creatingAndUsingObjects() {
        Student dima = new Student();
        dima.setFirstName("Dmitry");
        dima.setLastName("Tester");
        dima.setEmail("test@test.lv");
        dima.setAge(81);

        Student misha = new Student();
        misha.setFirstName("Mihailina");
        misha.setLastName("The Test Girl");
        misha.setEmail("trololo@misha.lv");
        misha.setAge(18);

//        System.out.println(misha.getFirstName() + " " + misha.getLastName());
        misha.printFullName();

        misha.setLastName("Another Last Name");

        misha.printFullName();
//        System.out.println(misha.getLastName());
    }
}
