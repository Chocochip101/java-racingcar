# java-racingcar

자동차 경주 미션 저장소

## 우아한테크코스 코드리뷰

- [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)

## Git commit 메세지

- 접두어로 `docs`, `test`, `feat`, `fix`, `refactor`, `chore` 사용
- example `feat: 사용자 입력 후 도메인 사용`

## 기능 요구사항

### 입출력

- [X] 사용자로부터 자동차 이름을 입력받는다.
    - [X] 자동차 이름은 쉼표로 구분한다.
    - [X] 자동차 이름의 앞뒤 빈칸을 제거한다.
    - [X] 이름 중복은 허용하지 않는다.
    - [X] 빈 입력을 허용하지 않는다.
- [X] 사용자로부터 시도할 횟수를 입력받는다.
    - [X] 시도할 횟수가 자연수인지 검증한다.
- [X] 시도 횟수를 자연수로 변환한다.
- [X] 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException를 발생시키고, "[ERROR]"로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 다시 받는다.
    - [X] Exception이 아닌 IllegalArgumentException, IllegalStateException 등과 같은 명확한 유형을 처리한다.
- [X] 게임 완료 후 가장 많이 전진한 자동차를 최종 우승자로 출력한다.
    - [X] 우승자는 한 명 이상일 수도 있으면, 컴마(',')로 구분하여 모두 출력한다.
- [X] 게임 라운드마다 모든 자동차의 전진 진행 상황을 출력한다.

### 게임 진행

- [X] 랜덤 값이 0과 9 사이로 제한한다.
- [X] 랜덤값이 4 이상일 경우, 전진한다.
- [X] 랜덤값이 3 이하일 경우, 멈춘다.
- [X] 시도 횟수만큼 게임 라운드를 진행한다.
- [X] 구분된 자동차 이름은 5자 이하만 가능하다.
- [X] 최종 우숭자를 반환한다.

## 프로그래밍 진행상황

- UI를 제외한 모든 로직에 단위 테스트를 구현한다.
- 한 메서드에 오직 한 단계의 들여쓰기(indent)만 한다.
- else 예약어를 사용하지 않는다.
- 한 메서드의 길이가 15 라인을 넘어가지 않도록 구현한다.
- 함수가 한 가지의 일을 하도록 구현한다.

## 피드백 수정사항

- [ ] Car 도메인의 View 로직을 분리한다.
- [ ] `vehicles`에 List 자료형을 `unmodifiableList`로 변경한다.
- [ ] 변경이 안될 매개변수에 final 키워드를 붙인다.
- [X] IntStream 내에 불필요 관호 제거한다.
- [ ] Winner 테스트의 불필요 코드 제거한다.
- [ ] `Car`가 `Random`에 직접적으로 의존하지 않도록 수정한다.
- [ ] `getBiggestCars`에 좀 더 적절한 이름으로 수정한다.
- [ ] 도메인 단위 테스트를 추가적으로 진행한다.
