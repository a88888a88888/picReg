import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MainEntry  extends JFrame{
	
	private JComboBox comboBox=new JComboBox(); 
	private int cnt = 0;
	
	 public MainEntry(){        //构造函数，初始化对象值

	     //设置为边界布局，组件间横向、纵向间距均为5像素

		 setLayout(new BorderLayout(50,50)); 
		 JLabel label=new JLabel("自定义下拉框:");  
		 getContentPane().add(label);  
		 comboBox.addItem("默认选项");
	     getContentPane().add("North", comboBox);     //将按钮添加到窗口中
		 
	     label=new JLabel("带图片的文字标签");  
	      label.setIcon(new ImageIcon("1.jpg"));
		 getContentPane().add("South",label);  
		 
		 getContentPane().add("East",  new JPanel());
	     getContentPane().add("West",  new JPanel());
	     
	     JButton jBtn = new JButton("增加一个选项");
	     jBtn.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent e) {
		        	comboBox.addItem("新增选项" + cnt++);
	            }
	        });
	     getContentPane().add("Center",jBtn); 
		 this.setVisible(true);  
	  } 
	 
	    
	public static void main(String[] args) {
		MainEntry f = new MainEntry();
		f.setTitle("图片标签下拉框布局按钮响应");
		f.pack();
		f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);             //让窗体居中显示
	}
}

