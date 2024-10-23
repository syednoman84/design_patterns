package pizzaexample;

/*
    We've all at some point encountered a class with a list of constructors where each addition
    adds a new option parameter:

        Pizza(int size) { ... }
        Pizza(int size, boolean cheese) { ... }
        Pizza(int size, boolean cheese, boolean pepperoni) { ... }
        Pizza(int size, boolean cheese, boolean pepperoni, boolean bacon) { ... }

    This is called the Telescoping Constructor Pattern. The problem with this pattern is that once
    constructors are 4 or 5 parameters long it becomes difficult to remember the required order of
    the parameters as well as what particular constructor you might want in a given situation.

    One alternative you have to the Telescoping Constructor Pattern is the JavaBean Pattern where you
     call a constructor with the mandatory parameters and then call any optional setters after:

        Pizza pizza = new Pizza(12);
        pizza.setCheese(true);
        pizza.setPepperoni(true);
        pizza.setBacon(true);

    The problem here is that because the object is created over several calls it may be in an
    inconsistent state partway through its construction. This also requires a lot of extra effort
    to ensure thread safety.

    The better alternative is to use the Builder Pattern.

    In below implementation of Pizza class:
        1. Note that the instance variables are not initialized via any constructor in the class
        2. We have utilized an inner class which acts as a Builder
        3. It is a builder for the initialization of each of the instance variables of the Pizza class
        4. Builder class has its own methods for each of the instance variables where those instance
           variables are assigned using the input values
        5. Also note that for any required field, the builder class sets them in its own constructor, this
           way any class calling the Builder class must provide those attributes.
        6. However, for the optional fields, they can be set to false.
        7. Inside the inner class you must need a build() method which eventually returns the object of the
           Pizza class after creating it meanting once all the attributes are set with desired values, it returns
           the instantiated object.
        8. So you can say that initialization of the object is the responsibility of Builder inner class
        9. Also note that the final initialization of all instance variables is still done in the parent class constructor
           which only fetches the values from its inner class Builder object
*/

class Pizza {
    private int size;
    private boolean cheese;
    private boolean pepperoni;
    private boolean bacon;

    public static class Builder {
        //required
        private final int size;

        //optional
        private boolean cheese = false;
        private boolean pepperoni = false;
        private boolean bacon = false;

        public Builder(int size) {
            this.size = size;
        }

        public Builder cheese(boolean value) {
            cheese = value;
            return this;
        }

        public Builder pepperoni(boolean value) {
            pepperoni = value;
            return this;
        }

        public Builder bacon(boolean value) {
            bacon = value;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

    private Pizza(Builder builder) {
        size = builder.size;
        cheese = builder.cheese;
        pepperoni = builder.pepperoni;
        bacon = builder.bacon;
    }

    @Override
    public String toString() {
        return "Pizza with " +
                "size = " + size +
                ", cheese = " + cheese +
                ", pepperoni = " + pepperoni +
                ", bacon = " + bacon;
    }

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza.Builder(12)
                .cheese(true)
                .pepperoni(true)
                .bacon(true)
                .build();

        System.out.println("*****First Pizza Details*****");
        System.out.println(pizza1.toString());

        Pizza pizza2 = new Pizza.Builder(12)
                .cheese(true)
                .pepperoni(false)
                .bacon(false)
                .build();

        System.out.println("*****Second Pizza Details*****");
        System.out.println(pizza2.toString());
    }
}