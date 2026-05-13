package chap02;

// 1,000 이하의 소수를 열거(버전 2)
class PrimeNumber2 {
    public static void main(String[] args) {
        int counter = 0; // 나눗셈의 횟수
        int ptr = 0; // 찾은 소수의 개수
        int[] prime = new int[500];

        prime[ptr++] = 2;	// 2는 소수임. 그래서 소수들만 담을 배열 prime의 첫번째 값은 2

        for (int n = 3; n <= 1000; n += 2) { // 어차피 짝수는 소수가 아니니까 홀수만 취급하겠다.
            int i; // 여기서 i는 prime 배열을 돌려주기 위한 값.
            for (i = 1; i < ptr; i++) {		// 이미 찾은 소수의 개수만큼만 돌아가면 됨. why? 여기서는 i 값을 직접 이용X 배열에 들어있는 값들만 나누기를 진행해주면 됨.
                counter++;
                if (n % prime[i] == 0) // 나누어 떨어지면 소수가 아님
                    break;
            }
            if (ptr == i) // 마지막까지 나누어 떨어지지 않음
                prime[ptr++] = n; // 소수를 배열에 저장
        }

        for (int i = 0; i < ptr; i++)
            System.out.println(prime[i]);

        System.out.println("나눗셈을 수행한 횟수：" + counter);
    }
}
