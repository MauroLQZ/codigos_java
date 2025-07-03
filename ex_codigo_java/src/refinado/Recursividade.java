package refinado;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Recursividade {
	
	public static int soma(int x) {
		if (x == 0){
		     return x;
		} else {
			System.out.println("O X vale : " + x);
			return x + soma(x-1);		
		}
	}
	
	public static int potencia(int x, int e) {
		if (e == 1) {
			return x;
		} else {
			 int y = x * potencia(x, e-1);	
			 System.out.println("O y vale : " + y);
			 return y;
		}
		
	}
	
	private static void listar(Path path) {
		//se for um arquivo mostra
		   if (Files.isRegularFile(path)) {
			   System.out.println("E Arquivo : "+path.toAbsolutePath());
		   } else {//senao e um diretorio
			   System.out.println("\nANTES DO TRY : "+path.toAbsolutePath());
			   //retorna um diretorio q pode utilizar p percorrer todos os caminhos desse stream
			   try(DirectoryStream<Path> stream = 
					   Files.newDirectoryStream(path)){
				   for (Path p : stream) {
					   //recursividade do listar
					   listar(p);
				}
			   } catch(Exception e) {}   
		   }		
	}
	public static void main(String[] args) {
          		
        System.out.println(soma(10));
        //System.out.println(potencia(3, 4));
		//listar(Paths.get("C:/Users/MauroLQZ/Desktop/JAVA_ESTUDO/"));
		
	}
	

	

}
