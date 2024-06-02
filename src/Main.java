import controller.Controller;
public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        try {
            controller.Run();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}