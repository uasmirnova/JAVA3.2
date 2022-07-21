public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 65;
        float height = 1.69F;
        float imt = service.calculate(weight, height);
        System.out.println("ИМТ = " + imt);
    }
}
