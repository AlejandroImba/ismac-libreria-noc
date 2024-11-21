package com.distribuida.principal;

import com.distribuida.entities.Cliente;

public class ClientePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Cliente cliente = new Cliente(1, "1751043140", "Alejandro","Imbaquingo","Puembo","0995843975","alejoxdeberes@outlook.com");
		Cliente cliente2 = new Cliente(2, "172004313", "Roberto","Quinchuluisa","Tumbaco","094561234","quinchi@hotmail.com");
		
		
		System.out.println(cliente.toString());
		System.out.println(cliente2.toString());
	}

}
