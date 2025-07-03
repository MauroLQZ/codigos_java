package refinado;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//anotacao de cabecalho so pode ser aplicado a classes
@Target(ElementType.TYPE)
//sua anotacao precisa ser documentada
@Documented
public @interface Cabecalho {
	
	//criando atributo somente tipos primitivos de dados.
	String instituicao();
	String projeto();
	String dataCriacao();
	String criador();
	//comecando a revisao com o numero 1
	int revisao() default 1;

}
