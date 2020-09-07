# BlackJackCard  
Java를 이용해 구현한 블랙잭 카드 게임입니다.  
# Step1. Standard 카드 구현  (구현완료)
실행을 담당하는 Main 클래스, Card를 담당하는 Card 클래스, Deck을 담당하는 Deck클래스를 만듭니다.  
52장의 스탠다드 카드를 만들고 ,카드는 문양과 숫자를 가지며, 카드를 셔플하고, 카드를 뽑는 기능을 가지고 있습니다. (구현완료)  
# step2.  블랙잭 방식으로 카드의 가치환산 (구현완료)
BlackjackCard 클래스를 통해 블랙잭 룰에서 카드의 가치를 환산합니다. 
# step3.  블랙잭 기본 룰 구현 (구현완료)
BlackjackHand 클래스를 통해 기본 룰을 구현합니다.  
구현하고자 하는 룰은 다음과 같습니다.  
1. 딜러와 플레이어가 카드를 두 장씩 받습니다.  
2. 처음 받은 두 장의 합이 21이면 '블랙잭'입니다. 자동으로 승리합니다.  
3. 딜러와 플레이어 중 핸드 가치(카드 가치의 합)가 더 높은 사람이 이깁니다. 하지만 핸드 가치가 21이 넘어가면 패배합니다.  
4. 카드를 더 받을 수 있습니다.  
5. Ace는 일반적으로 11의 가치를 갖지만, 핸드 가치(카드 가치의 합)가 21이 넘어간 경우 1의 가치를 갖습니다.  
# step4. 유연성과 확장성을 위해 Generic 클래스 구현 (구현완료)
유연성과 확장성을 위해 Generic 클래스를 구현합니다.  
Deck class와 BlackjackHand class 에 Generic class형태로 코드를 수정해서 BlackjackHand에서 형변환 없이 getValue()를 쓸수있게 변경했습니다.

# step5. Blackjack game 실행
Main class를 통해 딜러와 플레이어간의 Blackjack game을 구현합니다.  




