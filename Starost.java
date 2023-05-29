import java.time.LocalDate;

public class Starost extends Student{
    private String groupName;

    public Starost(String name, String surname) {
        super(name, surname);
    }
    public String PostponeColloquium(LocalDate date){
        var abc = "przelozony na: ";
        return abc+date;

    }
}
