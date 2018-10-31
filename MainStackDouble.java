
public class MainStackDouble {

	public static void main(String[] args) {
		StackDouble Tinggi = new StackDouble();
		Tinggi.cetak();
		
		Tinggi.push(10.30);Tinggi.cetak();
		Tinggi.push(20.20);Tinggi.cetak();
		Tinggi.push(30.40);Tinggi.cetak();
		
		
		Double tg = Tinggi.pop();Tinggi.cetak();
		System.out.println(tg);

	}

}
