
// 
class Database {

    // Single variable
    private static Database databaseInstance;

    private String hostName;

    private int port;

    private Database() {
        hostName = "localhost";
        port = 1433;
    }

    // Singleton
    public static Database getDatabaseInstance() {
        if (databaseInstance == null) {
            databaseInstance = new Database();
        }

        return databaseInstance;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "\nHost name: " + hostName + " | " + "Port: " + port;
    }

}

/**
 * SingleTonPattern
 */
public class SingleTonPattern {

    public static void main(String[] args) {

        Database database = Database.getDatabaseInstance();
        System.out.println(database.toString());
        database.setHostName("Liliana");
        System.out.println(database.toString());

        Database database2 = Database.getDatabaseInstance();
        System.out.println(database2.toString());

    }
}