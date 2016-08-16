
public class ValorLocacao extends Veiculo {
	private float valorLocacao;
	
	public float calcularValorLocacao(float KmInicial, float KmFinal, float ValorKmRodado){
		valorLocacao = (KmFinal - KmInicial) * ValorKmRodado;
		return valorLocacao;
		
	}
}
