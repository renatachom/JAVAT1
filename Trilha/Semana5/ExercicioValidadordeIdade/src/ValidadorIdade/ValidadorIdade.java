// ValidadorIdade.java
package ValidadorIdade;

public class ValidadorIdade {
    public static void validarIdade(int idade) throws IdadeInvalidaException {
        if (idade < 0 || idade > 150) {
            throw new IdadeInvalidaException("Idade inválida: " + idade);
        }
    }
}
