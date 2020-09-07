public class BlackjackCard extends Card { // Card를 상속받아서 사용

    //부모의 생성자 호출
    public BlackjackCard(int suitNumber, int rankNumber) {
        super(suitNumber, rankNumber);
    }

    public int getValue() {
        switch (rankNumber) {
            case 1:
                return 11; // ACE는 11 리턴
            case 11:
            case 12:
            case 13:
                return 10; // 11~13은 10을 리턴
            default:
                return rankNumber;
        }
    }
    //블랙잭에서 ACE는 규칙에따라 가치가 바뀔 수 있으므로 isAce()를 이용하여 구현할 수 있음
    public boolean isAce() {
        return rankNumber == 1;
    }
}
 