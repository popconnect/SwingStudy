import java.security.PublicKey;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;

public class CustomComboBoxModel2 extends DefaultComboBoxModel<String> {
	
	private ArrayList<String> items;
	
	public CustomComboBoxModel2() {
		// TODO Auto-generated method stub
		// 초기화
		
		items.add("사과");
		items.add("참외");
		items.add("수박");
		items.add("딸기");
		
	}
	@Override
	
	public int getSize() {
		return items.size();
	}
	
	public String getElementAt(int index) {
		return items.get(index);
	}
}
