class Acronym {

	private String phrase;
	
    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
    	StringBuilder result = new StringBuilder();
        for (String word : phrase.split("[ -]")) {
        	result.append(word.toUpperCase().charAt(0));
        }
        return result.toString();
    }

}
