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
		
		int n, opcao;
		n=Integer.parseInt(JOptionPane.showInputDialog("Entre com o números de alunos da sala"));
	
		String nome[] = new String[n]; //declaração dos vetores
		
		double  mb1[] = new double[n];
		double  mb2[] = new double[n];
		double faltas[] = new double[n];
		double  mFinal[] = new double[n];
		double  maiorMedia[] = new double[n];
		double  aprovados[] = new double[n];
		
		leNomes(nome); //leNomes recebe os valores
		
		leVetor(mb1);
		leVetor(mb2);
		leVetor(faltas);
		
		escreveVetor(mb1);
		escreveVetor(mb2);
		escreveVetor(faltas);
		
		calcula(mb1, mb2, faltas, aprovados);
		//mFinal=calcula(mb1, mb2, faltas);
		
		verifica(maiorMedia);
	
		
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
	public static void escreveVetor(double [] vetor){
		for(int i=0; i<vetor.length; i++){
			//System.out.println("O aluno"nome[i]+" tem" +mb1[i]+" de MB1\n"+mb2[i]+" de MB2, e "faltas[i]"faltas");
			System.out.println("Média do aluno "+(i+1)+" ="+vetor[i]);
		}
	}

/********************************************************************
* Módulo : calcula 													*
* Descrição: Calcula e retorna os alunos aprovados. 				*
* Chamada :main 													*
********************************************************************/
	public static double calcula(double[] vetor, double[] vetor2, double[] vetor3, double[] vetor4){
		double vetor5[]= new double[vetor.length];
		    for(int i=0; i<vetor.length; i++){
		        vetor5[i]=( (vetor * 2) + (vetor2 * 3) )/5;
		        vetor3[i]=vetor3[i];
	        }
	        return vetor4;
	}
	
/********************************************************************
* Módulo : verifica													*
* Descrição: Verifica e retorna a maior média da turma. 			*
* Chamada :main 													*
********************************************************************/
	public static double verifica(double[] vetor){
	    for(int i=0; i<vetor.length; i++){
			vetor[i]=Double.parseDouble(JOptionPane.showInputDialog(null,"Entre com a informação"));
	    }
	    return vetor;
    }
}
