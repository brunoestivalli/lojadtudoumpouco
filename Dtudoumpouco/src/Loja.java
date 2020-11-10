
public class Loja {
	public static void main(String[] args) {
		// Declaração das váriaveis
				String produtos[] = {"Arroz de 5Kg","Arroz de 1Kg","Feijão de 1kg","Farofa de 500g","Nescau de 400g","Peça de picanha 1kg","Cartela com 12 Ovos",
						   			"Cartela com 24 Ovos", "Coca-Cola 2L", "Coca-Cola 600ml"};
				
				double precoProd[] = {30.00, 10.00, 12.00, 6.00, 7.00, 109.99, 12.99,20.99, 6.35, 4.00};
				
				int estoque[] = {10,10,10,10,10,10,10,10,10,10};
				int carrinho[] = new int[10];
				int carrinhoPreco[] = new int[10];
				int codProduto[] = new int[10];
				
				int qntProduto;
				int compraProduto=0;
				int contador = 0;
				int i = 0;
				int pagamento;
				int parcela = 0; 
				double precoTotal = 0.0;
				double z=0.0;
				
				String c, m, r, l, k, j, t, w;
				char continua;
				boolean confirmacao = true;
				boolean validacao = true;
				
				for ( i=0; i<10; i++){
					codProduto[i] = i;
				}
				
				//Mostrando todos os produtos e pedindo pro usuário qual que ele quer
				for (i = 0; i < 10; i++){
					System.out.println("_________________________________________________________\n" + codProduto[i] + " - " + produtos[i]+ "\t\t\tR$:" + precoProd[i]);
				}
				System.out.println("_________________________________________________________");
				
				System.out.println("\n\nDigite o código do produto que deseja comprar: ");
					compraProduto = entrada.nextInt();
					
				if(compraProduto >= 0 && compraProduto <= 9)
				{
					carrinho[contador] = compraProduto;
					validacao = false;
				}
				else
				{
					System.out.println("Digite um código válido");
					validacao = true;
				}
				
				System.out.println("Quantos produtos deseja comprar: ");
					qntProduto = entrada.nextInt();
				System.out.println("\n" + produtos[compraProduto]);
				
				// Verificação se tem produto dentro no estoque
				if(qntProduto < estoque[compraProduto])
				{
					estoque[compraProduto] = estoque[compraProduto] - qntProduto;
					System.out.println("O estoque é de: " + estoque[compraProduto] + " unidades");
				}
				else if(qntProduto > estoque[compraProduto])
				{
					System.out.println("Estoque insuficiente, temos apenas " + estoque[compraProduto] + " produtos");
				}
				
				// Se deseja fazer outra compra
				System.out.println("Desejar continuar comprando S/N: ");
					continua = entrada.next().toUpperCase().charAt(0);
				
				if(continua == 'S')
				{
					confirmacao = true;
				}
				else {
					confirmacao = false;
				}
	}
}
