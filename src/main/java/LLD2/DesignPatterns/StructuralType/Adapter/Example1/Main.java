package LLD2.DesignPatterns.StructuralType.Adapter.Example1;

public class Main {
    public static void main(String[] args) {

        LegacyPrinter oldPrinter = new LegacyPrinter();

        Printer printer = new PrinterAdapter(oldPrinter);

        printer.print();
    }
}

