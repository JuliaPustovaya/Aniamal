public class TestClassEquals {
	int a;
	int d;
	String bigA;
	String bigD;

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TestClassEquals that = (TestClassEquals) o;
		if (a != that.a) {
			return false;
		}
		if (d != that.d) {
			return false;
		}
		if (bigA != null ? !bigA.equals(that.bigA) : that.bigA != null) {
			return false;
		}
		return bigD != null ? bigD.equals(that.bigD) : that.bigD == null;
	}

	@Override
	public int hashCode() {
		int result = a;
		result = 31 * result + d;
		result = 31 * result + (bigA != null ? bigA.hashCode() : 0);
		result = 31 * result + (bigD != null ? bigD.hashCode() : 0);
		return result;
	}
}
