package com.lambdaworks.internal;
interface MegaInterface {

    void load();
    void save();
    void connect();
    void disconnect();
    void send();
    void receive();
    void fetch();
    void process();
    void validate();
    void execute();


    default void performLogin() { System.out.println("Default: performLogin"); }
    default void performLogout() { System.out.println("Default: performLogout"); }
    default void performBackup() { System.out.println("Default: performBackup"); }
    default void performRestore() { System.out.println("Default: performRestore"); }
    default void performExport() { System.out.println("Default: performExport"); }
    default void performImport() { System.out.println("Default: performImport"); }
    default void performCheck() { System.out.println("Default: performCheck"); }
    default void performScan() { System.out.println("Default: performScan"); }
    default void performBuild() { System.out.println("Default: performBuild"); }
    default void performCleanup() { System.out.println("Default: performCleanup"); }


    static void notifyUser() { System.out.println("Static: notifyUser"); }
    static void notifyAdmin() { System.out.println("Static: notifyAdmin"); }
    static void notifyError() { System.out.println("Static: notifyError"); }
    static void notifySuccess() { System.out.println("Static: notifySuccess"); }
    static void notifyTimeout() { System.out.println("Static: notifyTimeout"); }
    static void notifyFailure() { System.out.println("Static: notifyFailure"); }
    static void notifyStart() { System.out.println("Static: notifyStart"); }
    static void notifyStop() { System.out.println("Static: notifyStop"); }
    static void notifyChange() { System.out.println("Static: notifyChange"); }
    static void notifyComplete() { System.out.println("Static: notifyComplete"); }
}

