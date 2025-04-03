#include <iostream>
#include <vector>
using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int>v(n);
    for(int i=0;i<n;i++){
        cin >> v[i];
    }
    int leaderCnt=0, memberCnt=0;
    cin >> leaderCnt >> memberCnt;
    long long cnt = 0;
    for(int i=0;i<n;i++){
        int num = v[i];
        if(num-leaderCnt<0){
            cnt++;
        } else {
            num-=leaderCnt;
            cnt++;
            if(num%memberCnt!=0){
                cnt++;
            }
            cnt+=num/memberCnt;
        }
    }  
    cout << cnt <<endl;
    return 0;
}