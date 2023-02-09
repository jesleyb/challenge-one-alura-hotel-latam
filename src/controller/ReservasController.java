package controller;

import java.sql.Connection;
import java.sql.SQLException;

import dao.ReservaDAO;
import factory.ConnectionFactory;
import modelo.Reserva;

public class ReservasController {
	private ReservaDAO reservaDAO;
	
	public ReservasController() throws SQLException {
		Connection connection= new ConnectionFactory().recuperar();
		reservaDAO = new ReservaDAO(connection);
	}
	
	public void guardar(Reserva reserva) {
		reservaDAO.guardar(reserva);
	}
}
