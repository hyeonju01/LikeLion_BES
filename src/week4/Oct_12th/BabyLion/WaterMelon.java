package week4.Oct_12th.BabyLion;

public class WaterMelon {
    public String solution(int n){
        String answer = "";
        String str = "수박";
        String endStr = "수";

        if(n%2==0) {
            for(int i = 0; i < (n/2); i++){
                answer = answer + "수박";
            }
        } else if((n % 2) != 0 && (n / 2) == 0){
            answer = answer + '수';

        } else if ((n % 2) != 0 && (n / 2) != 0) {
            for (int i = 0; i < n ; i++){
                answer = str.repeat(n/2);
            }
            answer = answer + endStr;
        }

        return answer;
    }
}
