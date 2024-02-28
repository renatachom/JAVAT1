package SistemadeLogin;

public class UsuarioErradoException extends Exception {
    private static final long serialVersionUID = 1L;

    public UsuarioErradoException(String message) {
        super(message);
    }
}
