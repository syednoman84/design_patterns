package pizzaexample;

public class BasePizza implements Pizza{
    @Override
    public String bake() {
        return "Base pizzaexample.Pizza";
    }
}
