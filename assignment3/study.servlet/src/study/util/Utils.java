package study.util;

import java.io.File;

public class Utils {
	public static String getFileExt(File file) {
		String fileName = file.getName();
		int lastPeriodIndex = fileName.lastIndexOf('.');
		if (lastPeriodIndex == -1)
			return "";

		return fileName.substring(lastPeriodIndex + 1);
	}

	public static String getFileNameWithoutExt(File file) {
		String fileName = file.getName();
		int lastPeriodIndex = fileName.lastIndexOf('.');
		if (lastPeriodIndex == -1)
			return fileName;

		return fileName.substring(0, lastPeriodIndex);
	}
}
