import java.util.ArrayList;

public class ArrayListFloat {

	public static void main(String[] args) {
		ArrayList<Float> BeratBadan = new ArrayList<Float>();
		BeratBadan.add((float)55.4);
		BeratBadan.add((float)40.8);
		BeratBadan.add((float)60.0);
		
		System.out.println("Berapa Banyak Data : " + BeratBadan.size());
		System.out.println("Berat Badan : " + BeratBadan);
		BeratBadan.set(0, (float) 60.05);
		BeratBadan.set(2, (float) 70.15);
		System.out.println("Berat Badan : " + BeratBadan);

	}

}
