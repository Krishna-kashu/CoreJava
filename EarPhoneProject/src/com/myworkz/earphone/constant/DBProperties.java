package com.myworkz.earphone.constant;

public enum DBProperties {
    
    URL("jdbc:mysql://localhost:3306/book_worm"),
    USER_NAME("root"),
    SECRET("Krishna@2002"),
    VERSION_8;
    
    private String prop;
    
    private DBProperties(String prop){
        this.prop=prop;
    }
    private DBProperties(){
        
    }
    public  String getProp(){
        return prop;
    }
}
