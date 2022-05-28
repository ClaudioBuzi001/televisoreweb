package it.prova.televisoreweb.service;

import java.util.List;

import it.prova.televisoreweb.dao.TelevisoreDAO;
import it.prova.televisoreweb.model.Televisore;



public interface TelevisoreService {
	public void setTelevisoreDAO(TelevisoreDAO televisoreDAO);

	public List<Televisore> cercaPerMarcaEModello(String marcaInput, String modelloInput);
	
	public Televisore caricaSingoloTelevisore(Long idTelevisore) throws Exception;
	
	public int inserisciNuovo(Televisore televisoreInput) throws Exception;
	
	public List<Televisore> listaTuttiTelevisori() throws Exception;
	
	public int rimuovi(Long idDaEliminare) throws Exception;
	
	public int modifica(Televisore televisoreInput) throws Exception;
}
