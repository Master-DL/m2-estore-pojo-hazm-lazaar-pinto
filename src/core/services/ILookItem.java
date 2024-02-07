package core.services;

import estorePojo.exceptions.UnknownItemException;

public interface ILookItem {
    public double getPrice( Object item ) throws UnknownItemException;
    public boolean isAvailable( Object item, int qty ) throws UnknownItemException;
}
