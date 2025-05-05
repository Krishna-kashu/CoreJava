package com.lambdaworks.internal;

public class MegaRunner {
    public static void main(String[] args) {
        MegaInterface obj = new MegaImpl();

        obj.load();
        obj.save();
        obj.connect();
        obj.disconnect();
        obj.send();
        obj.receive();
        obj.fetch();
        obj.process();
        obj.validate();
        obj.execute();

        obj.performLogin();
        obj.performLogout();
        obj.performBackup();
        obj.performRestore();
        obj.performExport();
        obj.performImport();
        obj.performCheck();
        obj.performScan();
        obj.performBuild();
        obj.performCleanup();

        MegaInterface.notifyUser();
        MegaInterface.notifyAdmin();
        MegaInterface.notifyError();
        MegaInterface.notifySuccess();
        MegaInterface.notifyTimeout();
        MegaInterface.notifyFailure();
        MegaInterface.notifyStart();
        MegaInterface.notifyStop();
        MegaInterface.notifyChange();
        MegaInterface.notifyComplete();

    }
}
