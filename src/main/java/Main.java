import ru.netology.services.SchemeService;

public class Main {
    public static void main(String[] args) {
        SchemeService service = new SchemeService();
        int income = 10_000;
        int expense = 3_000;
        int threshold = 20_000;
        long count = service.calculate(income, expense, threshold);
        System.out.println("Отдыхать будет " + count + " месяцев в году.");


    }
}
