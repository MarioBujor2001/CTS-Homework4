public class Datacenter {
    private String serverName;
    private int port;

    private static Datacenter instance;

    private Datacenter(String serverName, int port){
        this.serverName = serverName;
        this.port = port;
    }

    public static Datacenter getInstante(String serverName, int port){
        if(instance == null){
            instance = new Datacenter(serverName, port);
        }
        return instance;
    }
}
