public class Chicken extends Animal{

    @Override
    void sound(){
        System.out.println("Cluck!");
    }

    void swim(){
        System.out.println("The chicken swam across he road!");
    }

    private int chickenNumber = 0;
    Chicken(){
        setMealAmount(5);

        chickenNumber++;
        String nameNumber = Integer.toString(chickenNumber);
        String name = "chicken" + nameNumber;
        setName(name);
    }

}
