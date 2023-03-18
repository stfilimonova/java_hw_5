import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();

        int low = 200;
        int upper = 300;

        int squareN = (int) service.squareCounter(low, upper);
        System.out.println(squareN);
    }
}