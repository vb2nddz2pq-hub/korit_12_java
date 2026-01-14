package encapsulation;

public class Customer {
    private String name;
    private double budget;

    public Customer(String name, double budget){
        this.name = name;
        this.budget = budget;

    }
    public double getBudget(){
        return budget;
    }
    public void buyPhone(PhoneStore store){

    }
}
