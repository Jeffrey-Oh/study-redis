### 설치하기

Linux 에서 주로 설치하고 많이 사용하지만 Docker 를 이용하여 설치한다.

허브에서 redis 이미지를 받는다.

```
docker pull redis
```

그리고 이미지 실행한다. redis는 기본 포트로 6379를 사용한다

```
docker run --name my-redis -d -p 6379:6379 redis
```

그리고 이미지 컨테이너 안에서 cli를 실행하기 위해 터미널 접속

```
docker exec -it my-redis /bin/sh
```

그리고 다음 명령어를 실행한다

```
redis-cli
```

원래는 호스트 및 포트를 정의해야하지만 연습 환경은 같은 호스트를 사용 중이기 때문에
명시하지 않으면 127.0.0.1:6379 로 기본값을 가진다.

```
redis-cli -h 123.123.123.123 -p 6379
```

---

#### 커맨드

- set {keyName} {value} : keyName 에 value 를 저장
- get {keyName} : 저장한 keyName 의 value 를 조회
- keys {pattern} : pattern (ex. *) 을 지정하여 keyName 을 조회
- dbsize : key의 사이즈
- flushall : 모든 key를 삭제