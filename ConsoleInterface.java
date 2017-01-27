/***
 *      _   _        _____  _                          _                   _   _      _               _____      _            _       _
 *     | \ | |      |  __ \(_)                        (_)                 | | | |    (_)             / ____|    | |          | |     | |
 *     |  \| |______| |  | |_ _ __ ___   ___ _ __  ___ _  ___  _ __   __ _| | | |     _ _ __   ___  | |     __ _| | ___ _   _| | __ _| |_ ___  _ __
 *     | . ` |______| |  | | | '_ ` _ \ / _ \ '_ \/ __| |/ _ \| '_ \ / _` | | | |    | | '_ \ / _ \ | |    / _` | |/ __| | | | |/ _` | __/ _ \| '__|
 *     | |\  |      | |__| | | | | | | |  __/ | | \__ \ | (_) | | | | (_| | | | |____| | | | |  __/ | |___| (_| | | (__| |_| | | (_| | || (_) | |
 *     |_| \_|      |_____/|_|_| |_| |_|\___|_| |_|___/_|\___/|_| |_|\__,_|_| |______|_|_| |_|\___|  \_____\__,_|_|\___|\__,_|_|\__,_|\__\___/|_|
*
 * Jason Ivey 1.25.17
 *
 * Lab 1 Beta Build version 1.0.1 not stable
 * Main tester Class
 */

public class ConsoleInterface {

	public static void main(String args[]) {

		System.out.print(banner(1));

		boolean exitRequest = false;

		while (!exitRequest) {
			int dimmensionCount = 1;
			int pointCount = 1;
			while (!proceedRequest) {

				//System.out.println("Enter point #" + pointCount + " dimension # " + dimmensionCount + " or "\Random\" or \"Exit\" or \"Help\" or blank line to proceed:");
				System.out.println("Enter point #" + pointCount + " dimension # " + dimmensionCount + " or "\Random\" or \"Help\" or blank line to exit:");

				++dimmensionCount;
				
			}
			++pointCount;
		}

	}


	public static int parse(String txt) {

		final String KEY_WORD1 = "random";
		final String KEY_WORD2 = "exit";
		final String KEY_WORD3 = "help";
		input.toLowerCase();
		int result = 0;

		if (input.length() != 0 && input.substring( 0 , Math.min(input.length(), KEY_WORD1.length() ) ).equalsIgnoreCase(KEY_WORD1.substring( 0 , Math.min(input.length(), KEY_WORD1.length() ) ) ) ) {
			result = 1;
		}
		if (input.length() != 0 && input.substring( 0 , Math.min(input.length(), KEY_WORD2.length() ) ).equalsIgnoreCase(KEY_WORD2.substring( 0 , Math.min(input.length(), KEY_WORD2.length() ) ) ) ) {
			result = 2;
		}
		if (input.length() != 0 && input.substring( 0 , Math.min(input.length(), KEY_WORD2.length() ) ).equalsIgnoreCase(KEY_WORD2.substring( 0 , Math.min(input.length(), KEY_WORD2.length() ) ) ) ) {
			result = 2;
		}
	}

	public static String banner(int selection) {

		String result = null;

		switch (selection) {
		case 1:  result = "     __            ___  _                               _                       _                        \n" +
			                  "  /\\ \\ \\          /   \\(_) _ __ ___    ___  _ __   ___ (_)  ___   _ __    __ _ | |                       \n" +
			                  " /  \\/ / _____   / /\\ /| || '_ ` _ \\  / _ \\| '_ \\ / __|| | / _ \\ | '_ \\  / _` || |                       \n" +
			                  "/ /\\  / |_____| / /_// | || | | | | ||  __/| | | |\\__ \\| || (_) || | | || (_| || |                       \n" +
			                  "\\_\\ \\/  _      /___,'  |_||_| |_| |_| \\___||_| |_||___/|_| \\___/ |_| |_| \\__,_||_|     _                 \n" +
			                  "  __| |(_) ___ | |_   __ _  _ __    ___   ___    ___   __ _ | |  ___  _   _ | |  __ _ | |_   ___   _ __   \n" +
			                  " / _` || |/ __|| __| / _` || '_ \\  / __| / _ \\  / __| / _` || | / __|| | | || | / _` || __| / _ \\ | '__|  \n" +
			                  "| (_| || |\\__ \\| |_ | (_| || | | || (__ |  __/ | (__ | (_| || || (__ | |_| || || (_| || |_ | (_) || |     \n" +
			                  " \\__,_||_||___/ \\__| \\__,_||_| |_| \\___| \\___|  \\___| \\__,_||_| \\___| \\__,_||_| \\__,_| \\__| \\___/ |_|    \n";
			break;
		case 2:  result = "  _    _   _                        _         ______                              \n" +
			                  " | |  | | | |                      | |       |  ____|                             \n" +
			                  " | |  | | | |__    ______    ___   | |__     | |__     _ __   _ __    ___    _ __ \n" +
			                  " | |  | | | '_ \\  |______|  / _ \\  | '_ \\    |  __|   | '__| | '__|  / _ \\  | '__|\n" +
			                  " | |__| | | | | |          | (_) | | | | |   | |____  | |    | |    | (_) | | |   \n" +
			                  "  \\____/  |_| |_|           \\___/  |_| |_|   |______| |_|    |_|     \\___/  |_|   \n";
			break;

		case 3: result = " _______  _______  _______  _______  ___   _______  _______  ___   _______  _______ \n" +
			                 "|       ||       ||   _   ||       ||   | |       ||       ||   | |       ||       |\n" +
			                 "|  _____||_     _||  |_|  ||_     _||   | |  _____||_     _||   | |       ||  _____|\n" +
			                 "| |_____   |   |  |       |  |   |  |   | | |_____   |   |  |   | |       || |_____ \n" +
			                 "|_____  |  |   |  |       |  |   |  |   | |_____  |  |   |  |   | |      _||_____  |\n" +
			                 " _____| |  |   |  |   _   |  |   |  |   |  _____| |  |   |  |   | |     |_  _____| |\n" +
			                 "|_______|  |___|  |__| |__|  |___|  |___| |_______|  |___|  |___| |_______||_______|\n";
			break;

		case 4: result =   "  ______  _____   _____  ______       ______  __   __ _______ \n" +
			                   " |  ____ |     | |     | |     \\      |_____]   \\_/   |______ \n" +
			                   " |_____| |_____| |_____| |_____/      |_____]    |    |______ \n";
			break;



		}
		return result;

	}
}