package polymorphismAssignments;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("23 inches");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop obj = new Desktop();
		obj.computerModel();
		obj.desktopSize();

	}

}
