import java.util.ArrayList;

public class Card {
    private int points;
    private String name;
    private String image;
    private String[] setKeys;
    private ArrayList<Set> belongsToSet = new ArrayList<Set>();

    public Card(int a, String b, String c, String[] d) {
        points = a;
        name = b;
        image = c;
        setKeys = d;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public void addSet(Set s) {
        belongsToSet.add(s);
    }

    public ArrayList<Set> getSets() {
        return belongsToSet;
    }

    public void addToSet(ArrayList<Set> setList) {
        for (int i = 0; i < setKeys.length; i++) {
            for (int j = 0; j < setList.size(); j++) {
                if (setList.get(j).getName() == setKeys[i]) {
                    setList.get(j).addCard(this);
                    this.addSet(setList.get(j));
                }
            }
        }
    }
}
