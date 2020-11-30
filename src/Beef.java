public class Beef extends Food
       {
String preparedness;

public Beef(String preparedness){
super("Beef");
this.preparedness=preparedness;
}

    @Override
    public boolean equals(Object arg0) {
        if (super.equals(arg0)) {
            if (!(arg0.getClass() == getClass())) return false;
            return preparedness.equals(((Beef) arg0).preparedness);
        } else
            return false;

    }
    public String GetPreparedness(){
        return preparedness;
    }

    public void SetPreparedness(String preparedness){
        this.preparedness=preparedness;
    }

    @Override
    public int CalculateCalories() {
        if(preparedness=="blood")
            return 4;
        if(preparedness=="normal")
            return 5;
        else//prepareadness==fried
            return 6;

    }
    public void Consume(){
        System.out.println(this+" "+preparedness+" eaten");
    }
}
