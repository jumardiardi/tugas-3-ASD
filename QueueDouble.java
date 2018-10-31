import java.util.ArrayList;

public class QueueDouble {

	ArrayList<Double> tinggi_badan= new ArrayList<Double>();
	int back = -1;
	
	public void insert(double value){
		tinggi_badan.add(value);
	}
	
	public double get(){
		double value = tinggi_badan.get(0);
		tinggi_badan.remove(0);
		return value;
	}
	
	public void cetak(){
		System.out.println("Data tinggi Badan Mahasiswa"+tinggi_badan);

	}

}
