package service.simpleservice;

public class SubEntity {
    private final String command;
    private final String a;
    private final String b;
    private final int result;

    public SubEntity(String command, String a, String b, int result){
        this.command = command;
        this.a = a;
        this.b = b;
        this.result = result;
    }


    public String getValue() {
        return command;
    }


    public String getCmd() {
        return a;
    }

    public String getCmd1() {
        return b;
    }

    public int getResult() {
        return result;
    }
}
