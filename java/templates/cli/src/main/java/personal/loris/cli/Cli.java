package personal.loris.cli;

import personal.loris.cli.template.TemplateCommand;

import picocli.CommandLine;

import static picocli.CommandLine.Command;

@Command(name = "Cli")
public class Cli{

  public static void main(String[] args) {
    System.exit(createAndExecuteCommand(args));
  }

  // Visible for testing
  static int createAndExecuteCommand(String[] args) {
    return new CommandLine(new Cli())
      .addSubcommand("test", new TemplateCommand())
      .setCaseInsensitiveEnumValuesAllowed(true)
      .execute(args);
  }
}

