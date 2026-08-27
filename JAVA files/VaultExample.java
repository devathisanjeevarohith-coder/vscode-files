class DataVault<T> {
    private T data;
    public void store(T data) { this.data = data; }
    public T retrieve() { return data; }
    public void displayType() {
        System.out.println("Type: " + data.getClass().getName());
    }
}

public class VaultExample {
    public static void main(String[] args) {
        DataVault<Integer> v1 = new DataVault<>();
        v1.store(500);
        System.out.println("Integer Value: " + v1.retrieve());
        v1.displayType();

        DataVault<String> v2 = new DataVault<>();
        v2.store("Vault Secret");
        System.out.println("\nString Value: " + v2.retrieve());
        v2.displayType();

        DataVault<Double> v3 = new DataVault<>();
        v3.store(88.99);
        System.out.println("\nDouble Value: " + v3.retrieve());
        v3.displayType();
    }
}