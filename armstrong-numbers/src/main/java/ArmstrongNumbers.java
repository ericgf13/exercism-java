class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
		String numStr = String.valueOf(numberToCheck);
		int numSize = numStr.length();
		int result = 0;
		for (char numChar : numStr.toCharArray()) {
			result += Math.pow(Character.getNumericValue(numChar), numSize);
		}
		return numberToCheck == result;
	}

}
