package link.zzone.poplar.actl;

import picocli.CommandLine;

import java.util.concurrent.Callable;

/**
 * @author chrischen
 */
@CommandLine.Command(name = "actl", description = "Actl ConTroL for poplar")
public class PoplarActlCmd implements Callable<String> {

    public static void main(String[] args) {
        CommandLine cmd = new CommandLine(new PoplarActlCmd());
        int exitCode = cmd.execute(args);
        System.exit(exitCode);
    }

    public String call() throws Exception {
        String msg = "poplar-actl using picocli";
        System.out.println(msg);
        return "poplar-actl using picocli";
    }
}
