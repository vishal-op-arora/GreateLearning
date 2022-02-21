package Week4;

public class FindDigitCount {

    public static void main(String[] args) {
        int totalDigit = 0;

        for(int i=0; i<=9; i++) {
            totalDigit = totalDigit + digitXCount(1, 1000, i);
            System.out.println("Digit Count " + i +" :: " + digitXCount(1, 1000, i));
        }
        System.out.println("Total Digits are :: " + totalDigit);

    }

    static int digitXCount(int startingNum, int endingNum, int digitToFound){
        int result = 0;
        for(int i = startingNum; i <= endingNum; i++){
            int num = i;
            while(num != 0){
                if(num % 10 == digitToFound){
                    result++;
                }
                num = num /10;
            }
        }
        return result;
    }

}
