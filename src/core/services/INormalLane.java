package core.services;

import core.data.Cart;
import core.data.Client;
import core.data.Order;
import estorePojo.exceptions.InsufficientBalanceException;
import estorePojo.exceptions.InvalidCartException;
import estorePojo.exceptions.UnknownAccountException;
import estorePojo.exceptions.UnknownItemException;

public interface INormalLane {
    public Cart addItemToCart(Cart cart, Client client, Object item, int qty ) throws UnknownItemException, InvalidCartException;
    public Order pay(Cart cart, String address, String bankAccountRef )
            throws InvalidCartException, UnknownItemException, InsufficientBalanceException, UnknownAccountException;
}
