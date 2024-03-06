package link.zzone.poplar.actl.subcmd;

import picocli.CommandLine;

import java.util.concurrent.Callable;

/**
 * @author chrischen
 */
@CommandLine.Command(name = "stop")
public class ActlStopCmd extends ActlBase implements Callable<String> {

    @Override
    public String call() throws Exception {
        return null;
    }
}
