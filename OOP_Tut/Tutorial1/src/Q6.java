import java.util.ArrayList;
import java.util.Collections;

public class Q6 {
        public static void main(String[] args) {
            ArrayList<Integer> lotteryNumList = new ArrayList<>();

            for (int i=1;i<49;i++){
                lotteryNumList.add(i+1);
            }

            Collections.shuffle(lotteryNumList);
            System.out.println("The lottery numbers are: ");

            // printing the first 6 numbers
            for(int j=0;j<6;j++){
                System.out.println(lotteryNumList.get(j));
            }
        }
}
