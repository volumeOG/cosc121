import java.util.Arrays;

public class FarmTest {
    public static void main(String[] args){
        Farm myFarm = new Farm();
        for(Animal a: myFarm.getAnimals())//move each animal by random amount
            for(int i=0; i<(int)(Math.random()*1000); i++) a.move();
        System.out.printf("Before feeding: %.2f\n", myFarm.getAvailableFood());
        myFarm.feedAnimals();
        System.out.printf("After feeding: %.2f\n", myFarm.getAvailableFood());
        myFarm.makeNoise();
        myFarm.getAnimals()[0].speak("Hello!!");
        System.out.println(Arrays.toString(myFarm.getAnimals()));
    }
}
