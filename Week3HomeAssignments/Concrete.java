package Week3HomeAssignments;

public abstract class Concrete implements DatabaseConnection{
	public void connect() {
		System.out.println("connect-Network");
	}
	public void disconnect() {
		System.out.println("disconnect-Wifi");
	}
    public void executeUpdate() {
    	System.out.println("executeUpdate-Password");
    }
    public static void main(String[] args) {
}
}
