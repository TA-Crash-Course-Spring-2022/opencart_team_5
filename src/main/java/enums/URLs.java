package enums;

public enum URLs {
    BASE_URL("http://localhost/OpenCart/upload/");

    private final String value;

    URLs(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}

