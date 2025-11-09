enum StudentNames{
    Akash("P"), Dinesh("F"), Albert("F");

    private String result;
    StudentNames(String res){this.result=res;}

    public String getResult() {
        return result;
    }
}

public class enumImplm {
    public static void main(String[] args) {
        StudentNames[] studInfo = StudentNames.values();
        for (StudentNames i: studInfo) System.out.println(i+": "+i.getResult());
    }
}
