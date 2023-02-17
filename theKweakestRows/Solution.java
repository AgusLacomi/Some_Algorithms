package theKweakestRows;

class Solution {

	public static void main(String[] args) {

		Solution first = new Solution();

		int[][] array = { { 1, 0 }, { 0, 0 }, { 1, 0, } };

		first.kWeakestRows(array, 3);

	}

	public int[] kWeakestRows(int[][] mat, int k) {

		int[] soldiers = new int[mat.length];
		int[] order = new int[soldiers.length];

		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat[i].length; j++) {

				if (mat[i][j] == 1) {

					soldiers[i]++;
					
				}
				
				order[i] = i;
				
			}
		}

		insertionSort(soldiers, order);

		return vectorReduce(order, k);
	}

	private int[] vectorReduce(int[] order, int k) {

		int[] reduced = new int[k];

		for (int i = 0; i < reduced.length; i++) {

			reduced[i] = order[i];
		}

		return reduced;

	}

	private void insertionSort(int[] soldiers, int[] order) {

		for (int i = 1; i < soldiers.length; i++) {

			int position = i;
			int valueOfSoldiers = soldiers[i];
			int valueOfOrder = order[position];

			while (position >= 1 && valueOfSoldiers < soldiers[position - 1]) {

				order[position] = order[position - 1];
				soldiers[position] = soldiers[position - 1];
				position--;
			}

			soldiers[position] = valueOfSoldiers;
			order[position] = valueOfOrder;

		}
	}
}