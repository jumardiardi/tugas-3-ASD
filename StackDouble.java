import java.util.ArrayList;

public class StackDouble {

	ArrayList<Double> tinggi_badan = new ArrayList<Double>();
	int top = -1;
	
	public void push(Double value){
		tinggi_badan.add(value);
		top = top+1;
		
	}
	
	public Double pop(){
		Double value = tinggi_badan.get(top);
		tinggi_badan.remove(top);
		top = top -1;
		return 0.;
	}
	
	public void cetak(){
		System.out.println("data tinggi badan : " +tinggi_badan.toString());

	}

}
