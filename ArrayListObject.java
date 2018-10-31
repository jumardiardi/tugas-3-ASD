import java.util.ArrayList;

public class ArrayListObject {

	public static void main(String[] args) {
		ArrayList<Mahasiswa> Data = new ArrayList<Mahasiswa>();
		Data.add(new Mahasiswa("JUMARDI", "D0217508", "Informatika B", "Kamp.Baru"));
		Data.add(new Mahasiswa("NADRA", "D0217512", "Informatika B", "Sepabatu"));
		Data.add(new Mahasiswa("Sayyidah", "D0217327", "Informatika B", "Mamasa"));
		Data.add(new Mahasiswa("Nilasari", "D0217", "Informatika B", "Sendana"));
		Data.forEach(data ->{
		System.out.println("Nama : " + data.getNama() + ", NIM : " + data.getNim() + ", Kelas : " + data.getKelas() + ", Alamat : " + data.getAlamat());
		});

	}

}
