package com.distribuida.principaldao;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.distribuida.dao.FacturaDetalleDAO;
import com.distribuida.entities.FacturaDetalle;

public class FacturaDetalleDAOPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		FacturaDetalleDAO facturaDetalleDAO = context.getBean("facturaDetalleDAOImpl",FacturaDetalleDAO.class);
		//findAll
		List<FacturaDetalle> facturaDetalles= facturaDetalleDAO.findAll();
		for (FacturaDetalle item: facturaDetalles) {
			System.out.println(item.toString());
		}
		context.close();

	}
	}


