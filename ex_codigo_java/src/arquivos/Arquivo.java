package arquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo { 

	public static void main(String[] args) throws IOException {
		
		System.out.println("Entrando no projeto Arquivo!");
		//Classe java q manipula o caminho
		//possui o metodo get q manipula a localizacao do seu arquivo
		Path path = Paths.get("C:/Users/MauroLQZ/Desktop/JAVA_ESTUDO/Fonte_Arquivos.txt");
        //Metodo q retorna o caminho absoluto desse arquivo
		System.out.println(path.toAbsolutePath());
		//Metodo p verificar o arq pai desse arq. ou o diretoria q ele ta
		System.out.println(path.getParent());
		//a raiz do sistema
		System.out.println(path.getRoot());
		//nome do arquivo
		System.out.println(path.getFileName());
		
		/*CRIACAO DO DIRETORIO P ARMAZENAR O ARQUIVO */
		Files.createDirectories(path.getParent());
		
		/*ESCREVER E LER ARQUIVOS */
		byte[] bytes = "Meu Texto".getBytes();
		//So escreve uma vez e fecha arquivo
		Files.write(path, bytes);//cira, limpa, escreve
		
		//Ler o arquivo
		//meto retorna um conjunto de bytes
		byte[] retorno = Files.readAllBytes(path);
		//imprime o bytes do arquivo
		System.out.println(retorno);
		//imprime em string o arquivo.
		System.out.println(new String(retorno));
	}

}
