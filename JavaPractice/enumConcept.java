enum Status{
    running, success, pending, failed;
}

enum ServerStatus{
    InternalServer(500), BadGateway(502), NotFound(404), Forbidden(403);
    private int code;

    public int getCode() {
        return code;
    }

    ServerStatus(int code) {
        this.code = code;
    }
}

public class enumConcept {
    public static void main(String[] args) {
        ServerStatus[] ss = ServerStatus.values();
        for(ServerStatus s: ss){
            System.out.println(s + " : " + s.getCode());
        }


//         Status s = Status.success;

//        switch (s){
//            case running -> System.out.println("Working on ");
//            case success -> System.out.println("All done ");
//            case pending -> System.out.println("Still pending ");
//            default -> System.out.println("Try again ");
//        }

//        if(s==Status.success) System.out.println("All Done");
//        else if (s==Status.running) System.out.println("Working on");
//        else if (s==Status.pending) System.out.println("Pending");
//        else System.out.println("Try again");
    }
}
