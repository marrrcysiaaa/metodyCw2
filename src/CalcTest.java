public class CalcTest {
    public static void main(String[] args) {

        Calc calc = new Calc();

        System.out.println("1 metr to: " + calc.metrToCm(1) + " cm");
        System.out.println("1 metr to: " + calc.metrToMm(1) + " mm");
        System.out.println("100 cm to: " + calc.cmToMetr(100) + " metrów");
        System.out.println("1000 mm to: " + calc.mmToMetr(1000) + " metrów");
    }
}
