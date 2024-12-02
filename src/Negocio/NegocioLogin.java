package Negocio;

import Dato.DConexion;
import Dato.DatoLogin;

public class NegocioLogin {
     private Dato.DatoLogin datoLogin;
     private DConexion conexion;

    public NegocioLogin() {
        this.datoLogin = new DatoLogin();
        this.conexion = new DConexion();
    }
     public boolean autenticar(String email, String contraseña) {
        if (email == null || email.trim().isEmpty()) {
            return false;
        }
        
        if (contraseña == null || contraseña.trim().isEmpty()) {
            return false;
        }
         
        return datoLogin.verificarUsuario(email, contraseña);
    }
}
