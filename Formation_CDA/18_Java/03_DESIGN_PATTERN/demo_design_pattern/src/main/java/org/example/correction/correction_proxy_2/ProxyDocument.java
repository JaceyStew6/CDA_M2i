package org.example.correction.correction_proxy_2;

import java.util.ArrayList;
import java.util.List;

public class ProxyDocument implements Document {

    private RealDocument document;

    //private static List<String> logs = new ArrayList<>();

    private void log(String log) {
        LogSystem.getInstance().addLog(log);
    }

    public ProxyDocument(String name) {
        document = new RealDocument(name);
    }
    @Override
    public void read() {
        log("read "+document.getName());
        document.read();
    }

    @Override
    public void edit() {
        log("edit "+document.getName());
        document.edit();
    }


}
