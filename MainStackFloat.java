
public class MainStackFloat {

	public static void main(String[] args) {
		StackFloat Berat = new StackFloat();
		Berat.cetak();
		
		Berat.push((float) 190.0);Berat.cetak();
		Berat.push((float)170.5);Berat.cetak();
		Berat.push((float)180.10);Berat.cetak();
		Berat.push((float)153.10);Berat.cetak();
		Berat.push((float)190.4);Berat.cetak();
		
		Float br = Berat.pop();Berat.cetak();
		System.out.println(br);
	}

}
