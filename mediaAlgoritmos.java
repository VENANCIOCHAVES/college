/************************************************************
* Nome Aluno: Guilherme Bury		RA:	CADASTRAR 	*
* Nome Aluno: José Venâncio			RA:	CADASTRAR  	*
* Data: 28 de maio de 2015 									*
* Resumo do problema: Saber quais alunos foram aprovados 	*
* e qual a maior nota da turma, sendo 5.0 a nota mínima 	*	
************************************************************/


import javax.swing.*;
public class mediaAlgoritmos{
	public static void main (String[] args){
		int n; 
		double maiorMedia;
		n=Integer.parseInt(JOptionPane.showInputDialog("Entre com o números de alunos da sala"));
		String[] nome = new String[n];
		double [] mb1 = new double[n];
		double [] mb2 = new double[n];
		double [] mFinal = new double[n];
		int [] faltas = new int[n];
		leVetor(nome);
		leVetor(mb1);
		leVetor(mb2);
		leVetor(faltas);
		escreveVetor(nome, mb1, mb2, faltas);
		calcula(nome, mb1, mb2, mFinal, faltas);
		verifica(nome, mFinal);

		
		opcao=Integer.parseInt(JOptionPane.showInputDialog("Digite:\n1. Cadastrar as médias MB1\n"+
		    "2. Cadastrar as médias MB2\n"+"3. Cadastrar as faltas dos alunos\n"+
			"4. Mostrar as médias finais dos alunos\n"+"5. Mostrar a quantidade de alunos aprovados\n"+
		    "6. Mostrar a maior média da turma\n"+"7. Finalizar programa\n"));

		
	}	
/****************************************************************
* Módulo : leVetor 												*
* Descrição: Lê os dados de n alunos e armazena em um vetor. 	*
* Chamada :main 												*
****************************************************************/
	static void leVetor (double[] vetor){
		for(int i=0; i<vetor.length; i++){
			vetor[i]=Double.parseDouble(JOptionPane.showInputDialog(null,"Entre com a informação"));
		}
	}
/********************************************************************
* Módulo : escreveVetor 											*
* Descrição: Mostra os dados de n alunos e armazenados em um vetor. *
* Chamada :main 													*
********************************************************************/
	static void escreveVetor(double [] vetor){
		for(int i=0; i<vetor.length; i++){
			//System.out.println("O aluno"nome[i]+" tem" +mb1[i]+" de MB1\n"+mb2[i]+" de MB2, e "faltas[i]"faltas");
			System.out.println("A média do aluno "+(i+1)+" ="+vet[i]);
		}
	}

/********************************************************************
* Módulo : calcula 													*
* Descrição: Calcula e retorna os alunos aprovados. 				*
* Chamada :main 													*
********************************************************************/
/*	static float calcula{
		//float mb1, mb2;
		//final float média = ( (MB1*2) + (MB2*3) )/5;
		
		mFinal[i]=( (mb1*2) + (mb2*3) )/5;
	}
	
/********************************************************************
* Módulo : verifica													*
* Descrição: Verifica e retorna a maior média da turma. 			*
* Chamada :main 													*
********************************************************************/
/*	static float verifica{
	
	}
*/
}
