#### 채팅방 기능의 요구사항

- 채팅 클라이언트와 채팅 서버가 존재하고 통신 방식을 정해야 함.(프로토콜)
- 채팅 서버는 채팅방 관리 로직을 작성해야 함

![Chat1](../images/Chat1.png)

#### Redis를 이용한 채팅방 구현

- 채팅방 기능을 pub/sub 구조를 이용해 쉽게 구현

![Chat2](../images/Chat2.png)