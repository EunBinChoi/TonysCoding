public class ShapeTest {
	public static void main (String arg[]) {
		Shape s;
		Rectangle r = new Rectangle();
		s  = r;
		s.x = 0;
		s.y = 0;
		//s.width = 100; // 컴파일 오류 (why?)
		//s.height = 100; // 컴파일 오류 (why?)
	}
} 