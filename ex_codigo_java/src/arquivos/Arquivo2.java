package arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo2 {

	public static void main(String[] args) throws IOException {
		//as excecoes sao lancadas pois os metodos de escrita e gravacao lancam excecoes.
		//uma vez q podem ocorrer erros durante a operacao
		//Classe java q manipula o caminho
				//possui o metodo get q manipula a localizacao do seu arquivo
				Path path = Paths.get("C:/Users/MauroLQZ/Desktop/JAVA_ESTUDO/Fonte_Arquivos.txt");
		        //Codificaçao do arquivo
				Charset utf8 = StandardCharsets.UTF_8;
                //Criando um arquivo de escrita
				//Esse metodo gera excecoes q tem q ser capituradas
				//alem de retornar um objeto bufferedWriter
				//Utilizando esse objeto nos podemos escrever texto neste arquivo
				
				/*ESCRITA DE ARQUIVOS */
				
				//Todos os objetos q tem o closable eles sao automatico
				//fechados qdo inicializam dentro do try
				//O proprio compilador cria um finally p fechar
				try(BufferedWriter w = Files.newBufferedWriter(path, utf8)){
					
					//Posso manter esse arquivo aberto e escrever qtas vezes eu kizer
					w.write("O Inter ganhou do Flamento!!!\n");
					w.write("\nRumo ao Tetra!!!\n");
					w.write("\nO Gremio se fudeuuuu!!!\n");
					//Para gravar essas linhas tem o metodo flush
					//Pega todo texto q ta na memoria e grava no hd.
					//w.flush();
					//Nao e mais necessario flush, o closable chama o metodo flush
				    //Somente p grande qtde de dados tem q chamar o flush de tempos em tempos
				} catch (IOException e) {
					e.printStackTrace(); 
				} 
				
				/*LEITURA DE ARQUIVOS*/
				
                try(BufferedReader reader = Files.newBufferedReader(path, utf8)){
					
					//readLine le a proxima linha e retorna linha por linha do arquivo
                	String line = null;
                	while((line = reader.readLine()) != null){
						System.out.println(line);						
					}
				} catch (IOException e) {
					e.printStackTrace(); 
				} 				
	}
}
