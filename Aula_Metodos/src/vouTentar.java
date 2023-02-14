
public class vouTentar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[] { 1, 2, 5, 6, 7 };
		int aux = 0;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (a[j] < a[j+1]) {
					aux = a[j];
					a[j] = a[j+1];
					a[j+1] = aux;
				}
			}
		}
		
		for (int i = 0; i < 5; i ++) {
			System.out.println(a[i]);
		}

	}
}
