/************************************************************
* Nome Aluno: Guilherme Bury		RA:	CADASTRAR 	*
* Nome Aluno: José Venâncio			RA:	CADASTRAR  	*
* Data: 28 de maio de 2015 									*
* Resumo do problema: Saber quais alunos foram aprovados 	*
* e qual a maior nota da turma, sendo 5.0 a nota mínima 	*	
************************************************************/


import javax.swing.*;
public class mediaAlgoritmos{
	public static void main (String args[]){
		
		int numero, opcao;
		numero=Integer.parseInt(JOptionPane.showInputDialog("Entre com o números de alunos da sala"));
	
		//declaração dos vetores
		String nome[] = new String[numero]; 
		
		double  mb1[] = new double[numero];
		double  mb2[] = new double[numero];
		double faltas[] = new double[numero];
		double  mFinal[] = new double[numero];
		double  maiorMedia[] = new double[numero];
		double  aprovados[] = new double[numero];
		
		//chamada dos métodos
		leNomes(nome); 
		
		leVetor(mb1);
		leVetor(mb2);
		leVetor(faltas);
		
		escreveVetor(mb1, nome, mb2, faltas, mFinal);
		
		calcula(nome, faltas, mFinal, aprovados);
		//mFinal=calcula(mb1, mb2, faltas);
		
		verifica(mFinal);
		
		// menu de opcoes
		opcao=Integer.parseInt(JOptionPane.showInputDialog("Digite:\n1. MB1\n"+"2. MB2\n"+
			"3. Faltas\n"+"4. Médias Finais\n"+"5. Alunos aprovados\n"+"6. Maior Média\n"+
			"7. Finalizar\n"));

		switch (opcao){
		case 1:
			System.out.println(mb1);
			break;
		case 2:
			System.out.println(mb2);
			break;
		case 3:
			System.out.println(faltas);
			break;
		case 4:
			System.out.println(mFinal);
			break;
		case 5:
			System.out.println(aprovados);
			break;
		case 6:
			System.out.println(maiorMedia);
			break;
		case 7:
			System.exit(0);
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
		
		
    }
     
/****************************************************************
* Módulo : leNomes 												*
* Descrição: Lê os nomes de n alunos e armazena em um vetor. 	*
* Chamada :main 												*
****************************************************************/
	public static void leNomes (String[] vetor){
		for(int i=0; i<vetor.length; i++){
			vetor[i]=JOptionPane.showInputDialog(null,"Entre com o nome do aluno "+i);
		}
	}
		
		
/****************************************************************
* Módulo : leVetor 												*
* Descrição: Lê os dados de n alunos e armazena em um vetor. 	*
* Chamada :main 												*
****************************************************************/
	public static void leVetor (double[] vetor){
		for(int i=0; i<vetor.length; i++){
			vetor[i]=Double.parseDouble(JOptionPane.showInputDialog(null,"Entre com a informação do aluno "+i+" MB1, MB2 e Faltas"));
		}
	}
/********************************************************************
* Módulo : escreveVetor 											*
* Descrição: Mostra os dados de n alunos e armazenados em um vetor. *
* Chamada :main 													*
********************************************************************/
	public static void escreveVetor(double[] vetor, String[] nome, double[] vetor2, double[] vetor3, double[] vetor4){ //mb1, nome, mb2, faltas, mFinal
		for(int i=0; i<vetor.length; i++){
			System.out.println("O aluno "+nome[i]+", tem "+vetor[i]+" de MB1\n"+vetor2[i]+" de MB2, e "+vetor3[i]+" faltas");
			//System.out.println("Média do aluno "+(i+1)+" ="+vetor[i]);
			System.out.println("A média do aluno "+nome[i]+", é "+((vetor[i] * 2) + (vetor2[i] * 3))/5);
			vetor4[i]=((vetor[i] * 2) + (vetor2[i] * 3))/5;
		}
	}

/********************************************************************
* Módulo : calcula 													*
* Descrição: Calcula e retorna os alunos aprovados. 				*
* Chamada :main 													*
********************************************************************/
	public static double calcula(String[] nome, double[] vetor, double[] vetor2, double[] vetor3){ //nome, faltas, mFinal, aprovados
		double contador = 0;
		for(int i=0; i<vetor.length; i++){
			if(vetor[i]<=20 && vetor2[i]>=5){
		    	System.out.println("O aluno "+nome[i]+", foi aprovado");
		        contador++;
			}else{
				System.out.println("O aluno "+nome[i]+", foi reprovado");
		    }
			vetor3[i]=contador;
	        }
		return contador;
	}
	
/********************************************************************
* Módulo : verifica													*
* Descrição: Verifica e retorna a maior média da turma. 			*
* Chamada :main 													*
********************************************************************/
	public static double verifica(double[] vetor){ //mFinal
		double contador = 0;
		for(int i=0; i<vetor.length; i++){
			if(vetor[i]>contador){
				contador=vetor[i];
			}	
		}
	    return contador;
    }
}
