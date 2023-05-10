package com.example.diylib.math;
/** 범위에 벗어나도 다시 돌아오는 index cycle 구현
 * 범위가 0일 때 뿐만아니라, 양수일때, 음수일 때도 사용 가능.
 * 벗어난 범위를 기준으로 하는 방법
 * */
public class IndexCycle {

    public int getIndexCycle(int min, int max, int val){
        /** min = 최소 지점, max = 최대 지점 val=이동 후 값 */
        if( val < min ){
            int decease = Math.abs(val - min); // 벗어난 양
            return max - decease + 1;//max도 고려해야하므로 +1
        }
        if( val > max ){
            int decease = Math.abs(val - max); //벗어난 양
            return min + decease -1; //min도 고려해야하므로 -1
        }
        return val; // 범위 내 일 경우 그냥 return
    }


}
