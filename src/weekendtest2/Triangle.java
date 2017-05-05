package weekendtest2;

public class Triangle {
	private int t1;
	private int t2;
	private int t3;

	public Triangle(int a, int b, int c) {
		t1 = a;
		t2 = b;
		t3 = c;

	}

	public boolean isTriangle() {
		return (t1 > 0 && t2 > 0 && t3 > 0 && ((t1 + t2) > t3) && ((t2 + t3) > t1) && ((t1 + t3) > t2));
	}
	public  double getAngle(int edge){
		double angle;
		if (!isTriangle())
		return 0;
		else
		if (edge == t1)
		angle = Math.acos((t2*t2 + t3*t3 - t1*t1)/(2.0 * t2 * t3));
		else if (edge == t2)
		angle = Math.acos((t1*t1 + t3*t3 - t2*t2)/(2.0 * t1 * t3));
		else if (edge == t3)
		angle = Math.acos((t2*t2 + t1*t1 - t3*t3)/(2.0 * t2 * t1));
		else
		angle = 0;
		
		return angle;
		
		
		
	}

}
