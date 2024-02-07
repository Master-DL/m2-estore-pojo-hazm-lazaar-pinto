package main;

import core.services.TransferMoney;
import core.data.Client;
import core.services.Provider;
import core.services.Store;

public class Main {

	public static void main(String[] args) {
		Provider prov = new Provider();
		TransferMoney bank = new TransferMoney();
		Store store = new Store(prov,bank);
		Client cl = new Client(store);
		
		cl.run();

	}

}
