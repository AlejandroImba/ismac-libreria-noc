package com.distribuida.principal;

import com.distribuida.entities.Factura;
import com.distribuida.entities.FacturaDetalle;
import com.distribuida.entities.Libro;

public class FacturaDetallePrincipal {

	public static void main(String[] args) {
		Factura factura=new Factura();
		Libro libro=new Libro();
		FacturaDetalle facturadetalle=new FacturaDetalle();
		facturadetalle.setIdFacturadetalle(666);
		facturadetalle.setCantidad(5);
		facturadetalle.setSubtotal(15.25);
		facturadetalle.setFactura(factura);
		facturadetalle.setLibro(libro);
		

	}

}
