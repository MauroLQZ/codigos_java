package refinado;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//anotacao de cabecalho so pode ser aplicado a classes
//e metodos
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface ErrosCorrigidos {
	
	//pode se colocar com um nome de string ou
	String[] erros();
	
	//pode se colocar apenas o valor
	//String[] value();
	

}
