// IdadeInvalidaRuntimeException.java
package ValidadorIdade;

@SuppressWarnings("serial")
public class IdadeInvalidaRuntimeException extends RuntimeException {
    public IdadeInvalidaRuntimeException(String mensagem) {
        super(mensagem);
    }
}
