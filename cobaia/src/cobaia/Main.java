package cobaia;

public class Main {

	public static void main(String[] args) {
		String hora = "15:09:23";
		String[] partes = hora.split(":");
		System.out.println(Integer.parseInt(partes[1]) + 10);
		
		System.out.printf("%02d %n %d", 5, 9);
	}

}
