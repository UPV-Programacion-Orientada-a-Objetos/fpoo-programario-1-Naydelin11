package edu.upvictoria.fpoo;

import java.io.IOException;

public class operacion23 {

    public static double CalcularProducto(double articulo, int IVA, int descuento) throws IOException {

        double descuentoDecimal = descuento / 100.0;


        double precioDescuento = articulo - (descuentoDecimal * articulo);

        double iva = IVA / 100.0;
        double precioConIVA = precioDescuento + (iva * precioDescuento);

        return precioConIVA;
    }
}
