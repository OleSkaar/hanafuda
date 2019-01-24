import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> cards = new ArrayList<Card>();

    public void addNewCard(Card newCard) {
        cards.add(newCard);
    }

    public ArrayList<Card> getCardsInDeck() {
        return cards;
    }

    public void removeCardFromDeck(Card c) {
        cards.remove(c);
    }

    public void addCardsToSets(ArrayList<Set> s) {
        for (int i = 0; i < cards.size(); i++) {
            cards.get(i).addToSet(s);
        }
    }

    public Deck() {
        cards.add(new Card(1, "january1", "/images/january1.jpg", new String[]{"January"}));
        cards.add(new Card(1, "january2", "/images/january2.jpg", new String[]{"January"}));
        cards.add(new Card(5, "january3", "/images/january3.jpg", new String[]{"January", "Poetry Ribbons"}));
        cards.add(new Card(20, "january4", "/images/january4.jpg", new String[]{"January"}));

        cards.add(new Card(1, "february1", "/images/february1.jpg", new String[]{"February"}));
        cards.add(new Card(1, "february2", "/images/february2.jpg", new String[]{"February"}));
        cards.add(new Card(5, "february3", "/images/february3.jpg", new String[]{"February", "Poetry Ribbons"}));
        cards.add(new Card(10, "february4", "/images/february4.jpg", new String[]{"February"}));

        cards.add(new Card(1, "march1", "/images/march1.jpg", new String[]{"March"}));
        cards.add(new Card(1, "march2", "/images/march2.jpg", new String[]{"March"}));
        cards.add(new Card(5, "march3", "/images/march3.jpg", new String[]{"March", "Poetry Ribbons"}));
        cards.add(new Card(20, "march4", "/images/march4.jpg", new String[]{"March"}));

        cards.add(new Card(1, "april1", "/images/april1.jpg", new String[]{"April"}));
        cards.add(new Card(1, "april2", "/images/april2.jpg", new String[]{"April"}));
        cards.add(new Card(5, "april3", "/images/april3.jpg", new String[]{"April", "Red Ribbons"}));
        cards.add(new Card(10, "april4", "/images/april4.jpg", new String[]{"April"}));

        cards.add(new Card(1, "may1", "/images/may1.jpg", new String[]{"May"}));
        cards.add(new Card(1, "may2", "/images/may2.jpg", new String[]{"May"}));
        cards.add(new Card(5, "may3", "/images/may3.jpg", new String[]{"May", "Red Ribbons"}));
        cards.add(new Card(10, "may4", "/images/may4.jpg", new String[]{"May"}));

        cards.add(new Card(1, "june1", "/images/june1.jpg", new String[]{"June"}));
        cards.add(new Card(1, "june2", "/images/june2.jpg", new String[]{"June"}));
        cards.add(new Card(5, "june3", "/images/june3.jpg", new String[]{"June", "Purple Ribbons"}));
        cards.add(new Card(10, "june4", "/images/june4.jpg", new String[]{"June"}));

        cards.add(new Card(1, "july1", "/images/july1.jpg", new String[]{"July"}));
        cards.add(new Card(1, "july2", "/images/july2.jpg", new String[]{"July"}));
        cards.add(new Card(5, "july3", "/images/july3.jpg", new String[]{"July", "Red Ribbons"}));
        cards.add(new Card(10, "july4", "/images/july4.jpg", new String[]{"July"}));

        cards.add(new Card(1, "august1", "/images/august1.jpg", new String[]{"August"}));
        cards.add(new Card(1, "august2", "/images/august2.jpg", new String[]{"August"}));
        cards.add(new Card(10, "august3", "/images/august3.jpg", new String[]{"August"}));
        cards.add(new Card(20, "august4", "/images/august4.jpg", new String[]{"August"}));

        cards.add(new Card(1, "september1", "/images/september1.jpg", new String[]{"September"}));
        cards.add(new Card(1, "september2", "/images/september2.jpg", new String[]{"September"}));
        cards.add(new Card(5, "september3", "/images/september3.jpg", new String[]{"September", "Purple Ribbons"}));
        cards.add(new Card(10, "september4", "/images/september4.jpg", new String[]{"September"}));

        cards.add(new Card(1, "october1", "/images/october1.jpg", new String[]{"October"}));
        cards.add(new Card(1, "october2", "/images/october2.jpg", new String[]{"October"}));
        cards.add(new Card(5, "october3", "/images/october3.jpg", new String[]{"October", "Purple Ribbons"}));
        cards.add(new Card(10, "october4", "/images/october4.jpg", new String[]{"October"}));

        cards.add(new Card(5, "november1", "/images/november1.jpg", new String[]{"November"}));
        cards.add(new Card(1, "november2", "/images/november2.jpg", new String[]{"November"}));
        cards.add(new Card(10, "november3", "/images/november3.jpg", new String[]{"November"}));
        cards.add(new Card(20, "november4", "/images/november4.jpg", new String[]{"November"}));

        cards.add(new Card(1, "december1", "/images/december1.jpg", new String[]{"December"}));
        cards.add(new Card(1, "december2", "/images/december2.jpg", new String[]{"December"}));
        cards.add(new Card(1, "december3", "/images/december3.jpg", new String[]{"December"}));
        cards.add(new Card(10, "december4", "/images/december4.jpg", new String[]{"December"}));

    }

}
