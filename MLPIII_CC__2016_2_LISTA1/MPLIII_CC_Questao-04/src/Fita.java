public class Fita {
	public static void main(String[] args) {}

	private String Titulo;
	private double Preco;

	public Fita(String Titulo, double Preco) {
		super();
		this.Titulo = Titulo;
		this.Preco = Preco;
	}

	public String getTitulo() {return Titulo;}

	public void setTitulo(String Titulo) {this.Titulo = Titulo;}

	public double getPreco() {return Preco;}

	public void setPreco(double Preco) {this.Preco = Preco;}

}
