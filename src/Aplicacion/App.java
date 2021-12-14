
package Aplicacion;

import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
    public static void main(String[] arg){
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        
        
        Data.Model.getInstance().cargar();
        
        PresentacionLogin.View v1 = new PresentacionLogin.View();
        PresentacionLogin.Model m1 = new PresentacionLogin.Model();
        PresentacionLogin.Controller c1 = new PresentacionLogin.Controller(m1, v1);
        v1.setVisible(true);
        CONTROLLOGIN = c1;
        
        PresentacionF.View v3 = new PresentacionF.View();
        PresentacionF.Model m3 = new PresentacionF.Model();
        PresentacionF.Control c3 = new PresentacionF.Control(m3, v3);
        CONTROLF = c3;
        
        
        
        PresentacionI.View v4 = new PresentacionI.View();
        PresentacionI.Model m4 = new PresentacionI.Model();
        PresentacionI.Control c4 = new PresentacionI.Control(m4, v4);
        CONTROLI = c4;
        
        Presentacion.View v2 = new Presentacion.View();
        Presentacion.Model m2 = new Presentacion.Model();
        Presentacion.Control c2 = new Presentacion.Control(m2, v2);
        v2.addInternalFrame(v3);
        v2.addInternalFrame(v4);
        CONTROLP = c2;
    }
    public static PresentacionLogin.Controller CONTROLLOGIN;
    public static Presentacion.Control CONTROLP;
    public static PresentacionF.Control CONTROLF;
    public static PresentacionI.Control CONTROLI;
}
