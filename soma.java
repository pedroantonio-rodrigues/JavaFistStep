package pedroantoniorodrigues.com.github;

public class soma {

	public static void main(String[] args) {
		
		Integer numero1 = Integer.parseInt(args[0]);
		Integer numero2 = Integer.parseInt(args[1]);
		Integer resultado = numero1 + numero2;
		
		System.out.println("soma: " + resultado);
		// System.out.println("soma: " + resultado.toOctalString(resultado));
		// System.out.println("soma: " + resultado.toBinaryString(resultado));
		// System.out.println("soma: " + resultado.toHexString(resultado));

	}

}
