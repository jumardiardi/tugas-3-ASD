import java.util.ArrayList;

public class QueueFloat {

	ArrayList<Float> berat_badan = new ArrayList<Float>();
	int back = -1;
	
	public void insert(float value){
		berat_badan.add(value);
	}
	
	public float get(){
		float value = berat_badan.get(0);
		berat_badan.remove(0);
		return value;
	}
	
	public void cetak(){
		System.out.println("Daftar berat badan mahasiswa"+berat_badan);

	}

}
