import java.lang.reflect.Member;
import java.time.LocalDate;
import java.util.ArrayList;

public class Members {
    private String name;
    private LocalDate birthDay;
    private ArrayList<Accounts> accounts = new ArrayList<Accounts>();

    Members(String name, String birthDay){
        this.name = name;
        this.birthDay = LocalDate.parse(birthDay);
    }
}
