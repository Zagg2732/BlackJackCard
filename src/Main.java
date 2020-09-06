public class Main {
    public static void main(String[] args) {

        //step2 구현 테스트 코드
        BlackjackCard card1 = new BlackjackCard(1, 1);
        BlackjackCard card2 = new BlackjackCard(2, 6);
        BlackjackCard card3 = new BlackjackCard(4, 12);

        System.out.println(card1.getValue());
        System.out.println(card1.isAce());
        System.out.println(card2.getValue());
        System.out.println(card2.isAce());
        System.out.println(card3.getValue());
        System.out.println(card3.isAce());

        /*//52장 스탠다드 카드 덱 생성
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
        System.out.println("남은 카드 개수: " +standardDeck.getDeckSize());*/
    }
}