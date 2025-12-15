package interfacce.Printer;

public class InterfaceImplementation {

	void main() {
		
		PrinterDemo pr = new PrinterDemo();
		
		Printer p1 = pr.getPrinter();
		p1.print();
	}

}
