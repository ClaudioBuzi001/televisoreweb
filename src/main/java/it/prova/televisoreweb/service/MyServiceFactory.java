package it.prova.televisoreweb.service;

import it.prova.televisoreweb.dao.MyDaoFactory;

public class MyServiceFactory {
	private static TelevisoreService TELEVISORE_SERVICE_INSTANCE = null;
	
	public static TelevisoreService getTelevisoreServiceInstance() {
		if(TELEVISORE_SERVICE_INSTANCE == null)
			TELEVISORE_SERVICE_INSTANCE = new TelevisoreServiceImpl();
		
		TELEVISORE_SERVICE_INSTANCE.setTelevisoreDAO(MyDaoFactory.getTelevisoreDAOInstance());
		
		return TELEVISORE_SERVICE_INSTANCE;
	}

}
