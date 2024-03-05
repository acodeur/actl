package link.zzone.poplar.actl.subcmd;

import picocli.CommandLine;

import java.util.concurrent.Callable;

/**
 * @author chrischen
 */
@CommandLine.Command(name = "stop")
public class ActlStopCmd implements Callable<String> {

    @CommandLine.Parameters(index = "0")
    private String serviceAlias;

    @Override
    public String call() throws Exception {
        return null;
    }
}
