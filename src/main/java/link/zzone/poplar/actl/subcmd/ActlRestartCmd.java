package link.zzone.poplar.actl.subcmd;

import picocli.CommandLine;

import java.util.concurrent.Callable;

/**
 * @author chrischen
 */
@CommandLine.Command(name = "restart")
public class ActlRestartCmd implements Callable<String> {


    public String call() throws Exception {
        return null;
    }
}
