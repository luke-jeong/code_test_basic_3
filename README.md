# 앞으로는 eclipse가 아닌 vscode를 이용하여 업로드 할 예정.
기본수학1 푸는중.

> 2021.08.02 </br> arr[]와 charAt을 이용한 문자 구분은 여러문제에서 다양하게 쓰임.</br></br>
> 2021.08.04 </br> 처음 입력받을 값의 개수를 정하는건 int로 입력받아 for문을 이용한다는 것을 잊지말자.</br></br>
> 2021.08.05 </br> 2869번의 경우, 출력은 정상적으로 나오지만 알고리즘을 복잡하게 짜는바람에 제한시간내에 출력되지 않았다. 정답만 보고 만들기보단, 완성 추 출력되는 시간도 신경쓰도록 하자. 그러기위해서 BufferedReader를 쓰면 될것이라고 생각했으나, 여전히 시간초과로 정상처리 되지 않았다. 결국 알고리즘 자체를 수정해야했다. </br></br>
> 2021.08.06 </br>
>1. 2839번에서 설탕무게 N이 5로 나누었을때 나머지가 1인 경우를 계산하지 않고 수식을 만들어 에러가 발생했다. 11 kg의 경우 5kg 1개와 3kg 2개로 나뉠 수 있는데 처음 만들었던 수식에선 항상 5로 먼저 나누었기 때문에 정확하게 나눌 수없을때 나오는 결과 값인 -1이 출력되었다.</br></br>
>2. 10757번에서 계산은 간단한 덧셈이지만 long형으로 표현할 수 있는 수는(2^64 -1)이지만 문제에서 입력 값은 10^10000 이므로 long형의 범위를 벗어나기 때문에 java.math에서 제공하는 BigInteger 클래스를 이용해 계산했다. BigInteger를 쓰지 않을땐 String으로 받아서 배열에 저장 한 뒤 각 자리수를 더하는 방법을 사용한다는 블로그 글을 찾았다.</br></br>
>3. 1011번 같은경우, 글보단 표로 만들어서 비교하는것이 더 빠르다. 막히면 표로 간단한 계산을 먼저 나타내서 비교해보자.Math.sqrt는 해당하는 수의 루트값을 만들어주는 메소드이다. double형이 리턴된다.</br></br>