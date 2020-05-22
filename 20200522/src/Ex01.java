import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex01 extends JFrame{

	private JButton btn1 = new JButton("버튼");
	Ex01(){
		super("제목");
		initcomponent();
	}
	public void initcomponent() {
		this.setLayout(null);
		
		this.setSize(300, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(btn1);
		
//		this.btn1.setLocation(50, 50);
		this.btn1.setBounds(50,50,100,50);
		
		this.btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				btn1.setBounds(100, 100, 100, 50);
			}
		});
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Ex01();
	}

}
