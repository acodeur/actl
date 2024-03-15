package link.zzone.poplar.actl;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import link.zzone.poplar.actl.grpc.LeafListRequest;
import link.zzone.poplar.actl.grpc.LeafResponse;
import link.zzone.poplar.actl.grpc.PoplarServiceGrpc;
import link.zzone.poplar.actl.subcmd.*;
import picocli.CommandLine;

import java.util.Objects;
import java.util.concurrent.Callable;

/**
 * @author chrischen
 */
@CommandLine.Command(name = "actl", description = "Actl ConTroL for poplar", subcommands = {
        ActlStartCmd.class, ActlStatusCmd.class, ActlStopCmd.class, ActlRestartCmd.class,
        ActlListCmd.class
})
public class PoplarActlCmd implements Callable<String> {

    @CommandLine.Option(names = {"-h", "--host"}, description = "target host")
    private String host;
    @CommandLine.Option(names = {"-p", "--port"}, description = "target port")
    private Integer port;

    public static void main(String[] args) {
        CommandLine cmd = new CommandLine(new PoplarActlCmd());
        int exitCode = cmd.execute(args);
        System.exit(exitCode);
    }

    @Override
    public String call() throws Exception {
        String msg = "poplar-actl using picocli";
        System.out.println(msg);
        host = Objects.isNull(host) ? "localhost" : host;
        port = Objects.isNull(port) ? 2567 : port;
        ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(host + ":" + port).usePlaintext().build();
        PoplarServiceGrpc.PoplarServiceBlockingStub blockingStub = PoplarServiceGrpc.newBlockingStub(managedChannel);
        LeafResponse leafResponse = blockingStub.listLeaf(LeafListRequest.newBuilder().setRegex("").build());
        System.out.println(leafResponse.getMessage());

        return "poplar-actl using picocli";
    }
}
