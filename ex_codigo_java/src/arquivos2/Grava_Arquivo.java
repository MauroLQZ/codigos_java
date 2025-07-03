package arquivos2;

import javax.swing.JFileChooser;

public class Grava_Arquivo {
	
private void openFile() {
	
		/* Introduzimos a classe JFileChooser (pacote javax.swing) para selecionar arquivos
		 * Construimos uma instância de JFileChooser e a atribui à referência fileChooser.*/
		JFileChooser fileChooser = new JFileChooser();
		
		/* Chamamos o método setFileSelectionMode para especificar se arquivos e/ou diretórios
         * podem ser selecionados pelo usuário.
         * Para esse programa, utilizamos a constante static FILES_ONLY de JFileChooser para 
         * indicar que somente arquivos podem ser selecionados.
         * Outras constantes static são FILES_AND_DIRECTORIES e DIRECTORIES_ONLY.  */
		fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		
		/* Chamamos o método showSaveDialog para exibir o diálogo de JFileChooser intitulado
		 * Save. O argumento this especifica que o diálogo pai de JFileChooser é utilizado 
		 * para determinar a posição do diálogo na tela (se null é passado, o diálogo é 
		 * exibido no centro da janela).
		 * Quando exibido, um diálogo JFileChooser não permite ao usuário interagir com 
		 * qualquer outra janela de programa até o diálogo JFileChooser ser fechado 
		 * (clicando em <Save> ou <Close>). 
		 * Diálogos que se comportam dessa maneira são chamados de diálogos modais:
		 * O usuário seleciona a unidade, o diretório e o nome do arquivo e clica em <Save>. 
		 * O método showSaveDialog retorna um inteiro que especifica o botão (<Save> ou 
		 * <Close>) que foi clicado para fechar o diálogo. 
		 * Abertura da janela para escolha de um arquivo:  */
		/*
		try {
			//int result = fileChooser.showSaveDialog(this);
			int result = fileChooser.showDialog(this);
		 // Se <Cancel> foi clicado comparando result com a constante static CANCEL_OPTION. 
		 // Se foi, o método é encerrado.	
		if (result == JFileChooser.CANCEL_OPTION) {
			return;
		}
		}finally {
			
		}*/
		
		/* O arquivo que o usuário selecionou é recuperado chamando o método getSelectedFile.
		 * O método getSelectedFile retorna um objeto — do tipo File — que encapsula as 
		 * informações sobre o arquivo (isto é, nome, localização etc.). Esse objeto File não 
		 * abre o arquivo. Atribuímos esse objeto File à referência fileName:
		 * Criando um canal de saída para um arquivo: new FileOutputStrean( fileName )    */
		//File fileName = fileChooser.getSelectedFile();
		
		//if (fileName == null || fileName.getName().trim().equals("")) {
			//JOptionPane.showMessageDialog(this, "Invalid File Name", "Invalid File Name", 
					                                        // JOptionPane.ERROR_MESSAGE);
		//} else {
			//try {
			/* Arquivos são abertos criando objetos das classes de fluxo FileInputStrean 
			 * e FileOutputStream. 
			 * Nesse exemplo, o arquivo será aberto para saída: 
			 * um objeto FileOutputStream é criado com a chamada do construtor.
			 * Um argumento é passado para o construtor de FileOutputStream – um objeto File.
			 * 
			 * Arquivos existentes abertos para saída são truncados - todos os dados no 
			 * arquivo são descartados.
			 
			 * A classe FileOutputStream fornece métodos para gravar arrays de byte e bytes
			 * individuais em um arquivo. 
			 * Para esse programa, precisamos gravar objetos em um arquivo uma capacidade não 
			 * fornecida por FileOutputStrean.
			 * 
			 * A solução para esse problema é uma técnica chamada encadeamento de objetos de
			 * fluxo – a capacidade de adicionar os serviços de um fluxo a outro. Para 
			 * encadear um ObjectOutputStream com o FileOutputStream, passamos o objeto 
			 * FileOutputStream para o construtor de ObjectOutputStream.
			 * Criando um canal para gravar objetos:			 */
				//objtoutputstream = new ObjectOutputStream(new FileOutputStream(fileName));
				
				//saveBotao.setEnabled(false);
				//enterBotao.setEnabled(true);
			//} catch (IOException e) {
				
			/* Se ocorre uma IOException (uma exceção que é disparada quando um arquivo é 
			 * aberto para gravação em uma unidade com espaço insuficiente, quando um 
			 * arquivo de leitura é aberto para gravação, quando um arquivo inexistente é 
			 * aberto para leitura, etc.),um JOptionPane é exibido. Se a construção dos dois 
			 * fluxos não disparar uma IOException,o arquivo é aberto. A referência output 
			 * então pode ser utilizada para gravar objetos no arquivo.*/
				//JOptionPane.showMessageDialog(this, "Error Opening File", "Error", 
						                                         //   JOptionPane.ERROR_MESSAGE);
			//}
		}
//--------------------------------------------------------------------------------------------------------------
		/* O método actionPerformed do botão <Enter> chama nosso método addRecord para 
		 * realizar a operação de gravação.  */
	//public void addRecord() {
	public void addRecord() {
		System.out.println("========= ENTREI NO addRecord!  ");
		int numeroConta = 0;
		//BankAccountRecord bankAcountRecord;
		System.out.println(" Estou no addRecord(): ");
		//String jTxtFieldValues[] = userInterfaceBancoUI.getJTxtFieldValues();
		// Codigo nao eh nulo
		//if (!jTxtFieldValues[0].equals("")) {
			//try {
				//numeroConta = Integer.parseInt(jTxtFieldValues[0]);
				//if (numeroConta > 0) {
					//cria um objeto bankAcountRecord serializado para ser usado para gravaçao 
					//objtoutputstream.writeObject(bankAcountRecord);
					//bankAcountRecord = new BankAccountRecord(numeroConta, jTxtFieldValues[1], 
						//	jTxtFieldValues[2], Double.parseDouble(jTxtFieldValues[3]));
					
/* O método writeObject é chamado para gravar o objeto record nesse arquivo. O método flush é 
 * chamado p assegurar q quaisquer dados armazenados na memória sejam gravados no arquivo.*/    	
					//objtoutputstream.writeObject(bankAcountRecord);
					//objtoutputstream.flush();
					//System.out.println("****************** Gravou a conta! ****************");
				}
				//userInterfaceBancoUI.clearJTxtFields();
				//saveBotao.setEnabled(true);
			//	enterBotao.setEnabled(false);
			//	System.out.println("LIMPOU OS CAMPOS!!!!!");
			//} catch (NumberFormatException nfe) {
				//JOptionPane.showMessageDialog(this, "Bad account number or balance", "Invalid Number Format",
					//	JOptionPane.ERROR_MESSAGE);
			//} catch (IOException io) {
				//closeFile();
	//		}
		}
	//}
//}