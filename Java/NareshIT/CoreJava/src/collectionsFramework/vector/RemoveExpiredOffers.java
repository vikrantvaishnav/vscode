package collectionsFramework.vector;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveExpiredOffers {

	    public static void expiredOffer(ArrayList<String> offers,int expiredCount){

	        while (expiredCount > 0) {
	        String exOff = IO.readln();

	        Iterator<String> it = offers.iterator();
	        while (it.hasNext()) {
	            String offer = it.next();
	            if (offer.equals(exOff)) {
	                it.remove();   
	            }
	        }
	        expiredCount--;
	    }
	    }

	    public static void display(ArrayList<String> offers){
	        
	        IO.println("Valid offers: "+offers);
	    }
	    



	    public static void main(String[] args) {
	        ArrayList<String> offers = new ArrayList<>();

	        String line = IO.readln();
	        if (line == null) return;   

	        int num = Integer.parseInt(line);
	        if(num<0){
	            IO.println("Invalid offers size.");
	            return;
	        }
	        while (num > 0) {
	            offers.add(IO.readln());
	            num--;
	        }
	        String expLine = IO.readln();
	        int expiredCount = (expLine == null || expLine.isEmpty())
	                        ? 0
	                        : Integer.parseInt(expLine);

	        expiredOffer(offers, expiredCount);
	        display(offers);
	}
	}

