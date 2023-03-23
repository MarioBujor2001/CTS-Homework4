public class Server {
    private int port;
    private String name;

    private static Server instance = null;

    private Server(int port, String name){
        this.port = port;
        this.name = name;
    }

    public static Server getInstance(int port, String name) {
        if(instance == null){
            instance = new Server(port, name);
        }
        return instance;
    }

    public String showStatus(){
        return "Server '"+name+"' running on:"+port+"";
    }

    @Override
    public String toString() {
        return "Server{" +
                "port=" + port +
                ", name='" + name + '\'' +
                '}';
    }
}
