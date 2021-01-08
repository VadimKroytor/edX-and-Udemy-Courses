package ArrayProblems.BankProblem;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<>();
    }

    public boolean addBranch(String name) {
        boolean isBranchNew = true;
        if (findBranch(name) != null) {
            isBranchNew = false;
        } else {
            branches.add(new Branch(name));
        }
        return isBranchNew;
    }

    public boolean addCustomer(String branchName, String custName, double initTrans) {
        boolean isCustAddSuccessful = false;

        Branch b = findBranch(branchName);
        if (b != null) {
            if (b.newCustomer(custName, initTrans) == true) {
                isCustAddSuccessful = true;
            }
        }
        return isCustAddSuccessful;
    }

    public boolean addCustomerTransaction(String branchName, String custName, double transaction) {
        boolean isTransSuccessful = false;

        Branch b = findBranch(branchName);
        if (b != null) {
            if (b.addCustomerTransaction(custName, transaction) == true) {
                isTransSuccessful = true;
            }
        }
        return isTransSuccessful;
    }

    private Branch findBranch(String branchName) {
        Branch retVal = null;
        for (Branch b : branches) {
            if (b.getName() == branchName) {
                retVal = b;
                break;
            }
        }
        return retVal;
    }

    public boolean listCustomers(String branchName, boolean bool) {
        Branch b = findBranch(branchName);
        int customerCounter = 1;
        int transactionCount = 1;
        int f = -1;
        String s = "";
        if (b != null) {

            s += "Customer details for branch " + branchName + "\n";

            for (Customer c : b.getCustomers()) {
                if (bool == true) {
                        s += "Customer: " + c.getName() + "[" + customerCounter + "]\n";
                        s += "Transactions\n";

                    for (double t : c.getTransactions()) {

                        if (b.getCustomers().size() == customerCounter && c.getTransactions().size() == transactionCount) {
                            s += "[" + transactionCount + "] Amount " + t;

                        } else {
                            s += "[" + transactionCount + "] Amount " + t + "\n";
                        }
                        transactionCount++;
                    }
                    customerCounter++;
                    transactionCount = 1;

                }
                else {
                    if (b.getCustomers().size() == customerCounter) {
                        s += "Customer: " + c.getName() + "[" + customerCounter + "]";

                    } else {
                        s += "Customer: " + c.getName() + "[" + customerCounter + "]\n";
                    }
                    customerCounter++;

                }
            }
        }


        System.out.print(s);
        return findBranch(branchName) == null ? false : true;
    }
}
