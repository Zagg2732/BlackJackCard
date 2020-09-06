public class Card {

    public final int suitNumber;
    public final int rankNumber;

    public Card(int suitNumber, int rankNumber) {
        if (suitNumber > 4 || suitNumber < 1 || rankNumber < 1 || rankNumber > 13){  // 만약 정상적인 카드 범위를 초과했다면 메세지 출력으로 범위 재조정 요청.
            this.suitNumber = 0;
            System.out.println("문양 숫자범위초과. 1~4 범위에서 입력해주세요");
            this.rankNumber = 0;
            System.out.println("카드 숫자범위초과. 1~13 범위에서 입력해주세요");
        } else {
            this.suitNumber = suitNumber;
            this.rankNumber = rankNumber;
        }
    }
    //클로버, 하트, 다이아몬드, 스페이드로 변환하는 메소드
    public String getSuit() {
        switch (suitNumber) {
            case 1 :
                return "Clubs";
            case 2 :
                return "Hearts";
            case 3 :
                return "Diamonds";
            case 4 :
                return "Spades";
        }
        return null;
    }
    // 에이스, 잭, 퀸, 킹 그외 숫자들을 변환하는 메소드
    public String getRank() {
        switch (rankNumber) {
            case 1 :
                return "Ace";
            case 11 :
                return "Jack";
            case 12 :
                return "Queen";
            case 13 :
                return "King";
            default:
                return String.valueOf(rankNumber); // 나머지 숫자는 그대로 사용
        }
    }
    //toString을 오버라이드하여 카드를 Spades of Ace 와같이 출력하고자 함
    @Override
    public String toString(){
        return getSuit() + " of " + getRank();
    }
}
