
package aplicaciongui;

import db.Conexion;
import java.sql.Connection;
import vista.Login;

public class Main {

    public static void main(String[] args) {
        Login login = new Login();
        login.setVisible(true);
        login.setResizable(false);
        
        
    }
    
}
