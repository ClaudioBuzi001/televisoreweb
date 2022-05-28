package it.prova.televisoreweb.dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


import it.prova.televisoreweb.model.Televisore;

public class DB_Mock {
	public static final List<Televisore> LISTA_TELEVISORI = new ArrayList<>();
	
	static {
		// preparo una lista mock perché ancora non ho il collegamento alla
		// base dati
		LISTA_TELEVISORI.add(new Televisore(1L, "Samsung", "X87B", 1000, 50, "HNAI"));
		LISTA_TELEVISORI.add(new Televisore(2L, "LG", "BVBV", 12000, 100, "BBB"));
		LISTA_TELEVISORI.add(new Televisore(3L, "ASUS", "X7B", 100, 20, "HNAI"));
		LISTA_TELEVISORI.add(new Televisore(4L, "Bingo", "AAA7B", 300, 20, "LAMA"));
		LISTA_TELEVISORI.add(new Televisore(5L, "SONY", "BSAB", 1000, 50, "n677BC"));
		LISTA_TELEVISORI.add(new Televisore(6L, "BENQ", "RX-280X", 2678, 50, "SIUUUM"));
		LISTA_TELEVISORI.add(new Televisore(7L, "LENOVO", "LE-980", 1000, 50, "rx-ac"));
	}

	public static Long getNexIdAvailable() {
		Long resultId = null;
		if (LISTA_TELEVISORI == null || LISTA_TELEVISORI.isEmpty()) {
			resultId = 1L;
		}
		resultId=LISTA_TELEVISORI.stream().max(Comparator.comparing(Televisore::getIdTelevisore)).get().getIdTelevisore();
		return ++resultId;
	}
	
}
