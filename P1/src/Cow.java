public class Cow extends Animal{

    @Override
    void sound(){
        System.out.println("Moo!");
    }

    void milk(){
        System.out.println("The cow was milked!");
    }

    private int cowNumber = 0;
    Cow(){
        setMealAmount(20);

        cowNumber++;
        String nameNumber = Integer.toString(cowNumber);
        String name = "cow" + nameNumber;
        setName(name);
    }


}
