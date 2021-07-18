## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```
4. 문자열 덧셈 계산기 기능 정리
- 문자열을 ","로 구분짓는다. 
- 구분지은 값이 숫자인지 확인한다. 
  - 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException을 발생한다. 
- 각 숫자의 합을 구한다. 
- 커스텀 구분자가 있는지 확인한다. 
- 커스텀 문자열이 있을 경우 커스텀 문자열을 구분자로 셋팅한다. 

5. 자동차 경주 게임 구현 기능 정리
- [x] 경주할 자동차의 이름을 선정한다. 
  - [x] 자동차의 이름은 5자를 초과할 수 없다.
- [x] 자동차를 이동할 시도 횟수를 설정한다. 
- [x] 자동차를 움직이게 한다. 
  - [x] 총 설정한 횟수 만큼 움직일수 있는 기회가 있다. 
  - [x] 각각의 자동차는 랜덤으로 움직이게 된다.
  - [x] 움직이는 거리는 표시되어야 한다. 
- [ ] 시도한 횟수가 종료되면 우승한 차를 표시한다. 
