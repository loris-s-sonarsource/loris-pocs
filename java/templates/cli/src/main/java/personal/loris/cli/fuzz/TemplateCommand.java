package personal.loris.cli.fuzz;

import java.lang.String;
import java.util.logging.Logger;

import static picocli.CommandLine.Option;

public class FuzzCommand implements Runnable {

  private static final Logger LOG = Logger.getLogger(FuzzCommand.class.getName());

  @Option(names = {"-i", "--input"}, description = "Input data", required = true)
  String input;

  @Override
  public void run() {
    LOG.info(() -> "Currently testing the CLI Template");

    LOG.info("Done.");
  }
}
