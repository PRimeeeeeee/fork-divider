public class dividerCal {
    private String ans = "";
    private int divider;
    private int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};

    public dividerCal(int divider){
        this.divider = divider;
    }

    public void cal(int[] array, int divider){
        for (int i = 0; i < array.length; i++) {
            if(array[i] % divider == 0){
                ans = ans + array[i] + " ";
            }
        }
    }

    public void display(){
        cal(array, divider);
        System.out.println("Answer : "+ans);
    }
}
