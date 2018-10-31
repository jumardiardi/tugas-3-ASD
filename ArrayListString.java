import java.util.ArrayList;

public class ArrayListString {

	public static void main(String[] args) {
		ArrayList<String> Mahasiswa = new ArrayList<String>();
		Mahasiswa.add("Jumardi");
		Mahasiswa.add("Arnoldus");
		Mahasiswa.add("Firman");
		Mahasiswa.add("Herianto");
		
		ArrayList<String> Mahasiswa1 = Mahasiswa;
		System.out.println("1" + Mahasiswa.toString());
		System.out.println("2" + Mahasiswa1.toString());
		Mahasiswa.remove(1);
		System.out.println("1" + Mahasiswa.toString());
		System.out.println("2" + Mahasiswa1.toString());

	}

}
