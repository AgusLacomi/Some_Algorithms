package ransomNote;

class Solution {
	public boolean canConstruct(String ransomNote, String magazine) {

		if (ransomNote.length() < 1 || ransomNote.length() > Math.pow(10, 5)) {
			throw new Error("The length of the ransomNote is out of order");
		} else if (magazine.length() < 1 || magazine.length() > Math.pow(10, 5)) {
			throw new Error("The length of the magazine is out of order");
		}

		char[] arrayRansomNote = ransomNote.toCharArray();
		char[] arrayMagazine = magazine.toCharArray();

		return getRansomNote(arrayRansomNote, arrayMagazine);
	}

	/* Simple sequential search */
	private boolean getRansomNote(char[] ransomNote, char[] magazine) {

		boolean possible = false;
		int countAux = 0;

		boolean[] filledMagazine = new boolean[magazine.length];

		for (int i = 0; i < ransomNote.length; i++) {

			for (int j = 0; j < magazine.length; j++) {

				if (ransomNote[i] == magazine[j]) {
					
					if (filledMagazine[j] == false) {
						
						filledMagazine[j] = true;
						countAux ++;
						j = magazine.length;
					}
				}
			}
		}
		
		if (countAux == ransomNote.length) {
			possible = true;
		}

		return possible;
	}
}