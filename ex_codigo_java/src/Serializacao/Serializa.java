package Serializacao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class Serializa {

	public static void main(String[] args) throws Exception {
		
		String[] nomes = {"Ricardo","Beatriz","Sandra"};
        
		Conta conta1 = new Conta("XTI", 111_222_333.444);
		Conta conta2 = new Conta("Mauro", 111_564_325);
		
		/* ESCRITA DE OBJETO*/
		//Classe recebe o endereco pra escrita do objeto
		FileOutputStream fos = new FileOutputStream("C:/Users/MauroLQZ/Desktop/JAVA_ESTUDO/Material_Java/V67_Serializacao/Codigo_Serializacao/objeto.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);//utiliza a File pra realizar as operacoes de Gravar objetos
		oos.writeObject(conta1);//grava um objeto serializavel neste endereco
		oos.writeObject(conta2);
		oos.close();//depois de gravar objeto fecha a conexao
		
		/*LEITURA DO OBJETO*/
		//Classe pra ler o arquivo
		FileInputStream fis = new FileInputStream("C:/Users/MauroLQZ/Desktop/JAVA_ESTUDO/Material_Java/V67_Serializacao/Codigo_Serializacao/objeto.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);//Vai ler o objeto serializavel
		Conta c1 = (Conta)ois.readObject();//Metodo q le o objeto e retorna um objeto neste caso um array de string vai retornar
		Conta c2 = (Conta)ois.readObject();
		ois.close();//fecha a conexao desse stream
		
		System.out.println(c1.exibeSaldo());
		System.out.println(c2.exibeSaldo());
		c1.exibeSaldo();
		c2.exibeSaldo();
		
	}

}
