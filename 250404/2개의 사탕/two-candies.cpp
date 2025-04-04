#include <iostream>
#include <vector>
#include <queue>
#include <algorithm>
using namespace std;
int n, m;
int visited[11][11][11][11];
int dx[4]={-1,1,0,0}, dy[4]={0,0,-1,1};
vector<vector<char>> v(11);

struct Candy{
    int rx, ry, bx, by, depth;
};

pair<int, int> move(int x, int y, int dir, int& count){
    count = 0;
    while(1){
        int nx=x+dx[dir];
        int ny=y+dy[dir];
        if(nx<0||ny<0||nx>n-1||ny>m-1)break;
        if(v[nx][ny]=='#')break;
        x=nx, y=ny;
        count++;
        if (v[nx][ny] == 'O') break;
    }
    return make_pair(x, y);
}

int main(){
    cin >> n >> m;

    int rx, ry, bx, by, depth;
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            char k;
            cin >> k;
            v[i].push_back(k);
            if(v[i][j]=='R'){
                rx = i;
                ry = j;
                v[i][j]='.';
            } else if(v[i][j]=='B'){
                bx = i;
                by = j;
                v[i][j]='.';
            }
        }
    }

    queue<Candy> q;
    q.push({rx, ry, bx, by, 0});

    int ans = 11;
    while(!q.empty()){
        Candy candy = q.front();
        q.pop();
        rx = candy.rx;
        ry = candy.ry;
        bx = candy.bx;
        by = candy.by;
        depth = candy.depth;

        if(depth>10){
            continue;
        }

        for(int i=0;i<4;i++){
            int redCount=0, blueCount=0;
            pair<int,int> newRedCandy = move(rx, ry, i, redCount);       
            pair<int,int> newBlueCandy = move(bx, by, i, blueCount);       
            int nrx = newRedCandy.first, nry = newRedCandy.second, nbx = newBlueCandy.first, nby = newBlueCandy.second;

           if(nrx==nbx&&nry==nby&&v[nbx][nby]!='O'){
               if(redCount>blueCount){
                    nrx-=dx[i];
                    nry-=dy[i];
                } else{
                    nbx-=dx[i];
                    nby-=dy[i];
                }
           }

           if(v[nbx][nby]=='O'){
                continue;
           }
           if(v[nrx][nry]=='O'){
                ans = min(ans, depth+1);
                continue;
           }

            if(visited[nrx][nry][nbx][nby]==0){
                visited[nrx][nry][nbx][nby]=1;
                q.push({nrx, nry, nbx, nby, depth+1});
            }
        }
    }

    cout << (ans==11?-1:ans) <<endl;

    return 0;
}