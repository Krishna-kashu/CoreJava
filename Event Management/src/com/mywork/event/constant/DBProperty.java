package com.mywork.event.constant;

public enum DBProperty {

    URL("jdbc:mysql://localhost:3306/book_worm"),
    USER_NAME("root"),
    SECRET("Krishna@2002"),
    VERSION_8;
    private String prop;

    private  DBProperty(String prop)
    {
        this.prop=prop;
    }
    private DBProperty()
    {

    }

    public String getProp() {
        return prop;
    }
}
