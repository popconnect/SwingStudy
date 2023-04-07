import javax.swing.DefaultComboBoxModel;

public class CustomComboBoxModel1 extends DefaultComboBoxModel<String> {
	private String[] items = new String[] {"사과", "참외", "수박", "딸기"};
	
	@Override
	public int getSize() {
		// 데이터의 크기
		// TODO Auto-generated method stub
		System.out.println("GetSize 호출");
		return items.length;
	}
	
	@Override
	public String getElementAt(int index) {
		// 데이터의 내용
		// TODO Auto-generated method stub
		System.out.println("ElementAt 호출");
		return items[index];
	}
}
