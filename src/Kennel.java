import java.util.ArrayList;

public class Kennel {
    private ArrayList<Pet> petList = new ArrayList<Pet>();
    public void allSpeak() {
        for (Pet p : petList) {
            System.out.println(p.getName() + " " + p.speak());
        }
    }

    public void addPetToList(Pet p) { petList.add(p); }
}
