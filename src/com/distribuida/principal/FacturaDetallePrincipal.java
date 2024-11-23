package com.distribuida.principal;

import com.distribuida.entities.Factura;
import com.distribuida.entities.FacturaDetalle;

public class FacturaDetallePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factura factura=new Factura();
		FacturaDetalle facturadetalle=new FacturaDetalle();
		facturadetalle.setIdFacturadetalle(1);
		facturadetalle.setCantidad(5);
		facturadetalle.setSubtotal(15.25);
		facturadetalle.setFactura(factura);
		

	}

}
