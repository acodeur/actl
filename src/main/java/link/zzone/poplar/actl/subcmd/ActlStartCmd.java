package link.zzone.poplar.actl.subcmd;

import picocli.CommandLine;

import java.util.concurrent.Callable;

/**
 * @author chrischen
 */
@CommandLine.Command(name = "start")
public class ActlStartCmd implements Callable<String> {
    public String call() throws Exception {
        return null;
    }
}
