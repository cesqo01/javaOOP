package hm7.logger;

import java.util.ArrayList;
import java.util.List;

public class CalculatorLogger {
    private List<String> logs;

    public CalculatorLogger() {
        logs = new ArrayList<>();
    }

    public void log(String message) {
        logs.add(message);
    }

    public void printLogs() {
        for (String log : logs) {
            System.out.println(log);
        }
    }
}
