package chap8.task8_1;

import java.awt.CheckboxMenuItem;
import java.awt.Color;
import java.awt.Container;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.MenuShortcut;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.undo.UndoManager;

/**
 * 任务8_1使用字节流设计记事本
 * 使用文件字节输入流与输出流设计，记事本新建、文件保存、文件打开
 * 在读写文件方式上，使用FileInputStream、FileOutputStream读写文件
 */

import java.awt.CheckboxMenuItem;
import java.awt.Color;
import java.awt.Container;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.MenuShortcut;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.undo.UndoManager;

public class Notebook {
	// 记事本的具体实现类
	private static final long serialVersionUID = 1L;
	private  TextArea content;


	private  String filePath = "";//路径为空
	Color color=Color.red;
	Toolkit toolKit = Toolkit.getDefaultToolkit();
	Clipboard clipboard = toolKit.getSystemClipboard();
	public Notebook(){
		//创建一个JFrame对象；并设置相关属性
		final JFrame jf = new JFrame("我的记事本");
		jf.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		jf.setBounds(100,100,500,500);
		jf.setResizable(true);
		jf.setVisible(true);
		//创建菜单栏
		MenuBar menu = new MenuBar();
		jf.setMenuBar(menu);
		//创建并添加文本框
		content = new TextArea("",50,50,TextArea.SCROLLBARS_VERTICAL_ONLY);
		jf.add(content);
		content.setVisible(true);
		content.requestFocusInWindow();
		//菜单栏添加内容
		Menu filemenu = new Menu("文件（F）");
		Menu editmenu = new Menu("编辑（E）");
		Menu formatmenu = new Menu("格式（O）");
		Menu viewmenu = new Menu("查看（V）");
		Menu helpmenu = new Menu("帮助（H）");
		menu.add(filemenu);
		menu.add(editmenu);
		menu.add(formatmenu);
		menu.add(viewmenu);
		//   menu.add(helpmenu);
		//创建文件菜单上的各个菜单项并添加到菜单上
		MenuItem newitem = new MenuItem("新建（N）");
		newitem.setShortcut(new MenuShortcut(KeyEvent.VK_N,false));
		filemenu.add(newitem);
		MenuItem openitem = new MenuItem("打开（O）");
		openitem.setShortcut(new MenuShortcut(KeyEvent.VK_O,false));
		filemenu.add(openitem);
		MenuItem saveitem = new MenuItem("保存（S）");
		saveitem.setShortcut(new MenuShortcut(KeyEvent.VK_S,false));
		filemenu.add(saveitem);
		MenuItem saveasitem = new MenuItem("另存为（A）");
		saveasitem.setShortcut(new MenuShortcut(KeyEvent.VK_A,false));
		filemenu.add(saveasitem);
		MenuItem setitem = new MenuItem("页面设置（U）");
		setitem.setShortcut(new MenuShortcut(KeyEvent.VK_U,false));
		filemenu.add(setitem);
		setitem.setEnabled(false);
		MenuItem printitem = new MenuItem("打印（P）");
		printitem.setShortcut(new MenuShortcut(KeyEvent.VK_P,false));
		filemenu.add(printitem);
		printitem.setEnabled(false);
		filemenu.addSeparator();
		MenuItem exititem = new MenuItem("退出（X）");
		exititem.setShortcut(new MenuShortcut(KeyEvent.VK_X,false));
		filemenu.add(exititem);
		//添加监听器来实现文件菜单上的各个菜单项的功能

		//1.新建菜单项的功能实现
		newitem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String con = content.getText();
				if(!con.equals("")){//文本域里文本不为空
					int result = JOptionPane.showConfirmDialog(
							null, ("是否要保存？"),("保存文件..."),JOptionPane.YES_NO_CANCEL_OPTION);
					if(result == JOptionPane.NO_OPTION){//不保存
						content.setText("");
					}

					else if(result == JOptionPane.CANCEL_OPTION){//取消新建
					}

					else if(result == JOptionPane.YES_OPTION)//选择保存
					{
						JFileChooser jfc = new JFileChooser();//用于选择保存路径的文件名
						int bcf = jfc.showSaveDialog(jf);

						if(bcf == JFileChooser.APPROVE_OPTION){
							try {
								//保存文件
								FileOutputStream fos=new FileOutputStream(new File(jfc.getSelectedFile().getAbsoluteFile()+".txt"));
								//获取文件保存的路径
								filePath=jfc.getSelectedFile().getAbsoluteFile()+".txt";
								byte[] b=con.getBytes();
								fos.write(b); //向文件写出数据
								fos.close(); //关闭输出流

							} catch (IOException ex) {
								Logger.getLogger(Notebook.class.getName()).log(Level.SEVERE, null, ex);
							}
							jf.setVisible(false);
							new Notebook();//新建文本文件
						}
					}
				}
			}

		});

		//2.打开菜单项的功能实现
		openitem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				FileDialog dialog = new FileDialog(new JFrame(),"打开....",FileDialog.LOAD);
				dialog.setVisible(true);
				filePath = dialog.getDirectory() + dialog.getFile();

				File file = new File(filePath);
				//声明文件字节流对象
				FileInputStream fis=null;
				StringBuilder sb = new StringBuilder();
				try{
					//创建文件输入流
					fis=new FileInputStream(file);
					String str=null;
					byte[] b=new byte[50];

					//读文件
					while(fis.read(b)!=-1){
						str=new String(b);
						sb.append(str);
					}
					content.setText(sb.toString());
				}
				catch(FileNotFoundException e1){
					e1.printStackTrace();
				}
				catch(IOException e1){
					e1.printStackTrace();
				}
				finally{
					if(fis != null){
						try{
							fis.close();
						}
						catch(IOException e1){
							e1.printStackTrace();
						}
					}
				}
			}
		});

		//3.保存菜单项的功能实现
		saveitem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				FileDialog dialog = new FileDialog(new JFrame(),"保存....",FileDialog.SAVE);
				dialog.setVisible(true);
				filePath = dialog.getDirectory() + dialog.getFile();
				if(filePath.equals("")){//没有路径时，就另存为
					JFileChooser jfc = new JFileChooser();//用于选择保存路径的文件名
					int bcf = jfc.showSaveDialog(jf);//弹出保存窗口

					if(bcf == JFileChooser.APPROVE_OPTION){
						try {
							//保存文件
							FileOutputStream fos=new FileOutputStream(new File(jfc.getSelectedFile().getAbsoluteFile()+".txt"));
							//获取文件保存的路径
							filePath=jfc.getSelectedFile().getAbsoluteFile()+".txt";
							byte[] b=content.getText().getBytes();
							fos.write(b); //向文件写出数据
							fos.close(); //关闭输出流
						} catch (IOException ex) {
							Logger.getLogger(Notebook.class.getName()).log(Level.SEVERE, null, ex);
						}
					}
				}
				else{//路径不为空时，保存在原来的路径下
					try {
						//保存文件
						BufferedWriter bfw = new BufferedWriter(
								new FileWriter(
										new File(filePath)));
						bfw.write(content.getText());//向文件写出数据
						bfw.flush();
						bfw.close();//关闭输出流
					} catch (IOException ex) {
						Logger.getLogger(Notebook.class.getName()).log(Level.SEVERE, null, ex);
					}
				}
			}

		});

		//4.另存为菜单项的功能实现
		saveasitem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JFileChooser jfc = new JFileChooser();//用于选择保存路径的文件名
				int bcf = jfc.showSaveDialog(jf);//弹出保存窗口

				if(bcf == JFileChooser.APPROVE_OPTION){
					try {
						//保存文件
						BufferedWriter bfw = new BufferedWriter(
								new FileWriter(new File(jfc.getSelectedFile().getAbsolutePath()+".txt")));
						filePath = jfc.getSelectedFile().getAbsolutePath();
						bfw.write(content.getText());//向文件写出数据
						bfw.flush();
						bfw.close();//关闭输出流
					} catch (IOException ex) {
						Logger.getLogger(Notebook.class.getName()).log(Level.SEVERE, null, ex);
					}
				}
			}

		});


		//页面设置菜单项的功能实现
		setitem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {

			}

		});


		//打印菜单项的功能实现
		printitem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {

			}

		});


		//退出菜单项的功能实现
		exititem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Object[] options = { "是的，我要退出", "不好意思，点错了" };
				int option = JOptionPane.showOptionDialog(null, "您确定要退出吗？",
						"退出提示....",JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,
						null,options, options[0]);
				if(option == JOptionPane.OK_OPTION){
					jf.dispose();
				}
			}


		});
		//创建编辑菜单上的各个菜单项并添加到菜单上
		MenuItem undoitem = new MenuItem("撤销（U）");
		undoitem.setShortcut(new MenuShortcut(KeyEvent.VK_Z,false));
		// editmenu.add(undoitem);
		MenuItem cutitem = new MenuItem("剪切（T）");
		cutitem.setShortcut(new MenuShortcut(KeyEvent.VK_X,false));
		editmenu.add(cutitem);
		MenuItem copyitem = new MenuItem("复制（C）");
		copyitem.setShortcut(new MenuShortcut(KeyEvent.VK_C,false));
		editmenu.add(copyitem);
		MenuItem pasteitem = new MenuItem("粘贴（P）");
		pasteitem.setShortcut(new MenuShortcut(KeyEvent.VK_V,false));
		editmenu.add(pasteitem);
		MenuItem deleteitem = new MenuItem("删除（L）");
		deleteitem.setShortcut(new MenuShortcut(KeyEvent.VK_DELETE,false));
		editmenu.add(deleteitem);
		editmenu.addSeparator();
		MenuItem finditem = new MenuItem("查找（F）");
		finditem.setShortcut(new MenuShortcut(KeyEvent.VK_F,false));
		editmenu.add(finditem);
		MenuItem nextitem = new MenuItem("查找下一个（N）");
		nextitem.setShortcut(new MenuShortcut(KeyEvent.VK_3,false));
		// editmenu.add(nextitem);
		MenuItem replaceitem = new MenuItem("替换（R）");
		replaceitem.setShortcut(new MenuShortcut(KeyEvent.VK_H,false));
		editmenu.add(replaceitem);
		MenuItem turntoitem = new MenuItem("转到（G）");
		turntoitem.setShortcut(new MenuShortcut(KeyEvent.VK_G,false));
		editmenu.add(turntoitem);
		editmenu.addSeparator();
		//复选菜单项
		Menu choicemenu = new Menu("选择(C)");
		MenuItem allitem = new MenuItem("全选（A）");
		allitem.setShortcut(new MenuShortcut(KeyEvent.VK_A,false));
		choicemenu.add(allitem);
		MenuItem fanxiangitem = new MenuItem("反向选择(B)");
		fanxiangitem.setShortcut(new MenuShortcut(KeyEvent.VK_B,false));
		choicemenu.add(fanxiangitem);
		MenuItem chieseitem = new MenuItem("选择汉字（C）");
		chieseitem.setShortcut(new MenuShortcut(KeyEvent.VK_C,false));
		choicemenu.add(chieseitem);
		editmenu.add(choicemenu);
		//编辑菜单项的时间/日期项
		MenuItem dateitem = new MenuItem("时间/日期（D）");
		dateitem.setShortcut(new MenuShortcut(KeyEvent.VK_5,false));
		editmenu.add(dateitem);

		//添加监听器来实现编辑菜单上的各个菜单项的功能

		//撤销菜单项的功能实现
		undoitem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			}

		});

		//剪切菜单项的功能实现
		cutitem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String text = content.getSelectedText();
				StringSelection selection = new StringSelection(text);
				clipboard.setContents(selection, null);
				if(text.length() == 0){
					return;
				}
				else{
					content.replaceRange("", content.getSelectionStart(),content.getSelectionEnd());
				}
			}

		});
		//复制菜单项的功能实现
		copyitem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String text = content.getSelectedText();
				StringSelection selection = new StringSelection(text);
				clipboard.setContents(selection, null);
			}

		});


		//粘贴菜单项的功能实现
		pasteitem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Transferable contents = clipboard.getContents(this);
				String str =null;
				try {
					str = (String) contents.getTransferData(DataFlavor.stringFlavor);
				} catch (UnsupportedFlavorException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				if (str == null)
					return;
				try {
					content.replaceRange(str,content.getSelectionStart(),content.getSelectionEnd());
				}
				catch (Exception e1) {
					e1.printStackTrace();
				}
			}

		});


		//删除菜单项的功能实现
		deleteitem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				content.replaceRange("",content.getSelectionStart(),content.getSelectionEnd());
			}

		});
		//查找菜单项的功能实现
		finditem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				final JDialog dialog = new JDialog(jf,"查找字符串...",true);
				dialog.setBounds(560,250,310,130);
				JLabel find = new JLabel("请输入字符串 :");
				final JTextField findtext = new JTextField(1);
				JButton jbu = new JButton("查找");
				dialog.setLayout(null);
				find.setBounds(10,30,90,20);
				findtext.setBounds(100,30,90,20);
				jbu.setBounds(200,30,80,20);
				dialog.add(find);
				dialog.add(findtext);
				dialog.add(jbu);
				jbu.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						String text = content.getText();
						String str = findtext.getText();
						int end = text.length();
						int len = str.length();
						int start = content.getSelectionEnd();
						if(start == end){
							start = 0;
						}
						for(;start<=end-len;start++){
							if(text.substring(start,start+len).equals(str)){
								content.setSelectionStart(start);
								content.setSelectionEnd(start+len);
								return;
							}
						}
						//若找不到待查字符串，则将光标置于末尾
						content.setSelectionStart(end);
						content.setSelectionEnd(end);
					}

				});
				dialog.addWindowListener(new WindowAdapter(){
					public void windowClosing(WindowEvent e){
						dialog.dispose();
					}
				});
				dialog.setResizable(false);
				dialog.setVisible(true);
			}

		});
		//查找下一个菜单项的功能实现
		nextitem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {

			}

		});


		//替换菜单项的功能实现
		replaceitem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				final JDialog dialog = new JDialog(jf,"字符串替换...",true);
				dialog.setBounds(560,250,310,180);
				final JLabel tihuan = new JLabel("请输入要替换的字符串 ：");
				JLabel mubiao = new JLabel("请输入替换后的字符串 ：");
				JTextField jtf1 = new JTextField(10);
				JTextField jtf2 = new JTextField(10);
				JButton jb = new JButton("替换");
				dialog.setLayout(null);
				tihuan.setBounds(10,30,150,20);
				mubiao.setBounds(10,70,150,20);
				jtf1.setBounds(160,30,110,20);
				jtf2.setBounds(160,70,110,20);
				jb.setBounds(100,110,80,20);
				dialog.add(tihuan);
				dialog.add(mubiao);
				dialog.add(jtf1);
				dialog.add(jtf2);
				dialog.add(jb);
				final String text = content.getText();
				final String str1 = tihuan.getText();
				final String str2 = mubiao.getText();
				jb.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						if(content.getSelectedText().equals(tihuan.getText())){
							content.replaceRange(str2,content.getSelectionStart(),content.getSelectionEnd());
						}
						else {
							int end=text.length();
							int len=str1.length();
							int start=content.getSelectionEnd();
							if(start==end) start=0;
							for(;start<=end-len;start++){
								if(text.substring(start,start+len).equals(str1)){
									content.setSelectionStart(start);
									content.setSelectionEnd(start+len);
									return;
								}
							}
							//若找不到待查字符串，则将光标置于末尾
							content.setSelectionStart(end);
							content.setSelectionEnd(end);
						}

					}

				});
				dialog.setResizable(false);
				dialog.setVisible(true);
			}

		});
		//转到菜单项的功能实现
		turntoitem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {

			}

		});
		//全选菜单项的功能实现
		allitem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				content.selectAll();
			}

		});
		//反向选择菜单项的功能实现
		fanxiangitem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {

			}

		});
		//选择汉字菜单项的功能实现
		chieseitem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {

			}

		});
		//时间菜单项的功能实现
		dateitem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {

				Date date=new Date();
				SimpleDateFormat simpleDate=new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
				String dateTime=simpleDate.format(date);

				content.appendText(dateTime);

			}

		});
		//创建格式菜单上的各个菜单项并添加到菜单上
		CheckboxMenuItem lineturnitem = new CheckboxMenuItem("自动换行（W）");
		formatmenu.add(lineturnitem);
		formatmenu.addSeparator();
		MenuItem worditem = new MenuItem("字体（F）");
		formatmenu.add(worditem);
		worditem.setEnabled(true);
		formatmenu.addSeparator();
		MenuItem coloritem = new MenuItem("字体颜色（C）");
		formatmenu.add(coloritem);

		//添加监听器来实现格式菜单上的各个菜单项的功能


		//自动换行菜单项的功能实现
		lineturnitem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			}

		});
		//字体菜单项的功能实现
		worditem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				final JFrame ztsz = new JFrame("字体设置...");//字体设置窗口
				//字体
				ztsz.setLocation(150, 200);
				jf.setEnabled(false);//文本编辑窗体不可用！
				final JComboBox jc = new JComboBox(
						GraphicsEnvironment.getLocalGraphicsEnvironment()
								.getAvailableFontFamilyNames());
				jc.setLocation(30, 80);
				Container c = ztsz.getContentPane();
				JPanel jp = new JPanel();
				jp.add(jc,new FlowLayout());

				//字形
				String[]   faceString={"正常","粗体","斜体","粗斜体"};
				System.out.println("正常="+Font.PLAIN);
				System.out.println("粗体="+Font.BOLD);
				System.out.println("斜体="+Font.ITALIC);
				System.out.println("出斜体="+(Font.BOLD+Font.ITALIC));

				final int[]   faceStringFont={Font.PLAIN,Font.BOLD,Font.ITALIC,(Font.BOLD+Font.ITALIC)};

				String[] sizeString = new String[]{
						"8", "9", "10", "11", "12", "14", "16", "18", "20", "22", "24", "26", "28", "36", "48", "72",
						"初号", "小初", "一号", "小一", "二号", "小二", "三号", "小三", "四号", "小四", "五号", "小五", "六号", "小六", "七号", "八号"
				};

				final int sizeVal[] = {8, 9, 10, 11, 12, 14, 16, 18, 20, 22, 24, 26, 28, 36, 48, 72, 42, 36, 26, 24, 22, 18, 16, 15, 14, 12, 11, 9, 8, 7, 6, 5};


				final JComboBox zx = new JComboBox(faceString);
				final JComboBox dx = new JComboBox(sizeString);
				final JButton sure = new JButton("确定");
				final JButton cancel = new JButton("取消");

				jp.add(zx);
				jp.add(dx);
				jp.add(sure);
				jp.add(cancel);
				c.add(jp);


				//确定
				sure.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){//将文本设置成所选的字体
						if(!content.getText().equals("")){
							System.out.println("jc.getActionCommand="+jc.getSelectedItem());
							System.out.println("zx.getSelectedIndex="+faceStringFont[zx.getSelectedIndex()]);

							System.out.println("dx.getSelectedIndex="+sizeVal[dx.getSelectedIndex()]);


							content.setFont(
									//
									new Font((String) jc.getSelectedItem(),faceStringFont[zx.getSelectedIndex()],sizeVal[dx.getSelectedIndex()]));

							jf.setEnabled(true);//文本编辑窗体可用
							ztsz.dispose();
						}
						else{
							JOptionPane.showMessageDialog(null,
									"您的文本中还没有内容，请输入内容后重新设置！"
									,"消息...",JOptionPane.INFORMATION_MESSAGE);
							jf.setEnabled(true);
							ztsz.dispose();
						}
					}
				});
				cancel.addActionListener(new ActionListener(){//取消
					public void actionPerformed(ActionEvent e){
						jf.setEnabled(true);//文本编辑窗体可用
						ztsz.dispose();//关闭字体设置窗体
					}
				});
				ztsz.setSize(360, 100);//设置窗体长度100和宽度360
				ztsz.setVisible(true);//窗体可见
				ztsz.setResizable(false);//禁止放大窗体
			}
		});
		//字体颜色菜单项的功能实现
		coloritem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				color=JColorChooser.showDialog(jf,"",color);
				content.setForeground(color);
			}

		});

		//添加监听器来实现查看菜单上的各个菜单项的功能
		//字数统计菜单项的功能实现
		MenuItem countitem = new MenuItem("字数统计（C）");
		viewmenu.add(countitem);
		countitem.setEnabled(true);
		countitem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				int size=content.getText().length();
				JOptionPane.showMessageDialog(null,"总的字数（包括标点符号）是："+size,"字数统计",JOptionPane.INFORMATION_MESSAGE);

			}

		});
		//状态栏菜单项的功能实现
		MenuItem stateitem = new MenuItem("状态栏（S）");
		viewmenu.add(stateitem);
		stateitem.setEnabled(false);
		stateitem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {

			}

		});

		//创建帮助菜单上的各个菜单项并添加到菜单上
		MenuItem findhelpitem = new MenuItem("查看帮助（H）");
		helpmenu.add(findhelpitem);
		findhelpitem.setEnabled(false);
		helpmenu.addSeparator();
		MenuItem aboutboxitem = new MenuItem("关于记事本（A）");
		helpmenu.add(aboutboxitem);
		helpmenu.addSeparator();
		MenuItem writeritem = new MenuItem("关于作者（S）");
		helpmenu.add(writeritem);
		//添加监听器来实现帮助菜单上的各个菜单项的功能
		//查看帮助菜单项的功能实现
		findhelpitem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){

			}
		});
		//关于记事本菜单项的功能实现
		aboutboxitem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(jf,"本软件由孤独的野狼制作！\n如需要源代码，随时欢迎联系作者！\n" +
						"作者邮箱：sunchuanhui212@126.com\nQQ号：2442701497\n本程序基本上实现了Microsoft记事本的功能\n" +
						"并新增了“反向选择”，“选择汉字”\n" +
						"“字数统计”,“自动保存”等功能  ...\n希望您喜欢！\n" +
						"如有任何疑问及改善意见，随时欢迎指出，\n我们将尽最大的努力满足您的需求！\n" +
						"最后谢谢您的使用！\n版权所有，请勿侵权！","关于记事本...",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		//关于作者菜单项的功能实现

		//关闭程序事件
		jf.addWindowListener(new WindowAdapter(){
			//程序关闭时的方法
			public void windowClosing(WindowEvent e){
				int option = JOptionPane.showConfirmDialog(null, "您确定关闭吗？",
						"关闭提示....",JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
				if(option == JOptionPane.OK_OPTION){
					((Window) e.getComponent()).dispose();
					jf.dispose();
				}
			}
		});
	}
	public static void main(String[] args){
		new Notebook();
	}
}
