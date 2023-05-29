import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Student {
    private String name;
    private String surname;
    private Date birthdate;
    private Integer sciencePoints;
    private Integer lifePoints;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
     void Learn(LocalDate from, LocalDate to){
        lifePoints =+2;
    }
    public void Party(LocalDate from, LocalDate to){
        lifePoints =+2;
    }
    public boolean IsGoodStudent(){
        return Objects.equals(name, "Igor");
    }

    public String getName() {
        return name;
    }
    public Integer getSciencePoints() {
        return sciencePoints;
    }

    public Integer getLifePoints() {
        return lifePoints;
    }

    public Object getSurname() {
        return surname;
    }

    
}
