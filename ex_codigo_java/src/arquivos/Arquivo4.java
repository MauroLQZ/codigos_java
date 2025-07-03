package arquivos;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Arquivo4 {
	
	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("C:/Users/MauroLQZ/Desktop/JAVA_ESTUDO/Conta_Criada.txt");		
		//Charset utf8 = StandardCharsets.UTF_8;
		//Verificar se o caminho existe
		/*
		System.out.println(Files.exists(path));
		//Verificar se e um diretorio
		System.out.println(Files.isDirectory(path));
		//Verificar se e regular- um arq de texto imagem
		System.out.println(Files.isRegularFile(path));
		//pode ser lido p usuario da aplicacao - permissao de acesso.
		System.out.println(Files.isReadable(path));
		//Verificar se ele e executado
		System.out.println(Files.isExecutable(path));
		//Verificar o tamanho do arq - ele precisa acessar o arq e executar operacao de I/O
		//gera exceptions
		System.out.println(Files.size(path));
		//Verificar a ultima vez q ele foi modificado
		System.out.println(Files.getLastModifiedTime(path));
		//Verificar o dono do arquivo
		System.out.println(Files.getOwner(path));
		//Verificar o tipo de arquivo
		System.out.println(Files.probeContentType(path));
		*/
		/* DELETE */
		//Files.deLete(path);
		Files.deleteIfExists(path);
		
		/* Criacao de Arquivos */
		//Para cria um arquivo
		Files.createFile(path);
		//Escrever em um arquivo pequeno
		Files.write(path, "Meu Texto".getBytes());
		
		/* Copia do Arquivo - é um outro destino*/
		//criando a copia
		Path copia = Paths.get("C:/Users/MauroLQZ/Desktop/JAVA_ESTUDO/copia.txt");
		//informando a fonte da copia caso ele exista com replace_existing
		Files.copy(path, copia, StandardCopyOption.REPLACE_EXISTING);
		
		/* MOVER ARQUIVO DE UM DIRETORIO P OUTRO */
		Path mover = Paths.get("C:/Users/MauroLQZ/Desktop/JAVA_ESTUDO/move/copia.txt");
		//Criando diretorio p destino do arquivo movido
		Files.createDirectories(mover.getParent());
		//Mover utilizando o metodo move - se existir ele sobrescreve
		Files.copy(path, mover, StandardCopyOption.REPLACE_EXISTING);
		
	}

}
