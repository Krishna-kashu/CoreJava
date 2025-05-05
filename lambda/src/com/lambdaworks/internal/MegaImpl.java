package com.lambdaworks.internal;

class MegaImpl implements MegaInterface {
    public void load()      { System.out.println("Implemented load"); }
    public void save()      { System.out.println("Implemented save"); }
    public void connect()   { System.out.println("Implemented connect"); }
    public void disconnect(){ System.out.println("Implemented disconnect"); }
    public void send()      { System.out.println("Implemented send"); }
    public void receive()   { System.out.println("Implemented receive"); }
    public void fetch()     { System.out.println("Implemented fetch"); }
    public void process()   { System.out.println("Implemented process"); }
    public void validate()  { System.out.println("Implemented validate"); }
    public void execute()   { System.out.println("Implemented execute"); }

}
