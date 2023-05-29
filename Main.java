import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate a = LocalDate.ofEpochDay(2019-04-03);
        LocalDate b = LocalDate.ofEpochDay(2019- 4 - 3);
       var def = new Starost("Adam", "Karczewski");
       var abc = new Student("Igor", "Wisniewski");
       abc.Learn(a,b);
       abc.Party(a,b);
       System.out.println(abc.getSciencePoints());
       System.out.println(abc.getName());
       System.out.println(abc.getLifePoints());
       System.out.println(abc.IsGoodStudent());
       System.out.println(def.PostponeColloquium(b));
    }
}