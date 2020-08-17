# BFS DFS

### BFS, DFS를 제대로 이해하기 위해 알아야할 자료구조

* 스택
* 큐
* 재귀

------



## 스택

> 상자쌓기
>
> 상자를 쌓을때 아래서 부터 차곡차곡 쌓아야하지만 상자를 뺄땐 통상적으로 위에서 부터 뺀다. 



#### 자바에서의 문법

~~~java
public Element push(Element item); // 데이터 추가
public Element pop(); // 최근에 추가된(Top) 데이터 삭제
public Element peek(); // 최근에 추가된(Top) 데이터 조회
public boolean empty(); // stack의 값이 비었는지 확인, 비었으면 true, 아니면 false
public int seach(Object o); // 인자값으로 받은 데이터의 위치 반환, 그림으로 설명하겠음
~~~



------



## 큐

> 아래가 뚫려있는 양동이에 물 붓는 것이라 생각하자
>
> 제일 처음 들어온 물이 첫 빠따로 나간다.



| boolean add(E e)   | 해당 큐의 맨 뒤에 전달된 요소를 삽입함.만약 삽입에 성공하면 true를 반환하고, 큐에 여유 공간이 없어 삽입에 실패하면 IllegalStateException을 발생시킴. |
| ------------------ | ------------------------------------------------------------ |
| E element()        | 해당 큐의 맨 앞에 있는(제일 먼저 저장된) 요소를 반환함.      |
| boolean offer(E e) | 해당 큐의 맨 뒤에 전달된 요소를 삽입함.                      |
| E peek()           | 해당 큐의 맨 앞에 있는(제일 먼저 저장된) 요소를 반환함.만약 큐가 비어있으면 null을 반환함. |
| E poll()           | 해당 큐의 맨 앞에 있는(제일 먼저 저장된) 요소를 반환하고, 해당 요소를 큐에서 제거함.만약 큐가 비어있으면 null을 반환함. |
| E remove()         | 해당 큐의 맨 앞에 있는(제일 먼저 저장된) 요소를 제거함.      |



## 재귀

재귀함수가 언제 끝날지 **종료 조건**을 꼭 명시해야한다.

컴퓨터 내부의 재귀함수 실행은 스택의 구현과 같다.

~~~java
public class FactorialEx {
    public static void main(String[] args) {
        int result = factorialRecursive(5);
        System.out.println(result);
    }

    private static int factorialRecursive(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * factorialRecursive(n - 1);
    }

}
~~~

비재귀로 루프를 돌리는 것보다 코드가 훨씬 간결해진다.

------

