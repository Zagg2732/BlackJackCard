import java.util.ArrayList;
import java.util.Collections;

public class Deck<T extends Card> {  //Generic Class 구현. Deck class는 타입변수로 Card의 자식변수만을 받는다.
    //카드를 담는 리스트 만들기
    private ArrayList<T> cards = new ArrayList<T>();

    //getter 메소드
    public ArrayList<T> getCards(){
        return cards;
    }
    //addCard로 Deck cards 에 card 추가
    public void addCard(T card){
        cards.add(card);
    }
    // Deck을 print하는 메소드
    public void print() {
        for (T c : cards) {
            System.out.println(c.toString());
        }
    }
    //카드 셔플
    public void shuffle(){
        Collections.shuffle(cards);
    }

    /* 셔플을 for문과 random을 사용하여 구현하면 다음과 같다
    public void shuffle() {
        Random random = new Random();

        for (int i = 0; i < cards.size(); i++) {
            int randIndex = random.nextInt(cards.size());
            Card temp = cards.get(i);
            cards.set(i, cards.get(randIndex));
            cards.set(randIndex, temp);
        }
    }
    */

    public Deck deal(int count) {
        if (cards.size() < count) {  //덱보다 많은 카드를 받으려고 하면 메세지 출력
            System.out.println("뽑으려는 카드 개수가 남아있는 카드보다 많습니다.");
            return null;
        }
        // 뒤집어진 카드덱에서 카드를 주는 상황을 생각하여 cards 인덱스의 마지막에서부터 count 개수만큼 hand에 카드를 준다.
        int x = cards.size();
        Deck hand = new Deck();
        for (int i = 1; i <= count ;i++){
            hand.addCard(cards.get(x - i));
            cards.remove(x - i);
        }
        return hand;
    }
    //Deck의 카드개수를 리턴하는 함수
    public int getDeckSize(){
        return cards.size();
    }

}
