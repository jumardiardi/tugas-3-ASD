
public class MainQueueGeneric {

	public static void main(String[] args) {
		QueueGeneric<Integer> nilaiInteger = new QueueGeneric<Integer>();
		nilaiInteger.setNilai(54321);
		System.out.println(nilaiInteger.getNilai());
		
		QueueGeneric<String> nilaiString = new QueueGeneric<String>();
		nilaiString.setNilai("JUMARDI");
		System.out.println(nilaiString.getNilai());

	}

}
