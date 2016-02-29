package utils;

public class Tools {

	public static boolean isBetween(float val, float valmin, float valMax){
		if (val >= valmin && val <= valMax) {
			return true;
		} else {
			return false;
		}
	}
}
