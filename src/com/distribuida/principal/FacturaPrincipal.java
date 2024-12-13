package com.distribuida.principal;

import java.util.Date;

import com.distribuida.entities.Cliente;
import com.distribuida.entities.Factura;

public class FacturaPrincipal {

	public static void main(String[] args) {
		Cliente cliente = new Cliente(1, "1751043140", "Alejandro","Imbaquingo","Puembo","0995843975","alejoxdeberes@outlook.com");
		Cliente cliente2 = new Cliente(2, "172004313", "Roberto","Quinchuluisa","Tumbaco","094561234","quinchi@hotmail.com");
		Factura factura=new Factura();
		factura.setIdFactura(1);
		factura.setFecha(new Date());
		factura.setNumFactura("FAC-0001");
		factura.setTotalNeto(123.32);
		factura.setIva(15.32);
		factura.setTotal(138.64);
		factura.setCliente(cliente);
		System.out.println(factura.toString());
	}

}


