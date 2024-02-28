package SistemadeLogin;

import java.io.Serializable;

public class UsuarioBloqueadoException extends Exception implements Serializable {
    private static final long serialVersionUID = 1L;

    public UsuarioBloqueadoException(String message) {
        super(message);
    }
}
