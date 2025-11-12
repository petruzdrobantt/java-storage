package interfaceOne;

public class Store {
    Member[] mem = new Member[100];
    int memCount = 0;

    void register(Member m){
        mem[memCount++] = m;
    }

    void inviteSale(){
        for(int i = 0; i<memCount; i++){
            mem[i].callBack();
        }
    }
}
