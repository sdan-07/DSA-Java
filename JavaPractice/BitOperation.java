class BitData{
    int n = 5;
    int pos;
    int bm;

    void getBit(int pos){
        this.pos = pos;
        bm = 1 << pos;

        if((bm & n) == 0){
            System.out.println("0");
        }else{
            System.out.println("1");
        }
    }

    void setBit(int pos){
        this.pos =pos;
        bm = 1 << pos;
        System.out.println(bm | n);
    }

    void clearBit(int pos){
        this.pos = pos;
        bm = 1 << pos;
        System.out.println((~bm) & n);
    }
}

public class BitOperation {
    public static void main(String[] args) {
        BitData bit = new BitData();
        bit.clearBit(2);
    }

}
