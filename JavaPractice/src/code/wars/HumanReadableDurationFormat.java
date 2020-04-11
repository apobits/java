package code.wars;

public class HumanReadableDurationFormat {
    public static void main(String[] args) {
	System.out.println(formatDuration(61));
    }

    public static String formatDuration(int secondsParameter) {
	if (secondsParameter == 0) {
	    return "now";
	}
	int seconds = 0, minutes = 0, hours = 0, days = 0, months = 0, years = 0, counter = 0;

	if (secondsParameter >= 31536000) {
	    years = secondsParameter / 31536000;
	    secondsParameter -= (years * 31536000);
	}
	if (secondsParameter >= 2592000) {
	    months = secondsParameter / 2592000;
	    secondsParameter -= (months * 2592000);
	}
	if (secondsParameter >= 86400) {
	    days = secondsParameter / 86400;
	    secondsParameter -= (days * 86400);
	}
	if (secondsParameter >= 3600) {
	    hours = secondsParameter / 3600;
	    secondsParameter -= (hours * 3600);
	}
	if (secondsParameter >= 60) {
	    minutes = secondsParameter / 60;
	    secondsParameter -= (minutes * 60);
	}
	if (secondsParameter >= 60) {
	    seconds = secondsParameter / 60;
	} else {
	    seconds = secondsParameter;
	}

	StringBuilder sb = new StringBuilder();
	if (years != 0) {
	    counter++;
	    sb.append(years).append(years == 1 ? " year, " : " years, ");
	}
	if (months != 0) {
	    counter++;
	    sb.append(months).append(months == 1 ? " month, " : " months, ");
	}
	if (days != 0) {
	    counter++;
	    sb.append(days).append(days == 1 ? " day, " : " days, ");
	}
	if (hours != 0) {
	    counter++;
	    sb.append(hours).append(hours == 1 ? " hour, " : " hours, ");
	}
	if (minutes != 0) {
	    counter++;
	    sb.append(minutes).append(minutes == 1 ? " minute, " : " minutes, ");
	}
	if (seconds != 0) {
	    counter++;
	    sb.append(seconds).append(seconds == 1 ? " second, " : " seconds, ");
	}
	sb.setLength(sb.length() - 2);

	if (counter > 1) {
	    int lastIndex = sb.lastIndexOf(",");
	    sb.replace(lastIndex, lastIndex + 1, " and");
	}

	return sb.toString();
    }
}
