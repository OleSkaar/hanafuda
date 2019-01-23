import java.util.ArrayList;

public class Hanafuda {

    private boolean on = false;

    public void createSets(ArrayList<Set> s) {
        s.add(new Set(10, "January", "None"));
        s.add(new Set(10, "February", "None"));
        s.add(new Set(10, "March", "None"));
        s.add(new Set(10, "April", "None"));
        s.add(new Set(10, "May", "None"));
        s.add(new Set(10, "June", "None"));
        s.add(new Set(10, "July", "None"));
        s.add(new Set(10, "August", "None"));
        s.add(new Set(10, "September", "None"));
        s.add(new Set(10, "October", "None"));
        s.add(new Set(10, "November", "None"));
        s.add(new Set(10, "December", "None"));
        s.add(new Set(10, "Poetry Ribbons", "None"));
        s.add(new Set(10, "Red Ribbons", "None"));
        s.add(new Set(10, "Purple Ribbons", "None"));
    }


    public static void main(String[] args) {
        Hanafuda hanafuda = new Hanafuda();
        Deck deck = new Deck();
        ArrayList<Set> sets = new ArrayList<Set>();

        // Create sets
        hanafuda.createSets(sets);

        // Add cards to sets
        deck.addCardsToSets(sets);

        // Create hand
        Hand hand = new Hand();

        // Turn on
        /*hanafuda.on = true;

        while (hanafuda.on == true) {

        }
        */
        hand.addCard(deck.getCardsInDeck().get(0));
        hand.addCard(deck.getCardsInDeck().get(1));
        hand.addCard(deck.getCardsInDeck().get(2));
        hand.addCard(deck.getCardsInDeck().get(5));
        hand.addCard(deck.getCardsInDeck().get(6));
        hand.addCard(deck.getCardsInDeck().get(40));
        //hand.addCard(deck.getCardsInDeck().get(47));

        /*
        // Print all cards
        for (int i = 0; i < deck.cards.size(); i++) {
            System.out.println(deck.cards.get(i).name);
        }


        // Print each set and its associated cards
        for (int k = 0; k < sets.size(); k++) {
            System.out.println(sets.get(k).name + ". Cards: ");
            for (int l = 0; l < sets.get(k).cards.size(); l++) {
                System.out.println(sets.get(k).cards.get(l).name);
            }
        }
        */


        // Print cards in hand
        System.out.println("Current points: " + hand.getPoints());
        System.out.println("Hand size = " + hand.getCards().size());
        System.out.println("Partial sets = " + hand.getPartialSets().size());
        System.out.println("Complete sets = " + hand.getCompleteSets().size());
        System.out.println("Partial sets:");
        for (int x = 0; x < hand.getPartialSets().size(); x++) {
            System.out.println(hand.getPartialSets().get(x).getName());
            for (int y = 0; y < hand.getPartialSets().get(x).getCards().size(); y++) {
                Card currentCard = hand.getPartialSets().get(x).getCards().get(y);
                if (hand.getCards().contains(currentCard)) {
                    System.out.println("   " + currentCard.getName());
                }
            }
        }
    }
}
