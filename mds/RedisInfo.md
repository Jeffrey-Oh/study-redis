### Redis Study

Redis는 Key-value 데이터 모델이다

Redis는 단기 사용하는 데이터 위주로 저장하는 것이 좋다

활용은 아래와 같은 기능에서 사용하기도 한다.
- Session Store
- Cache
- Limit Rater
- Job Queue

---

#### 특성

- 데이터를 다루는 인터페이스를 제공하므로 DBMS의 성격이 있다
- 기본적으로 영속성을 위한 DB는 아니다
- 영속성을 지원(백업) 한다
- DBMS보다는 빠른 캐시의 성격을 가진다
- 기본적으로 NoSQL DB로 분류되는 key-value store
- 다양한 자료구조를 지원 (String, Hash, Set, List 등)
- External Heap(외부 메모리) 로서 Application이 장애가 나도 Redis의 데이터는 단기 보존되고 여러 머신에서 돌아도 같은 데이터에 접근이 가능하다
- 영속화 수단을 이용해 DBMS처럼 이용할 수 있지만 RDS 와 같은 속도를 내기는 어렵다
- Middleware 로서 볼 때는 자료구조를 활용해 복잡한 로직을 쉽게 구현할 수 있다 (ex. Sorted Set)