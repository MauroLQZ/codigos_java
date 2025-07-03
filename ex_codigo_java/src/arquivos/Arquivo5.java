package arquivos;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo5 {

	public static void main(String[] args) throws IOException {
		// recupera os diretorios raiz do computador - getDefault
        Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();
	    for (Path path : dirs) {
	    	System.out.println(path);
	    }
	    /*LISTAR UM CONTEUDO DE UM DIRETORIO */
	    Path dir = Paths.get("C:/Users/MauroLQZ/Desktop/JAVA_ESTUDO/");
	    //Recupera um stream de directorios
	    try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
	    	
	    } catch (IOException | DirectoryIteratorException e)  {
	    	e.printStackTrace();    	
	    }
	}

}
