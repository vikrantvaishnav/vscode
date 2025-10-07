package commandline;
import java.text.DecimalFormat;

public class ConvertCelciustoFahrenheit {

	public static void main(String[] args) {
float celsius = Integer.parseInt(args[0]);
		
		float faherenheit = ((9*celsius)/5)+32;
		
		//System.out.println(celsius);
		//System.out.printf("Cel=%.2f",celsius);
		
		DecimalFormat dc=new DecimalFormat("0.0");
		System.out.println("faherenheit="+dc.format(faherenheit));

	}

}
