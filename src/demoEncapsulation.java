public class demoEncapsulation {
    public static void main(String[] args) {
        newClassEncapsulation obj = new newClassEncapsulation();
        System.out.println();
        obj.setId(10);
        obj.setName("Sudipta");
        System.out.println(obj.getId());
        System.out.println(obj.getName());
    }
}

class newClassEncapsulation {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int newID) {
        id = newID;
    }

    public void setName(String newName) {
        name = newName;
    }
}
