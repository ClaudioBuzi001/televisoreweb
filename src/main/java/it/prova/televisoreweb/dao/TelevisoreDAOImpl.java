package it.prova.televisoreweb.dao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import it.prova.televisoreweb.model.Televisore;

public class TelevisoreDAOImpl implements TelevisoreDAO {

	private Connection connection;

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	@Override
	public List<Televisore> list() throws Exception {
		return DB_Mock.LISTA_TELEVISORI;
	}

	@Override
	public Televisore get(Long id) throws Exception {
		Televisore result = null;

		for (Televisore televisoreItem : DB_Mock.LISTA_TELEVISORI) {
			if (televisoreItem.getIdTelevisore() == id)
				result = televisoreItem;
		}

		return result;
	}

	@Override
	public int update(Televisore input) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Televisore input) throws Exception {
		input.setIdTelevisore(DB_Mock.getNexIdAvailable());
		return DB_Mock.LISTA_TELEVISORI.add(input) ? 1 : 0;
	}

	@Override
	public int delete(Televisore input) throws Exception {
		// tovo Il televisore con lo stesso id del televisore in input
		for (Televisore televisoreItem : DB_Mock.LISTA_TELEVISORI) {
			if (televisoreItem.getIdTelevisore() == input.getIdTelevisore()) {
				DB_Mock.LISTA_TELEVISORI.remove(televisoreItem);

				return 1;
			}
		}

		return 0;
	}

	@Override
	public List<Televisore> findByMarcaEModello(String marca, String modello) {
		List<Televisore> result = new ArrayList<Televisore>();

		for (Televisore televisoreItem : DB_Mock.LISTA_TELEVISORI) {
			if (televisoreItem.getModello().startsWith(modello) && televisoreItem.getMarca().startsWith(marca)) {
				result.add(televisoreItem);
			}
		}
		return result;

	}

}
