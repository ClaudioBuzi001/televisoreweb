package it.prova.televisoreweb.service;

import java.util.List;

import it.prova.televisoreweb.dao.TelevisoreDAO;
import it.prova.televisoreweb.model.Televisore;

public class TelevisoreServiceImpl implements TelevisoreService {

	private TelevisoreDAO televisoreDAO;
	
	@Override
	public void setTelevisoreDAO(TelevisoreDAO televisoreDAO) {
		this.televisoreDAO = televisoreDAO;

	}

	@Override
	public List<Televisore> cercaPerMarcaEModello(String marcaInput, String modelloInput) {
		return televisoreDAO.findByMarcaEModello(marcaInput, modelloInput);
	}

	@Override
	public Televisore caricaSingoloTelevisore(Long idTelevisore) throws Exception {
		return televisoreDAO.get(idTelevisore);
	}

	@Override
	public int inserisciNuovo(Televisore televisoreInput) throws Exception {
		return televisoreDAO.insert(televisoreInput);
	}

	@Override
	public List<Televisore> listaTuttiTelevisori() throws Exception {
		return televisoreDAO.list();
	}

	@Override
	public int rimuovi(Long idDaEliminare) throws Exception {
		Televisore daEliminare = caricaSingoloTelevisore(idDaEliminare);
		return televisoreDAO.delete(daEliminare);
	}

	@Override
	public int modifica(Televisore televisoreInput) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
