package enums;

public enum URLs {
    BASE_URL("");

    private final String value;

    URLs(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}

