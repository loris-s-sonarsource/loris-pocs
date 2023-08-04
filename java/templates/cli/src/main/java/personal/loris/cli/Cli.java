package personal.loris.cli;

import personal.loris.cli.template.TemplateCommand;

import picocli.CommandLine;

import static picocli.CommandLine.Command;

/**
 * This class is the main entry point for the library information extractor.
 */
@Command(name = "Cli")
public class Cli{

  public static void main(String[] args) {
    System.exit(createAndExecuteCommand(args));
  }

  // Visible for testing
  static int createAndExecuteCommand(String[] args) {
    return new CommandLine(new Crawler())
      .addSubcommand("test", new TemplateCommand())
      .setCaseInsensitiveEnumValuesAllowed(true)
      .execute(args);
  }
}

