package Main;

import Servicio.CursoService;

public class MainCurso {

    public static void main(String[] args) {
        
        CursoService cs=new CursoService();
        
        cs.crearCurso();
        cs.calcularGananciaSemanal();
    }
}
