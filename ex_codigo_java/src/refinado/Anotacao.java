package refinado;

import java.io.Serializable;

@Cabecalho (
		instituicao = "Mauro's Desenvolvimento Ltda.",
		projeto = "Sistema de Avaliaçoes",
		dataCriacao = "04/08/2013",
		criador = "Mauro LQZ",
		revisao = 2
)
@ErrosCorrigidos(erros = {"0001", "0002"})  
//@ErrosCorrigidos(erros = "0001") //somente um atalho
//@ErrosCorrigidos("0001" ) // com o campo value

//todo a classe q implementa um serializable precisa
//add um numero serial
//mas nao kero q o numero serial seja implementado, para o compilador nao apontar erro crio
@SuppressWarnings("serial")
public class Anotacao implements Serializable{

	//qdo eu crio uma variavel privada e nao utilizo ela
	@SuppressWarnings("unused")
	private int x;
	
	//vc criou esse metodo e nao ker mais utiliza-lo
	//no futuro ele nao sera utilizado
	@Deprecated
	public void anotar() {}
	
	//informa qdo vc sobreescreve um metodo
	@Override
	public String toString() {
		return null;
	}
    //
}
