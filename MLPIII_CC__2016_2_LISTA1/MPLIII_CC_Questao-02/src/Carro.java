
public class Carro {
	public static void main(String[] args) {}
	
	private String cor, modelo;
	private float VelAtual, VelMax;
	
		public String getCor(){return cor;}
		public void setCor(String cor){this.cor = cor;}
		public String getModelo(){return modelo;}
		public void setModelo(String modelo){this.modelo = modelo;}
		public float getVelAtual(){return VelAtual;}
		public void serVelAtual(float VelAtual){this.VelAtual = VelAtual;}
		public float getVelMax(){return VelMax;}
		public void setVelMax(float VelMax){this.VelAtual = VelMax;}
		
		public boolean Ligar(){return true;}
		public void Acelerar(float AumentaVel){
			VelAtual = VelAtual + AumentaVel;
			if (VelAtual > VelMax)
			System.out.println("Velocidade maxima excedida!");
			
		}

}
