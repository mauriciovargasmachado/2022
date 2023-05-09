import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        String a = "turn this to upper case";
        LocalDate now = LocalDate.now();
        System.out.println(a.toUpperCase());
        System.out.println(now.getDayOfMonth());
    }
}