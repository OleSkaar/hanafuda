import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cardsInHand = new ArrayList<Card>();
    private ArrayList<Set> partialSets = new ArrayList<Set>();
    private ArrayList<Set> completeSets = new ArrayList<Set>();
    private int points;

    public ArrayList<Card> getCards() {
        return cardsInHand;
    }

    public ArrayList<Set> getPartialSets() {
        return partialSets;
    }

    public ArrayList<Set> getCompleteSets() {
        return completeSets;
    }

    public int getPoints() {
        return points;
    }


    public void addCard(Card card) {
        cardsInHand.add(card);

        for (int i = 0; i < card.getSets().size(); i++) {
            Set currentSet = card.getSets().get(i);
            if (partialSets.contains(currentSet) && !completeSets.contains(currentSet)) {
                if (cardsInHand.containsAll(currentSet.getCards())) {
                    points += currentSet.getPoints();
                    partialSets.remove(currentSet);
                    completeSets.add(currentSet);
                    System.out.println("All cards in set " + currentSet);
                }
            } else {
                partialSets.add(currentSet);
                System.out.println(card + " is not in partial set or complete set.");
                System.out.println("Added " + currentSet + " to partial sets.");
            }


        }
        points += card.getPoints();
    }

    public Hand() {
        points = 0;
    }

}
