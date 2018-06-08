class Scrabble {

	private String word;
	
    Scrabble(String word) {
        this.word = word;
    }

    int getScore() {
        int score = 0;
    	for (char letter : word.toCharArray()) {
    		String letterStr = Character.toString(letter).toUpperCase();
    		if (letterStr.matches("[AEIOULNRST]")) {
    			score += 1;
    		} else if (letterStr.matches("[DG]")) {
    			score += 2;
    		} else if (letterStr.matches("[BCMP]")) {
    			score += 3;
    		} else if (letterStr.matches("[FHVWY]")) {
    			score += 4;
    		} else if (letterStr.equals("K")) {
    			score += 5;
    		} else if (letterStr.matches("[JX]")) {
    			score += 8;
    		} else if (letterStr.matches("[QZ]")) {
    			score += 10;
    		}
    	}
    	return score;
    }

}
