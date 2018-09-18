package FrameOpen_Practice;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrameRule_1 extends JFrame implements ActionListener{

	JLabel label;
	int n = 0;

	FrameRule_1(String title){

		//ウィンドウのサイズを指定
		setSize(800,640);

		//ウィンドウを中央に配置
		setLocationRelativeTo(null);

		//バツボタンで終了できるようにする
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//パネル設定メソッド呼び出し
		this.JPanel_Confi();
	}

	public void JPanel_Confi () {
		label = new JLabel();
		label.setText(n + "回");

		JPanel p = new JPanel();
		JPanel p2 = new JPanel();

		JButton button1 = new JButton("カウントアップ");
		button1.addActionListener(this);
		button1.setActionCommand("button1");

		JButton button2 = new JButton("リセット");
		button2.addActionListener(this);
		button2.setActionCommand("button2");

		p.add(button1);
		p.add(button2);
		p2.add(label);

		Container contentPane = getContentPane();
		contentPane.add(p, BorderLayout.NORTH);
		contentPane.add(p2, BorderLayout.CENTER);

	}
	public void actionPerformed (ActionEvent e) {
		String cmd = e.getActionCommand();

		if(cmd.equals("button1")){
			n++;
			label.setText(n + "回");

		}else if(cmd.equals("button2")) {
			n = 0;
			label.setText(n + "回");
		}
	}
}