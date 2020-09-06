public class Main {
    public static void main(String[] args) {

        //52장 스탠다드 카드 덱 생성
        Deck standardDeck = new Deck();

        for (int suit = 1; suit <= 4; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                Card newCard = new Card(suit, rank);

                standardDeck.addCard(newCard);
            }
        }

        // 카드 셔플
        standardDeck.shuffle();

        // 딜링
        Deck hand1 = standardDeck.deal(5);
        Deck hand2 = standardDeck.deal(5);
        Deck hand3 = standardDeck.deal(5);

        // 각 핸드 출력
        System.out.println("hand1 보유 카드 개수: " + hand1.getDeckSize() + "\n<보유 카드 목록>");
        hand1.print();
        System.out.println("----------");

        System.out.println("hand2 보유 카드 개수: " +hand2.getDeckSize()  + "\n<보유 카드 목록>");
        hand2.print();
        System.out.println("----------");

        System.out.println("hand3 보유 카드 개수: " + hand3.getDeckSize() + "\n<보유 카드 목록>");
        hand3.print();
        System.out.println("----------");

        //남은 카드 개수
        System.out.println("남은 카드 개수: " +standardDeck.getDeckSize());
    }
}