package it.prova.televisoreweb.dao;

import java.sql.Connection;
import java.util.List;

import it.prova.televisoreweb.model.Televisore;

public interface TelevisoreDAO extends IBaseDAO<Televisore> {
	public void setConnection(Connection connection);
	public List<Televisore> findByMarcaEModello(String marca ,String modello);

}
