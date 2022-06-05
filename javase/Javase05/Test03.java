public class Test03{
    public static void main(String[] args) {
        int[] scores = {5,4,6,8,9,0,1,2,7,3};
        int max = scores[0];
        int min = scores[0];
        double sum = 0;

        for(int i = 0; i < scores.length; i++){
            if(scores[i] > max){
                max = scores[i];
            }
            if(scores[i] < min){
                min = scores[i];
            }

            sum += scores[i];
        }

        double score = (sum - max - min) / (scores.length - 2);
        System.out.println("评委得分:" + score);
    }
}