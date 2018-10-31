import java.util.ArrayList;

public class StackFloat {

	ArrayList<Float> berat_badan = new ArrayList<Float>();
	int top = -1;
	
	public void push(float value){
		berat_badan.add(value);
		top = top+1;
		
	}
	
	public float pop(){
		float value = berat_badan.get(top);
		berat_badan.remove(top);
		top = top -1;
		return value;
	}
	
	public void cetak(){
		System.out.println("data berat badan : " +berat_badan.toString());

	}

}
