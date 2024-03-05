package link.zzone.poplar.actl.subcmd;

import lombok.Data;
import picocli.CommandLine;

/**
 * @author chrischen
 */
@Data
public class ActlBase {

    @CommandLine.Parameters(index = "0")
    private String serviceAlias;
}
