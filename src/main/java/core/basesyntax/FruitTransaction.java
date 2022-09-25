package core.basesyntax;

import java.util.Arrays;

public class FruitTransaction {
    private Operation operation;
    private String fruit;
    private int quantity;

    public Operation getOperation() {
        return operation;
    }

    public String getFruit() {
        return fruit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public FruitTransaction typeOperation(String operation) {
        this.operation = Arrays.stream(Operation.values())
                .filter(o -> o.getOperation().equals(operation))
                .findFirst()
                .get();
        return this;
    }

    public FruitTransaction typeQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public FruitTransaction typeFruit(String fruit) {
        this.fruit = fruit;
        return this;
    }
    /*
   public FruitTransaction typeOperation(Operation operation) {
        this.operation = operation;
        return this;
    }

    public FruitTransaction setOperation(String operation) {
        this.operation = Arrays.stream(Operation.values())
                .filter(o -> o.getOperation().equals(operation))
                .findFirst()
                .get();
        return this;
    }

    public FruitTransaction setFruit(String fruit) {
        this.fruit = fruit;
        return this;
    }

    public FruitTransaction setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }
    */
    @Override
    public String toString() {
        return "FruitTransaction{"
                + "operation=" + operation
                + ", fruit='" + fruit + '\''
                + ", quantity=" + quantity
                + '}';
    }

    public enum Operation {
        BALANCE("b"),
        SUPPLY("s"),
        PURCHASE("p"),
        RETURN("r");

        private String operation;

        Operation(String operation) {
            this.operation = operation;
        }

        public String getOperation() {
            return operation;
        }
    }
}
