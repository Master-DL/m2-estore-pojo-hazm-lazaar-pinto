package core.services;

import estorePojo.exceptions.UnknownItemException;

public interface IOrderItems {
    public int order(Store store, Object item, int qty) throws UnknownItemException;
}
