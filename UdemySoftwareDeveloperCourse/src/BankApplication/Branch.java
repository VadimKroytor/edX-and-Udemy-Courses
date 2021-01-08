package BankApplication;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String custName, double initTrans) {
        boolean isCustNew = true;
        for (Customer c : customers) {
            if (c.getName() == custName) {
                isCustNew = false;
                break;
            }
        }
        if (isCustNew == true && initTrans > 0) {
            customers.add(new Customer(custName, initTrans));
        }
        return isCustNew;
    }

    public boolean addCustomerTransaction(String custName, double transaction) {
        boolean isTransSuccessful = false;

        if (transaction > 0) {
            for (Customer c : customers) {
                if (c.getName() == custName) {
                    c.getTransactions().add(transaction);
                    isTransSuccessful = true;
                }
            }
        }
        return isTransSuccessful;
    }

    private Customer findCustomer(String custName) {
        Customer customer = null;
        /*
        for (Customer c : customers) {
            if (c.getName() == custName) {
                customer = c;
                break;
            }
        }
        */

        for (int i = 0; i <= customers.size() - 1; i++) {
            if (customers.get(i).getName() == custName) {
                customer = customers.get(i);
                break;
            }
        }
        return customer;
    }


}
