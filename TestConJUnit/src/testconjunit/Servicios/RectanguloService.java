package testconjunit.Servicios;

import testconjunit.Entidades.Rectangulo;

public class RectanguloService {

    Rectangulo rs = new Rectangulo();

    public double calcularArea(Rectangulo r) {

        return r.getAncho() * r.getLargo();
    }

    public double calcularPerimetro(Rectangulo r) {
        return 2 * (r.getAncho() + r.getLargo());
    }
}
