package app.waste_disposal.io;

import app.waste_disposal.contracts.OutputWriter;

public class ConsoleWriter implements OutputWriter {
    @Override
    public void print(String line) {
        System.out.print(line);
    }

    @Override
    public void printLine(String line) {
        System.out.println(line);
    }

    @Override
    public void printf(String format, String... data) {
        System.out.printf(format, data);
    }
}
