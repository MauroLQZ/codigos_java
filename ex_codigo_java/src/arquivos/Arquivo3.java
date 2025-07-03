package arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Arquivo3 {
	
	private Path path = Paths.get("C:/Users/MauroLQZ/Desktop/JAVA_ESTUDO/Contas.txt");
	
	private Charset utf8 = StandardCharsets.UTF_8;
	
	public void armazenarContas(ArrayList<Conta> contas) throws IOException{
		try(BufferedWriter w = Files.newBufferedWriter(path, utf8)){
			for (Conta c : contas){
				w.write(c.getCliente() + ";"+ c.getSaldo() + "\n");				
			}
		}
	}
	 
public ArrayList<Conta> recuperarContas() throws IOException{
 		
	ArrayList<Conta> contas = new ArrayList<>();
	
		try(BufferedReader r = Files.newBufferedReader(path, utf8)){
			String line = null;
			while((line = r.readLine()) != null){
				String[] t = line.split(";");
				System.out.println(t[0]+t[1]);
				Conta conta = new Conta(t[0], Double.parseDouble(t[1]));
			    contas.add(conta);
			}
		}
		return contas;
	}

	public static void main(String[] args) throws IOException  {
		
		ArrayList<Conta> contas = new ArrayList<>();
		
		contas.add(new Conta("Mauro", 12000.23));
		contas.add(new Conta("Paulo", 5000.15));
		contas.add(new Conta("Sandra", 7000.18));
		contas.add(new Conta("Bea", 8000.37));
	    
		Arquivo3 op = new Arquivo3();
		op.armazenarContas(contas);
		
		ArrayList<Conta> contas2 = op.recuperarContas();
		for (Conta conta : contas2){
		    conta.exibeSaldo();
		}	
	}
}
