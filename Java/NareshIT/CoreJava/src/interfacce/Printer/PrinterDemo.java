package interfacce.Printer;

public class PrinterDemo {
	
	
	public Printer getPrinter() {
	
		return new Printer() {

			@Override
			public void print() {
				
				System.out.println("Hello java");
			}
		};
	

	}
	
	
	
}
