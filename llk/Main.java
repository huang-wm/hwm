package llk;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Main{
	public  Main() {
		JFrame frame = new JFrame("神奇宝贝连连看");
		String picPath = "D:/Game/LinkGame" + File.separator + "Main.png";
		Icon icon = new ImageIcon(picPath);
		JLabel lab = null;
		lab = new JLabel(icon,JLabel.CENTER);
		frame.add(lab);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,2,1));
		JButton button1 = new JButton("开始游戏");
		JButton button2 = new JButton("退出");
		frame.add(button1);
		frame.add(button2);
		frame.setSize(450,350);
		
		button1.setEnabled(true);
		button2.setEnabled(true);
		frame.setVisible(true);
	
	button1.addMouseListener(new MouseAdapter(){
		public void mouseClicked(MouseEvent e){
			new GameClient();
		}
	});
	button2.addMouseListener(new MouseAdapter(){
		public void mouseClicked(MouseEvent e){
			System.exit(0);
		}
	});
	}
	
	public static void main(String[] args) {
		new Main();
		
	}
}
