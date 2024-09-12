#include <string>
#include <vector>

using namespace std;

int solution(int n) {
    int answer = 0;
        int start = n % 2 != 0 ? 1 : 2;
        for(int i = start; i <= n; i+=2) {
            if(start == 2) {
                answer += i * i;
            } else {
                answer += i;
            }
        }
        return answer;
}