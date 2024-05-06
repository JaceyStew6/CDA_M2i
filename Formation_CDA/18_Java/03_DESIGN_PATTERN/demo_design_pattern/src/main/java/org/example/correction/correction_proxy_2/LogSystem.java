package org.example.correction.correction_proxy_2;

import java.util.ArrayList;
import java.util.List;

public class LogSystem {

    private static LogSystem instance;
    private List<String> logs;

    private LogSystem() {
        logs = new ArrayList<>();
    }

    public void addLog(String log) {
        logs.add(log);
    }
    public void displayLog() {
        System.out.println(logs);
    }

    public synchronized static LogSystem getInstance() {
        if(instance == null)
            instance = new LogSystem();
        return instance;
    }


}
