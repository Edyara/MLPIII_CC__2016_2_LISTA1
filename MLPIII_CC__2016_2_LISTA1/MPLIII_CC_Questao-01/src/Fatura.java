
public class Fatura {
		public static void main(String[] args) {}
		
		private String numero, descricao;
		private int qtd_item;
		private double preco_item;
		
			public String getNumero(){return numero;}
			public void setNumero(String numero){this.numero = numero;}
			public String getDescricao(){return descricao;}
			public void setDescricao(String descricao){this.descricao = descricao;}
			public int getQtd_item(){return qtd_item;}
			public void setQtd_item(int qtd_item){this.qtd_item = qtd_item;}
			public double getPreco_item(){return preco_item;}
			public void setPreco_item(Double preco_item){this.preco_item = preco_item;}

		public double getValorFatura(){
			double total = 0;
			if(preco_item < 0)
				preco_item = 0.0;
			total = preco_item * qtd_item;
			if(total < 0)
				total = 0;
			return total;
		}
}