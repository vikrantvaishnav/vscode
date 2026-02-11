package steamAPI;

import java.util.ArrayList;

public class EvenNumber {

	    void main(){
	        ArrayList<Integer> number = new ArrayList<>();

	        for(int i=0;i< 10;i++){
	            number.add(Integer.parseInt(IO.readln()));
	        }

	        ArrayList<Integer> even = new ArrayList<>( number.stream().filter(n->n%2==0).toList());

	        IO.println("Original Numbers: "+number);
	        IO.println("Even Numbers: "+ even);
	    }
	
}

