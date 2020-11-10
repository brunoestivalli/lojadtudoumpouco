import java.util.Scanner;
public class CarPag {
	public static void main(String[] args) {
			//carrinho de compras
			if(contador==0) {
				z=precoProd[compraProduto]*qntProduto;
				System.out.println("0 - "+produtos[carrinho[0]]+"\t\t"+precoProd[carrinho[0]]+"\t\t"+z);
				
			}else{
				for(i=0;i<contador;i++){
					z=precoProd[carrinho[i]]*carrinho[i];
					System.out.println(i+" - "+produtos[carrinho[i]]+"\t\t"+precoProd[carrinho[i]]+"\t\t"+z);
					
				}
			}
			
			System.out.printf("\n\n Total a pagar é de: %.2f Reais\n\n",z);
			//Formas de pagamento
			
				if(pagamento>1 && pagamento<=3) {
					validacao=true;
				}else {
					validacao=false;
				}
				
				
				System.out.println(" _____________________________________________\n|             FORMAS DE PAGAMENTO             |\n|_____________________________________________|\n|1 - Pagamento à vista em dinheiro ou cheque. | \n|_____________________________________________|\n|2 - Pagamento à vista em cartão de crédito.  | \n|_____________________________________________|\n|3 - Pagamento parcelado no Cartão.           | \n|_____________________________________________|\n\n       Digite um número de (1 a 3): " );
				pagamento=read.nextInt();
				
			System.out.println("---D'tudo um Pouco---\n\n\n");
			if (pagamento ==1) {
				z = (z+((z/100)*9));
				z=(z-(z/100)*20);
				System.out.printf("O preço do produto será:  R$ %.2f",z);
				System.out.println(" -- com acrescimo de 9% de imposto e desconto de 20% devido a forma de pagamento.");
				
			}else if(pagamento ==2) {
				z = (z+((z/100)*9));
				z=(z-(z/100)*20);
				System.out.printf("O preço do produto será:  R$ %.2f",z);
				System.out.println(" -- com acrescimo de 9% de imposto e desconto de 15% devido a forma de pagamento.");
				
			}else if (pagamento ==3) {
				z = (z+((z/100)*19));
				System.out.println("Parcelado em 2 ou 3 vezes ? ");
				parcela=read.nextInt();
				if(parcela==2) {
					z=(z+(z/100)*9);
					System.out.printf("O preço do produto será de: R$ %.2f",z);
					System.out.println(" -- com acrescimo de 9% de impostos e sem juros");
					System.out.println("O preço parcelado em 2 vezes será de:  R$: "+(z/2));
				}else {
					z=(z+(z/100)*19);
					System.out.printf("O preço do produto será de: R$ %.2f",z);
					System.out.println("-- com acrescimo de 9% de impostos e 10% de juros");
					System.out.println("O preço parcelado em 3 vezes será de:  R$: "+(z/3));
				}
			}
			
			
			System.out.println("Deseja continuar ? ");
			continua=read.next().toUpperCase().charAt(0);
			
			if(continua=='S') {
				confirmacao=true;
				z=0.0;
			}else {
				l="À vista, dinheiro ou em cheque";
				c="À vista, cartão de credito";
				m="Parcelado em 2 vezes";
				r="Parcelado em 3 vezes";
				k="Impostos de 9% e desconto de 20%";
				j="Impostos de 9% e desconto de 15%";
				t="com acrescimo de 9% de impostos e sem juros";
				w="com acrescimo de 9% de impostos e juros de 10%";
						
						System.out.println("---D'tudo um Pouco---\n\n\n");
			}
			
			
			
			
			
		
		}

	}

