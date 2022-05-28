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
	public Televisore caricaSingoloTelevisore(Long idTelevisore) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int inserisciNuovo(Televisore televisoreInput) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Televisore> listaTuttiTelevisori() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int rimuovi(Long idDaEliminare) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifica(Televisore televisoreInput) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
