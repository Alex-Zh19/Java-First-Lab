public class Apple extends Food {
    String size;
    public Apple(String size){
        super("Apple");
        this.size=size;
    }
    public void Consume(){
        System.out.println(this+" "+size+" eaten");
    }

    @Override
    public int CalculateCalories() {
        if(size=="small")
        return 1;
        if(size=="average")
            return 2;
        else return 3;//size==big
    }
}
