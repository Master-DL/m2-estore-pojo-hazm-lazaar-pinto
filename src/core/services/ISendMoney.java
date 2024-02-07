package core.services;

import estorePojo.exceptions.InsufficientBalanceException;
import estorePojo.exceptions.UnknownAccountException;

public interface ISendMoney {
    public void transfert(String from, String to, double amount)
            throws InsufficientBalanceException, UnknownAccountException;

}
