public class iterativeStatements {
    public static void main(String[] args) {
        int fact=1,i=0;
        for(i=5;i>0;i--){ //  counting loop
            fact*=i;
        }
        System.out.println(fact);
        int tot=0,j=0;
        while(j <= 5){ //Entry condition loop
            tot+=j;
            j++;
        }
        System.out.println(tot);
        int tot2=0, k=0;
        do{ // Exit control loop
            tot2+=k;
            k++;
        }while(tot2<=10);
        System.out.println(tot2);
    }
}
