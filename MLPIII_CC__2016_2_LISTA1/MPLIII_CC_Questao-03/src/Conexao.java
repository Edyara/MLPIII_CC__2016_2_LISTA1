
public class Conexao {
	private static Conexao uniqInstance = new Conexao();
	private Conexao(){}
	
	public static Conexao getInstance(){return uniqInstance;}
		
}