package LLD2.DesignPatterns.StructuralType.Adapter.Example1;

class PrinterAdapter implements Printer {

    private LegacyPrinter legacyPrinter;

    public PrinterAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    @Override
    public void print() {
        legacyPrinter.printOld(); // adapting old method to new interface
    }
}

