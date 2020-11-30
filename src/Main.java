import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String args[]){





       int size=4;
        int calory=0;
        int count=0;
        Scanner in=new Scanner(System.in);
        System.out.println("what type of product do you want");
        String str=in.nextLine();
        String[]parts=str.split(" ");
           Random random=new Random();

       Food wanted;
        if(parts[0].equals("Cheese")||parts[0].equals("cheese")){
             wanted=new Cheese();
        }
        else if(parts[0].equals("Apple")||parts[0].equals("apple")){
            wanted=new Apple(parts[1]);
        }
       else{
           wanted=new Beef(parts[1]);
        }


        Food []breakfast=new Food[size];
        for(int i=0;i<size;i++){
        int mark=random.nextInt(3)+1;

        if(mark==1){
         breakfast[i]=new Cheese();
        }

        if(mark==2){
           int Applesize=random.nextInt(3)+4;
           if(Applesize==4)
              breakfast[i]=new Apple("small");
           if(Applesize==5)
              breakfast[i]=new Apple("average");
           if(Applesize==6)
              breakfast[i]=new Apple("big");
        }

        if(mark==3){
           int prep=random.nextInt(3)+7;
           if(prep==7)
              breakfast[i]=new Beef("blood");
           if(prep==8)
              breakfast[i]=new Beef("normal");
           if(prep==9)
              breakfast[i]=new Beef("fried");
        }

          calory+=breakfast[i].CalculateCalories();
          if(wanted.equals(breakfast[i]))
              count++;
    }

        System.out.println("if you want to know nutrition write -calories ");
        str=in.next();
        if(str.startsWith("-"))
            System.out.println(calory);

        System.out.println("counter of equal products is "+count);
        for(int i=0;i<size;i++){
            breakfast[i].Consume();
        }

  }
}

