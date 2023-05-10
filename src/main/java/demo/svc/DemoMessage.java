package demo.svc;

public class DemoMessage {
    
    private String name;

    public DemoMessage() {}
    
    public DemoMessage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String toString() {
        return 
            "{" + 
                "\"name\":\"" + name + "\"" +
            "}"; 
    } 
    
}
