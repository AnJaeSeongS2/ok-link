# TODOLIST

### 목표

* ok-link 는  200 status 인 page link를 매일 archive로 떠 db에 저장해준다.
* ok-link 의 server는 특정 원본 page link url에 대응되는 archive로 redirect요청을 날려준다.
  * 서버 부하 방지는, 호텔스컴바인의 redirect 기능을 연구할 것. (사용자경험 측면 기능만 존재했고, 부하방지는 없었다.)

| 색인 | 작업                                                         | 상태 | 달성률 | 예상 완료일 | 완료일 | 작업 소요시간 |
| ----|-------------------------------------------------------- | ---- | -----: | ----------: | -----: | ------------- |
| 1|redirect 기능 자체 테스트                                                | DONE | 100% | 04-30 | 04-30 | 30m |
| 2 |호텔스 컴바인의 redirect 요청 연구<br />호텔스 컴바인은 partnership 계약된 업체들을 목록화해 보여준다.<br />호텔스 컴바인은 partnership 계약된 업체들간의 최저가를 잘 보여준다. 클릭시 partnership 계약된 업체의 url로 redirect 시켜준다.<br />partnership url을 진입했을 때 연결해 진입한 결제임을 파악한뒤 그 기반 수수료를 지불받는 방식일 것.<br />이 과정에 client ui 에서 5초의 딜레이를 주게 하는데, 퍼포먼스보다는 사용자 경험용 기능인 것으로 보임. 호텔스 컴바인 서비스에서 제휴사 서비스로 이동하는 것이 자연스러울 수 있게 하는 용도. | DONE | 100% | 04-30 | 04-30 | 30m |
| 3 |서버 부하 방지 기능 추가<br />동일 origin에서 동일 archive 5초이내 요청시, archive redirect fail with 429 (too many request)<br />origin 변조할 경우 어떻게 대응? -> archive 에 대한 절대적 분당 접근가능 제한이 존재하게 한다. 그외에, 429.<br />접근 횟수들은 memory에 들고 있어도 무방할 듯. 서버 자체의 부하용 기능이므로. |  |  |  |  |  |
| 4 |add archive page redirect monitoring |  |  |  |  |  |
| 5 |rest api doc 사용법 숙지 (ref: https://woowabros.github.io/experience/2018/12/28/spring-rest-docs.html , ref2: https://jojoldu.tistory.com/294, ref3: https://jaehun2841.github.io/2019/08/04/2019-08-04-spring-rest-docs/#%EA%B2%B0%EA%B3%BC)<br />배포된 jar에서도 /docs/index.html로 restdocs 열람 정상 확인. | DONE | 100% | 05-01 | 05-01 | 3h |
| 6 |asciidoc (adoc) file intellij 에서 보기 추가. | DONE | 100% | 05-01 | 05-01 | 10m |