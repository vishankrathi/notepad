import java.awt.*;
import java.awt.event.*;

class menu_java extends Frame implements ActionListener, ItemListener
{
	MenuBar mb;
	Menu m1, m2,m3,m4,m5;
	MenuItem mi1, mi2, mi3,mi4,mi5,mi6,mi7,mi8,mi9;
	int fweight;
	TextArea ta;
	Dialog d1,d2,d3;
	Button b1,b2,b3;
	FileDialog fd1,fd2;
	Choice ch1;
	CheckboxGroup cbg;
	Checkbox cb1,cb2,cb3,cb4;
	List ch2,ch3,ch4;
	Label l1,l2,l3,l4,l5;
	TextField t1,t2,t3,t4;
	String num1,num2,num3;
	String sabhi[]={"Consolas","Constania","Cooper","Copperate","Courier","Agency","Algerian","Arial","Arial Round MT"};
	String abhi[]={"regular","italic","bold italic","bold"};
	String ravi[]={"2","4","6","8","10","12","14","16","18","34"};
	String red,Black,green,yellow,y;
	menu_java()
	{
		fd1=new FileDialog(this,"Open File",FileDialog.LOAD);
		fd2=new FileDialog(this,"Save File ",FileDialog.SAVE);
		
		d1=new Dialog(this);
		d1.setSize(300,300);
		d1.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		d2=new Dialog(this);
		d2.setSize(500,500);
		d2.setLayout(null);
		
		d3=new Dialog(this);
		d3.setSize(500,500);
		d3.setLayout(null);
		
		b1=new Button("Cancel");
		b1.addActionListener(this);
		d1.add(b1);
		b2=new Button("ok");
		b2.setBounds(50,450,80,20);
		b2.addActionListener(this);
		d2.add(b2);
		b3=new Button("ok");
		b3.setBounds(50,450,80,20);
		b3.addActionListener(this);
		d3.add(b3);
		
		ta=new TextArea();
		add(ta);
		
		mb=new MenuBar();
		setMenuBar(mb);
		
		m1=new Menu("File");
		m2=new Menu("Edit");
		m3=new Menu("format");
		m4=new Menu("view");
		m5=new Menu("help");
		
		mi1=new MenuItem("Open");
		mi1.addActionListener(this);
		mi2=new MenuItem("Save");
		mi2.addActionListener(this);
		mi3=new MenuItem("Save As");
		mi3.addActionListener(this);
		mi4=new MenuItem("font");
		mi4.addActionListener(this);
		mi5=new MenuItem("color");
		mi5.addActionListener(this);
		
		mi6=new MenuItem("cut");
		mi7=new MenuItem("copy");
		mi8=new MenuItem("paste");
		mi9=new MenuItem("delete");
		
		l1=new Label("font:");
		l1.setBounds(50,50,80,50);
		t1=new TextField(10);
		t1.setBounds(50,80,100,20);
		ch2=new List();
		for(int i=0;i<sabhi.length;i++)
		ch2.add(sabhi[i]);
		ch2.addItemListener(this);
		ch2.setBounds(50,100,120,80);
		l2=new Label("Script:");
		l2.setBounds(310,360,100,100);
		ch1=new Choice();
		ch1.add("Greek");
		ch1.add("Turkish");
		ch1.add("baltic");
		ch1.add("hindi");
		ch1.add("english");
		ch1.add("spanish");
		ch1.add("potugese");
		ch1.add("australia");
		ch1.setBounds(310,420,100,80);
		l3=new Label("fontstyle:");
		l3.setBounds(190,65,80,20);
		t2=new TextField(10);
		t2.setBounds(190,80,100,20);
		ch3=new List();
		for(int i=0;i<abhi.length;i++)
		ch3.add(abhi[i]);
		ch3.setBounds(190,100,100,60);
		ch3.addItemListener(this);
		l4=new Label("size:");
		l4.setBounds(310,65,80,20);
		t3=new TextField(10);
		t3.setBounds(310,80,100,20);
		ch4=new List();
		for(int i=0;i<ravi.length;i++)
		ch4.add(ravi[i]);
		ch4.setBounds(310,100,100,60);
		ch4.addItemListener(this);
		
		
		cbg=new CheckboxGroup();
		cb1=new Checkbox("red",false,cbg);
		cb1.setBounds(160,180,100,20);
		
		cb2=new Checkbox("orange",false,cbg);
		cb2.setBounds(300,180,100,20);
		
		cb3=new Checkbox("yellow",false,cbg);
		cb3.setBounds(160,260,100,20);
		
		cb4=new Checkbox("black",false,cbg);
		cb4.setBounds(300,260,100,20);
		
		
		d2.add(ch1);
		d2.add(l2);
		d2.add(ch2);
		d2.add(t1);
		d2.add(l1);
		d2.add(ch3);
		d2.add(t2);
		d2.add(l3);
		d2.add(l4);
		d2.add(ch3);
		d2.add(t3);
		d2.add(ch4);
		
		d3.add(cb1);
		d3.add(cb2);
		d3.add(cb3);
		d3.add(cb4);
		
		m1.add(mi1);
		m1.add(mi2);
		m1.add(mi3);
		m2.add(mi6);
		m2.add(mi7);
		m2.add(mi8);
		m2.add(mi9);
		m3.add(mi4);
		m3.add(mi5);
		
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		mb.add(m4);
		mb.add(m5);
		
		
		
		setSize(1000,1000);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==mi3)
			d1.show();

		if(ae.getSource()==b1){
			d1.dispose();}
	
		if(ae.getSource()==mi1)
			fd1.show();
		if(ae.getSource()==mi2)
			fd2.show();
		if(ae.getSource()==mi4)
			d2.show();
		
		if(ae.getSource()==b2)
		{
			String fnt=t1.getText();
			String k=t2.getText();
			if(k.equals("Italic"));
			{
				fweight=Font.ITALIC;
			}
			if(k.equals("bold"));
			{
				fweight=Font.BOLD;
			}
			if(k.equals("Bold italic"));
			{
				fweight=Font.BOLD+Font.ITALIC;
			}
			
			int fsize=Integer.parseInt(t3.getText());
			ta.setFont(new Font(fnt,fweight,fsize));
			d2.dispose();
		}
		if(ae.getSource()==mi5)
			d3.show();
		if(ae.getSource()==b3)
		{
			if(cb1.getState()==true)
				   ta.setForeground(Color.red);
			if(cb2.getState()==true)
				   ta.setForeground(Color.black);
			if(cb3.getState()==true)
				   ta.setForeground(Color.blue);
		    if(cb4.getState()==true)
				   ta.setForeground(Color.green);

			
			d3.dispose();
		}
	}
	public void itemStateChanged(ItemEvent ie)
	{
		if(ie.getSource()==ch2)
			t1.setText(ch2.getSelectedItem());
		if(ie.getSource()==ch3)
	        t2.setText(ch3.getSelectedItem());
		if(ie.getSource()==ch4)
		    t3.setText(ch4.getSelectedItem());
		
	}
		
	
	
	public static void main(String [] ar)
	{
		new menu_java();
	}
}