import service.SampleService;

public class main {

    public main() {
        doAction();
    }

    private void doAction() {
        SampleService service = new SampleService();
        service.doSampleAction();
    }

    public static void main(String[] args) {
        new main();
    }
}
