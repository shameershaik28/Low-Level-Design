package LLD2.DesignPatterns.StructuralType.Adapter;

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

