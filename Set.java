import java.util.ArrayList;

public class Set {
    private int points;
    private String name;
    private String specialEffect;
    private ArrayList<Card> cards = new ArrayList<Card>();

    public Set(int p, String n, String s) {
        points = p;
        name = n;
        specialEffect = s;
    }

    public int getPoints() {
        return points;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void addCard(Card c) {
        cards.add(c);
    }

}
