/************************************************************
* Nome Aluno: Guilherme Bury		RA:	CADASTRAR 	*
* Nome Aluno: José Venâncio			RA:	CADASTRAR  	*
* Data: 20 de maio de 2015 									*
* Resumo do problema: Saber quais alunos foram aprovados 	*
* e qual a maior nota da turma, sendo 5.0 a nota mínima 	*	
************************************************************/


import javax.swing.*;
public class mediaAlgoritmos{
	public static void main (String[] args){
		int n, opcao;
		n=Integer.parseInt(JOptionPane.showInputDialog("Entre com o números de alunos da sala"));
		opcao=Integer.parseInt(JOptionPane.showInputDialog("Digite:\n1. Cadastrar as médias MB1\n"+
		    "2. Cadastrar as médias MB2\n"+"3. Cadastrar as faltas dos alunos\n"+
			"4. Mostrar as médias finais dos alunos\n"+"5. Mostrar a quantidade de alunos aprovados\n"+
		    "6. Mostrar a maior média da turma\n"+"7. Finalizar programa\n"));

		
	}
}	
/****************************************************************
* Módulo : leVetor 												*
* Descrição: Lê os dados de n alunos e armazena em um vetor. 	*
* Chamada :main 												*
****************************************************************/
	public void leVetor{
		int [] alunos = new int[n]
		
	
		for(int i = 0; i<=alunos.length; i++){
			alunos[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do aluno"));
		}
	
	}
/********************************************************************
* Módulo : escreveVetor 											*
* Descrição: Mostra os dados de n alunos e armazenados em um vetor. *
* Chamada :main 													*
********************************************************************/
	public void escreveVetor{
	
	}
	
/********************************************************************
* Módulo : calcula 													*
* Descrição: Calcula e retorna os alunos aprovados. 				*
* Chamada :main 													*
********************************************************************/
	public float calcula{
		float mb1, mb2;
		final float média = ( (MB1*2) + (MB2*3) )/5;
		
	
	}
	
/********************************************************************
* Módulo : verifica													*
* Descrição: Verifica e retorna a maior média da turma. 			*
* Chamada :main 													*
********************************************************************/
	public float verifica{
	
	}