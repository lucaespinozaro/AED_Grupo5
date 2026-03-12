public class Verificador {
public static boolean esSobrePos(Rectangulo r1, Rectangulo r2) {
        boolean shrz = (r1.getEsquina2().getX() < r2.getEsquina2().getX()) || (r1.getEsquina1().getX() > r2.getEsquina2().getX());
        boolean sver = (r1.getEsquina2().getY() < r2.getEsquina1().getY()) || (r1.getEsquina1().getY() > r2.getEsquina2().getY());
        if (!shr && !sver) {
            return true;
        } else {
            return false;
        }
    }
        
public static boolean esJunto(Rectangulo r1, Rectangulo r2) {
        if (esSobrePos(r1, r2)) return false;       
        boolean tcX = r1.getEsquina2().getX() == r2.getEsquina1().getX() || r1.getEsquina1().getX() == r2.getEsquina2().getX();
        boolean tcY = r1.getEsquina2().getY() == r2.getEsquina1().getY() || r1.getEsquina1().getY() == r2.getEsquina2().getY();
        return tcX || tcY;
    }

public static boolean esDisjunto(Rectangulo r1, Rectangulo r2) {
        return !esSobrePos(r1, r2) && !esJunto(r1, r2);
    }
}
