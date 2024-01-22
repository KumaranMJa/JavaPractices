public class switchCase {
    public static void main(String[] args) {
        char attendance = 'A';
        switch (attendance){
            case 'O':
            System.out.println("On-Duty");
            break;
            case 'A':
            System.out.println("Absent");
            break;
            case 'P':
            System.out.println("Present");
            break;
            default:
            System.out.println("Invalid Input");
        }
    }
}
