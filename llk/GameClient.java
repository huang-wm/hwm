package llk;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class GameClient extends JFrame{
	GamePanel panel2 = new GamePanel(10);
	JButton button1 = new JButton("重来一局");
	JButton button2 = new JButton("退出");
	JButton button3 = new JButton("暂停");
	JButton button4 = new JButton("开始");
	static JTextField textField = new JTextField(5);
	static JTextField time = new JTextField(5);
	static JTextField grade = new JTextField(5);
	public GameClient(){
		JLabel label1 = new JLabel("时间：");
		JLabel label2 = new JLabel("得分：");
		JPanel panel = new JPanel(new BorderLayout());
		textField.setEditable(false);
		time.setEditable(false);
		panel2.setLayout(new BorderLayout());
		panel.setLayout(new FlowLayout());
		panel.add(label1);
		panel.add(time);
		panel.add(label2);
		panel.add(textField);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		this.getContentPane().setLayout(new BorderLayout());
		this.getContentPane().add(panel,BorderLayout.SOUTH);
		this.getContentPane().add(panel2,BorderLayout.CENTER);
		this.setSize(800,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("神奇宝贝连连看");
		textField.setText("0");
		button1.setEnabled(true);
		button2.setEnabled(true);
		button3.setEnabled(true);
		button4.setEnabled(true);
		this.setVisible(true);
		
		button1.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				textField.setText("0");
				panel2.startNewGame();
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