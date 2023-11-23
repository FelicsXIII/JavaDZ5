import ru.netology.services.CalcService;

public class Main {
    public static void main(String[] args) {
        CalcService service = new CalcService();
        System.out.println(service.calculate(100000, 60000, 150000));
    }
}

