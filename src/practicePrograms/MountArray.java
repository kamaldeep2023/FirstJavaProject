package practicePrograms;

public class MountArray {
	int[] a = { 0, 2, 3, 4, 5, 2, 2, 0 };
	boolean flag = false;
	int climb = 0;

	boolean isArrayMountain() // https://www.enjoyalgorithms.com/blog/valid-mountain-array
	{
		if (a.length < 3) {
			flag = false;
			

		}

		int climb = 0;
		while (climb < a.length - 1 && a[climb] < a[climb + 1]) {
			climb++;
			if (climb == 0 || climb == (a.length - 1)) {
				return flag;
			}

		}

		while (climb < a.length - 1 && a[climb] > a[climb + 1]) {
			climb++;
			if (climb == (a.length - 1)) {
				flag = true;
			} else {
				flag = false;
			}

		}

		return flag;
	}

}
