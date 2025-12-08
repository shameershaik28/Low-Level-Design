package LLD2.SolidDesignPrinciples.OpenClosedPrinciple;

public class Main {
    public static void main(String[] args) {

        DiscountCalculator calc = new DiscountCalculator();

        System.out.println(calc.calculate(new GoldDiscount()));   // 20
        System.out.println(calc.calculate(new SilverDiscount()));// 10
        System.out.println(calc.calculate(new PlatinumDiscount()));// 30

    }
}

