import javax.swing.AbstractListModel;

public class CustomListModel extends AbstractListModel<String> {

	private String[] items = new String[] {"사과", "참외", "수박", "딸기"};
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return items.length;
	}

	@Override
	public String getElementAt(int index) {
		// TODO Auto-generated method stub
		return items[index];
	}
	
}
