package core.services;

import core.data.Client;
import core.data.Order;
import estorePojo.exceptions.InsufficientBalanceException;
import estorePojo.exceptions.UnknownAccountException;
import estorePojo.exceptions.UnknownItemException;

public interface IFastLane {
    public Order oneShotOrder(Client client, Object item, int qty, String address, String bankAccountRef)
            throws UnknownItemException, InsufficientBalanceException, UnknownAccountException;
}
