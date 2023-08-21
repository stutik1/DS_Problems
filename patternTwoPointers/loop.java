package patternTwoPointers;

public class loop {
    public static void main(String[] args) {
        int num = 5;
        if (num < 5)
            num = num + 10;
        num++;
        System.out.println(num);

        for (int j=0;j<2;j++){
            for (int k=0;k<10;k++){
               System.out.println(j + " " + k);
                if (k==5){
                    break;
                }
            }
        }


        for (int i=0;i<5;i++){
            for (int j=i+1;j<5 ;j++){

                System.out.print(j);
            }
        }
    }
}
