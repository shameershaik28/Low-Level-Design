package LLD2.DesignPatterns.StructuralType.Adapter;

public class Main {
    public static void main(String[] args) {

        LegacyPrinter oldPrinter = new LegacyPrinter();

        Printer printer = new PrinterAdapter(oldPrinter);

        printer.print();
    }
}

