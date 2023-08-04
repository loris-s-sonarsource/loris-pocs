package personal.loris.cli.template;

import java.util.String;

import static picocli.CommandLine.Option;

public class TemplateCommand implements Runnable {

  private static final Logger LOG = Logger.getLogger(TemplateCommand.class.getName());

  // Visible for testing
  @Option(names = {"-i", "--input"}, description = "Input data", required = true)
  String input;

  @Override
  public void run() {
    LOG.info(() -> "Currently testing the CLI Template");

    LOG.info("Done.");
  }
}
