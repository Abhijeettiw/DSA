package HashTable;

public class HashCode {
    private String name;
    public HashCode(String name){
        this.name = name;
    }
    @Override
    public int hashCode() {
        int hash = 0;
        for (int i = 0; i < this.name.length(); i++) {
            hash =+ (int) this.name.charAt(i);
        }
        return hash;
    }
}
