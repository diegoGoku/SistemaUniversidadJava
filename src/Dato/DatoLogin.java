
package Dato;

import java.sql.ResultSet;

public class DatoLogin {
    private String nombre = "";
    private String contraseña = "";
    private final DConexion conn;

    public DatoLogin() {
        this.conn = new DConexion();
    }

    public boolean verificarUsuario(String email, String contraseña) {
        try {
            String sql = "SELECT * FROM usuario WHERE email = '" + email + "' AND contraseña = '" + contraseña + "'";
             ResultSet rs = conn.showDate(sql);
             boolean usuarioEncontrado = rs.next();
        
            if (rs != null) {
                rs.close();
            }

            return usuarioEncontrado;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}