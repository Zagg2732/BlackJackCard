public class BlackjackHand extends Deck{

    public int getValue() {
        int value = 0;
        int aceCount = 0;

        for (Card card : getCards()) { //for-each 문으로 핸드에 있는 카드목록 순회
            BlackjackCard bjCard = (BlackjackCard) card; //BlackjackCard로 캐스팅
            value += bjCard.getValue();
            if (bjCard.isAce()) {  // Ace면 aceCount를 1증가
                aceCount++;
            }
        }
        while (aceCount > 0 && value > 21) {  // value가 21이상인데 ace가 있으면 규칙에따라 ace는 11점에서 1점이됨 (-10점)
            value -= 10;
            aceCount--;
        }
        return value;
    }

    public boolean isBusted() {  // value가 21보다 클경우 파산
        return getValue() > 21;
    }

    public boolean isBlackjack() { // value가 두장으로 21이면 블랙잭
        return getValue() == 21 && getCards().size() == 2;
    }
}