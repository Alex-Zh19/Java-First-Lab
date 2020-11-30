public class Cheese extends Food {
    public Cheese(){
        super("Cheese");
    }
    public void Consume(){
        System.out.println(this+" eaten");
    }
   @Override
    public int CalculateCalories(){
        return 7;
    }
}
