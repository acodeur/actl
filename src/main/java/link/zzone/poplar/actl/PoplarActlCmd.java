package link.zzone.poplar.actl;

import link.zzone.poplar.actl.subcmd.ActlRestartCmd;
import link.zzone.poplar.actl.subcmd.ActlStartCmd;
import link.zzone.poplar.actl.subcmd.ActlStatusCmd;
import link.zzone.poplar.actl.subcmd.ActlStopCmd;
import picocli.CommandLine;

import java.util.concurrent.Callable;

/**
 * @author chrischen
 */
@CommandLine.Command(name = "actl", description = "Actl ConTroL for poplar", subcommands = {
        ActlStartCmd.class, ActlStatusCmd.class, ActlStopCmd.class, ActlRestartCmd.class
})
public class PoplarActlCmd implements Callable<String> {

    public static void main(String[] args) {
        CommandLine cmd = new CommandLine(new PoplarActlCmd());
        int exitCode = cmd.execute(args);
        System.exit(exitCode);
    }

    @Override
    public String call() throws Exception {
        String msg = "poplar-actl using picocli";
        System.out.println(msg);
        return "poplar-actl using picocli";
    }
}
