package LLD1.OOPS.TypeConversion;

public class TypeConversionExample {
    public static void main(String[] args) {

        //Primitive Type Conversion (Widening) – Automatic
        int a = 10;
        double b = a;  // int → double (automatic)

        System.out.println(b);

        //Primitive Type Conversion (Narrowing) – Manual
        double x = 10.8;
        int y = (int) x;  // double → int (manual cast)
        System.out.println(y);

        //String → Integer Conversion
        String s = "123";
        int num = Integer.parseInt(s);
        System.out.println(num);


        //String → Double Conversion
        String s1 = "10.55";
        double d = Double.parseDouble(s1);
        System.out.println(d);

        //String → Boolean Conversion
        String s2 = "true";
        boolean b1 = Boolean.parseBoolean(s2);
        System.out.println(b1);

        // Object → String (toString Conversion)

        Integer x1 = 50;
        String s3 = x1.toString();
        System.out.println(s3);

        // Integer → String Conversion

        int a1 = 100;
        String s4 = String.valueOf(a1);
        System.out.println(s4);

        //String → Enum Conversion

        enum Color { RED, BLUE, GREEN }

        String s5 = "RED";
        Color c = Color.valueOf(s5);
        System.out.println(c);
    }
}
