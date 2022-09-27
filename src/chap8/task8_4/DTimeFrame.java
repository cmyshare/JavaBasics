package chap8.task8_4;

import java.awt.Color;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * This class is a simple JFrame implementation to explain how to display time
 * dynamically on the JSwing-based interface.
 * @author Edison
 */

/**
 * 任务8_4时钟显示器设计
 * 时钟显示器是在主界面状态栏上动态显示日历与时间
 * 设计步骤：
 * 1、设计时钟显示器界面
 * 2、实现Runnable接口，在run()方法中增加获取当前时间
 * 3、最后将获取到的时间设置到界面上
 */

public class DTimeFrame extends JFrame implements Runnable {
	private JFrame frame;
	private JPanel timePanel;
	private JLabel timeLabel;
	private JLabel displayArea;
	private String DEFAULT_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
	private int ONE_SECOND = 1000;

	public DTimeFrame() {
		timePanel = new JPanel();
		timeLabel = new JLabel("当前时间是: ");
		timeLabel.setForeground(Color.red);

		displayArea = new JLabel();

		timePanel.add(timeLabel);
		timePanel.add(displayArea);
		this.add(timePanel);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(new Dimension(250, 80));
		this.setLocationRelativeTo(null);
		this.setTitle("时钟显示器");
	}

	public void run() {
		while (true) {
			SimpleDateFormat dateFormatter = new SimpleDateFormat(
					DEFAULT_TIME_FORMAT);
			displayArea.setText(dateFormatter.format(Calendar.getInstance()
					.getTime()));
			try {
				Thread.sleep(ONE_SECOND);
			} catch (Exception e) {
				displayArea.setText("Error!!!");
			}
		}
	}

	public JPanel getTimePanel() {
		return timePanel;
	}

	public void setTimePanel(JPanel timePanel) {
		this.timePanel = timePanel;
	}

	public static void main(String arg[]) {
		DTimeFrame df2 = new DTimeFrame();
		df2.setVisible(true);

		Thread thread1 = new Thread(df2);
		thread1.start();
	}

}