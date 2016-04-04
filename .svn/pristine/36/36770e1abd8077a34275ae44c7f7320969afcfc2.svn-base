package ua.nure.kolesov.SummaryTask4.web.command;

import java.util.Map;
import java.util.TreeMap;

/**
 * Stores command names and it's implementations.
 * 
 * Returns command by it's name.
 *
 */
public class CommandContainer {
	/**
	 * Map of the command names and it's implementations.
	 */
	private static Map<String, Command> commands = new TreeMap<String, Command>();
	static {
		commands.put("login", new LoginCommand());
		commands.put("logout", new LogoutCommand());

		commands.put("main", new MainCommand());

		commands.put("flights", new FlightsCommand());

		commands.put("crews", new CrewsCommand());

		commands.put("staff", new StaffCommand());

		commands.put("requests", new RequestCommand());

		commands.put("locale", new LocaleCommand());

		commands.put("noCommand", new NoCommand());
	}

	/**
	 * Returns command by it's name.
	 * 
	 * @param commandName
	 *            The name of a command
	 * @return command
	 */
	public static Command get(String commandName) {
		if (commandName == null || !commands.containsKey(commandName)) {
			return commands.get("noCommand");
		}

		return commands.get(commandName);
	}
}
