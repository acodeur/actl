package link.zzone.poplar.actl.subcmd;

import picocli.CommandLine;

import java.util.concurrent.Callable;

/**
 * @author chrischen
 */
@CommandLine.Command(name = "list")
public class ActlListCmd implements Callable<String> {

    @Override
    public String call() throws Exception {
        return null;
    }
}
