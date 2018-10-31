
public class MainStackGeneric {

	public static void main(String[] args) {
		StackGeneric tumpuk = new StackGeneric();
		 
		tumpuk.push("Jumardi");tumpuk.cetak();
		tumpuk.push("Nadra");tumpuk.cetak();
		tumpuk.push("Sriwahyuni");tumpuk.cetak();
		tumpuk.push("Arnoldus");tumpuk.cetak();
		tumpuk.push("Rosalina");tumpuk.cetak();
		
		tumpuk.pop();tumpuk.cetak();

	}

}
