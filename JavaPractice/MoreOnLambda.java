@FunctionalInterface
interface newDev{
    boolean isHavingLaptop(int workingStatus);
}

public class MoreOnLambda {
    public static void main(String[] args) {
        newDev John = workingStatus -> {
            if(workingStatus == 1) return true;
            else return false;
        };
        System.out.println(John.isHavingLaptop(1));
    }
}
