public class Llama extends Animal{


    @Override
    void sound(){
        System.out.println("Hmmm!");
    }

    void jump(){
        System.out.println("The llama jumped!");
    }


    private static int llamaNumber = 0;
    Llama(){
        setMealAmount(9);

        llamaNumber++;
        String nameNumber = Integer.toString(llamaNumber);
        String name = "llama" + nameNumber;
        setName(name);
    }
}
