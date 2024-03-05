package link.zzone.poplar.actl.subcmd;

import picocli.CommandLine;

import java.util.concurrent.Callable;

/**
 * @author chrischen
 */
@CommandLine.Command(name = "status")
public class ActlStatusCmd extends ActlBase implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("ActlStatusCmd" + super.getServiceAlias());
        return null;
    }
}
