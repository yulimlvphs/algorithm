package chap02;

// 1,000 이하의 소수를 열거(버전 1)
class PrimeNumber1 {
    public static void main(String[] args) {
        int counter = 0;			// 나눗셈의 횟수
        for (int n = 2; n<1000; n++) { //1000까지만 구할 것임
            int i;
            for (i = 2; i<n; i++) {//내가 에를들어 101이면 101직전 = 100 까지의 숫자로 계속 나누어 보는 것임. 해당 숫자까지 계속 '나누어볼'숫자를 증가시킴.
                counter++;          // 지금까지 총 몇번의 나누기를 했는지 카운트하는 변수
                if (n % i == 0)		// 나누어떨어지면 소수가 아님
                    break;			// 더 이상의 반복은 불필요
            }
            if (n == i)				// 마지막까지 나누어떨어지지 않음
                System.out.println(n); //그럼 그디어 소수를 만난 것임.
        }
        System.out.println("나눗셈을 수행한 횟수：" + counter);
    }
}