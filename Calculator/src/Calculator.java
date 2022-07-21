import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;



public class Calculator implements ActionListener{
	JFrame jf;
	JLabel displaylabel;
	boolean isOperatorClicked=false;
	String oldValue="";
	String newValue="";
	String operatorClicked="";
	float oldValueF=0;
	float newValueF=0;
	
	JButton sevenbutton;
	JButton eightbutton;
	JButton ninebutton;
	JButton onebutton;
	JButton twobutton;
	JButton threebutton;
	JButton fourbutton;
	JButton fivebutton;
	JButton sixbutton;
	JButton zerobutton;
	JButton dotbutton;
	JButton clearbutton;
	
	JButton divbutton;
	JButton mulbutton;
	JButton plusbutton;
	JButton minusbutton;
	JButton equalbutton;
	
	
	
	
	public Calculator() {
		jf=new JFrame("calculator");
		jf.setLayout(null);
		jf.setSize(600, 600);
		jf.setLocation(300, 100);
		
		displaylabel=new JLabel("");
		displaylabel.setBounds(30, 50, 540, 40);
		displaylabel.setBackground(Color.gray);
		displaylabel.setForeground(Color.white);
		displaylabel.setOpaque(true);
		displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
		jf.add(displaylabel);
		
		
		sevenbutton=new JButton("7");
		sevenbutton.setBounds(30, 130, 80, 80);
		jf.add(sevenbutton);
		sevenbutton.setFont(new Font("Arial", Font.PLAIN, 30));
		sevenbutton.addActionListener(this);
		
		eightbutton=new JButton("8");
		eightbutton.setBounds(130, 130, 80, 80);
		jf.add(eightbutton);
		eightbutton.setFont(new Font("Arial", Font.PLAIN, 30));
		eightbutton.addActionListener(this);
		
		ninebutton=new JButton("9");
		ninebutton.setBounds(230, 130, 80, 80);
		jf.add(ninebutton);
		ninebutton.setFont(new Font("Arial", Font.PLAIN, 30));
		ninebutton.addActionListener(this);
		
		
		fourbutton=new JButton("4");
		fourbutton.setBounds(30, 230, 80, 80);
		jf.add(fourbutton);
		fourbutton.setFont(new Font("Arial", Font.PLAIN, 30));
		fourbutton.addActionListener(this);
		
		fivebutton=new JButton("5");
		fivebutton.setBounds(130, 230, 80, 80);
		jf.add(fivebutton);
		fivebutton.setFont(new Font("Arial", Font.PLAIN, 30));
		fivebutton.addActionListener(this);
		
		sixbutton=new JButton("6");
		sixbutton.setBounds(230, 230, 80, 80);
		jf.add(sixbutton);
		sixbutton.setFont(new Font("Arial", Font.PLAIN, 30));
		sixbutton.addActionListener(this);
		
		
		onebutton=new JButton("1");
		onebutton.setBounds(30, 330, 80, 80);
		jf.add(onebutton);
		onebutton.setFont(new Font("Arial", Font.PLAIN, 30));
		onebutton.addActionListener(this);
		
		twobutton=new JButton("2");
		twobutton.setBounds(130, 330, 80, 80);
		jf.add(twobutton);
		twobutton.setFont(new Font("Arial", Font.PLAIN, 30));
		twobutton.addActionListener(this);
		
		threebutton=new JButton("3");
		threebutton.setBounds(230, 330, 80, 80);
		jf.add(threebutton);
		threebutton.setFont(new Font("Arial", Font.PLAIN, 30));
		threebutton.addActionListener(this);
		
		
		dotbutton=new JButton(".");
		dotbutton.setBounds(30, 430, 80, 80);
		jf.add(dotbutton);
		dotbutton.setFont(new Font("Arial", Font.PLAIN, 30));
		dotbutton.addActionListener(this);
		
		zerobutton=new JButton("0");
		zerobutton.setBounds(130, 430, 80, 80);
		jf.add(zerobutton);
		zerobutton.setFont(new Font("Arial", Font.PLAIN, 30));
		zerobutton.addActionListener(this);
		
		equalbutton=new JButton("=");
		equalbutton.setBounds(230, 430, 80, 80);
		jf.add(equalbutton);
		equalbutton.setFont(new Font("Arial", Font.PLAIN, 30));
		equalbutton.addActionListener(this);
		
		
		divbutton=new JButton("/");
		divbutton.setBounds(330, 130, 80, 80);
		jf.add(divbutton);
		divbutton.setFont(new Font("Arial", Font.PLAIN, 30));
		divbutton.addActionListener(this);
		
		mulbutton=new JButton("x");
		mulbutton.setBounds(330, 230, 80, 80);
		jf.add(mulbutton);
		mulbutton.setFont(new Font("Arial", Font.PLAIN, 30));
		mulbutton.addActionListener(this);
		
		minusbutton=new JButton("-");
		minusbutton.setBounds(330, 330, 80, 80);
		jf.add(minusbutton);
		minusbutton.setFont(new Font("Arial", Font.PLAIN, 30));
		minusbutton.addActionListener(this);
		
		plusbutton=new JButton("+");
		plusbutton.setBounds(330, 430, 80, 80);
		jf.add(plusbutton);
		plusbutton.setFont(new Font("Arial", Font.PLAIN, 30));
		plusbutton.addActionListener(this);
		
		clearbutton=new JButton("clear");
		clearbutton.setBounds(430, 430, 80, 80);
		jf.add(clearbutton);
		clearbutton.setFont(new Font("Arial", Font.PLAIN, 20));
		clearbutton.addActionListener(this);
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Calculator();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== sevenbutton)
		{
			if(isOperatorClicked) {
				
				this.newValue=newValue.concat("7");
				
				displaylabel.setText(newValue);
				
			}
			else {
		displaylabel.setText(displaylabel.getText()+"7");
			}
		
		}
		else if(e.getSource()== eightbutton)
		{
			if(isOperatorClicked) {
				
				this.newValue=newValue.concat("8");
				
				displaylabel.setText(newValue);
				
			}
			else {
		displaylabel.setText(displaylabel.getText()+"8");
			}
		
		}
		else if(e.getSource()== sixbutton)
		{
			if(isOperatorClicked) {
				
				this.newValue=newValue.concat("6");
				
				displaylabel.setText(newValue);
				
			}
			else {
		displaylabel.setText(displaylabel.getText()+"6");
			}
		
		}
		else if(e.getSource()== ninebutton)
		{
			if(isOperatorClicked) {
				
				this.newValue=newValue.concat("9");
				
				displaylabel.setText(newValue);
				
			}
			else {
		displaylabel.setText(displaylabel.getText()+"9");
			}
		
		}
		else if(e.getSource()== fivebutton)
		{
			if(isOperatorClicked) {
				
				this.newValue=newValue.concat("5");
				
				displaylabel.setText(newValue);
				
			}
			else {
		displaylabel.setText(displaylabel.getText()+"5");
			}
		
		}
		else if(e.getSource()== fourbutton)
		{
			if(isOperatorClicked) {
				
				this.newValue=newValue.concat("4");
				
				displaylabel.setText(newValue);
				
			}
			else {
		displaylabel.setText(displaylabel.getText()+"4");
			}
		
		}
		else if(e.getSource()== onebutton)
		{
			if(isOperatorClicked) {
				
				this.newValue=newValue.concat("1");
				
				displaylabel.setText(newValue);
				
			}
			else {
		displaylabel.setText(displaylabel.getText()+"1");
			}
		
		}
		else if(e.getSource()== twobutton)
		{
			if(isOperatorClicked) {
				
				this.newValue=newValue.concat("2");
				
				displaylabel.setText(newValue);
				
			}
			else {
		displaylabel.setText(displaylabel.getText()+"2");
			}
		
		}
		else if(e.getSource()== threebutton)
		{
			if(isOperatorClicked) {
				
				this.newValue=newValue.concat("3");
				
				displaylabel.setText(newValue);
				
			}
			else {
		displaylabel.setText(displaylabel.getText()+"3");
			}
		
		}
		else if(e.getSource()== zerobutton)
		{
			if(isOperatorClicked) {
				
				this.newValue=newValue.concat("0");
				
				displaylabel.setText(newValue);
				
			}
			else {
		displaylabel.setText(displaylabel.getText()+"0");
			}
		
		}
		else if(e.getSource()== dotbutton)
		{
			if(isOperatorClicked) {
				
				this.newValue=newValue.concat(".");
				
				displaylabel.setText(newValue);
				
			}
			else {
		displaylabel.setText(displaylabel.getText()+".");
			}
		
		}
		else if(e.getSource()== clearbutton)
		{
			displaylabel.setText("");
		}
		else if(e.getSource()== plusbutton)
		{
			if(this.operatorClicked=="+")
			{
				if(this.oldValueF==0)
				{
					this.oldValueF=Float.parseFloat(displaylabel.getText());
				}
				else
				{
					this.oldValueF=this.oldValueF+Float.parseFloat(displaylabel.getText());
				}	
			}
			else if(this.operatorClicked=="-")
			{
				if(this.oldValueF==0)
				{
					this.oldValueF=Float.parseFloat(displaylabel.getText());
				}
				else
				{
					this.oldValueF=this.oldValueF-Float.parseFloat(displaylabel.getText());
				}	
			}
			else if(this.operatorClicked=="/")
			{
				if(this.oldValueF==0)
				{
					this.oldValueF=Float.parseFloat(displaylabel.getText());
				}
				else
				{
					this.oldValueF=this.oldValueF/Float.parseFloat(displaylabel.getText());
				}	
			}
			else if(this.operatorClicked=="*")
			{
				if(this.oldValueF==0)
				{
					this.oldValueF=Float.parseFloat(displaylabel.getText());
				}
				else
				{
					this.oldValueF=this.oldValueF*Float.parseFloat(displaylabel.getText());
				}	
			}
			else if(this.operatorClicked=="")
			{
				this.oldValueF=Float.parseFloat(displaylabel.getText());
			}
			isOperatorClicked=true;
			this.operatorClicked="+";
			this.newValue="";
			
			oldValue= displaylabel.getText();
			displaylabel.setText("");
			
		
		}
			
		else if(e.getSource()== minusbutton)
		{
			if(this.operatorClicked=="+")
			{
				if(this.oldValueF==0)
				{
					this.oldValueF=Float.parseFloat(displaylabel.getText());
				}
				else
				{
					this.oldValueF=this.oldValueF+Float.parseFloat(displaylabel.getText());
				}	
			}
			else if(this.operatorClicked=="-")
			{
				if(this.oldValueF==0)
				{
					this.oldValueF=Float.parseFloat(displaylabel.getText());
				}
				else
				{
					this.oldValueF=this.oldValueF-Float.parseFloat(displaylabel.getText());
				}	
			}
			else if(this.operatorClicked=="/")
			{
				if(this.oldValueF==0)
				{
					this.oldValueF=Float.parseFloat(displaylabel.getText());
				}
				else
				{
					this.oldValueF=this.oldValueF/Float.parseFloat(displaylabel.getText());
				}	
			}
			else if(this.operatorClicked=="*")
			{
				if(this.oldValueF==0)
				{
					this.oldValueF=Float.parseFloat(displaylabel.getText());
				}
				else
				{
					this.oldValueF=this.oldValueF*Float.parseFloat(displaylabel.getText());
				}	
			}
			else if(this.operatorClicked=="")
			{
				this.oldValueF=Float.parseFloat(displaylabel.getText());
			}
			isOperatorClicked=true;
			this.operatorClicked="-";
			this.newValue="";
			
			oldValue= displaylabel.getText();
			displaylabel.setText("");
			
		
		}
		else if(e.getSource()== divbutton)
		{
			if(this.operatorClicked=="+")
			{
				if(this.oldValueF==0)
				{
					this.oldValueF=Float.parseFloat(displaylabel.getText());
				}
				else
				{
					this.oldValueF=this.oldValueF+Float.parseFloat(displaylabel.getText());
				}	
			}
			else if(this.operatorClicked=="-")
			{
				if(this.oldValueF==0)
				{
					this.oldValueF=Float.parseFloat(displaylabel.getText());
				}
				else
				{
					this.oldValueF=this.oldValueF-Float.parseFloat(displaylabel.getText());
				}	
			}
			else if(this.operatorClicked=="/")
			{
				if(this.oldValueF==0)
				{
					this.oldValueF=Float.parseFloat(displaylabel.getText());
				}
				else
				{
					this.oldValueF=this.oldValueF/Float.parseFloat(displaylabel.getText());
				}	
			}
			else if(this.operatorClicked=="*")
			{
				if(this.oldValueF==0)
				{
					this.oldValueF=Float.parseFloat(displaylabel.getText());
				}
				else
				{
					this.oldValueF=this.oldValueF*Float.parseFloat(displaylabel.getText());
				}	
			}
			else if(this.operatorClicked=="")
			{
				this.oldValueF=Float.parseFloat(displaylabel.getText());
			}
			isOperatorClicked=true;
			this.operatorClicked="/";
			this.newValue="";
			
			oldValue= displaylabel.getText();
			displaylabel.setText("");
			
		
		}
		else if(e.getSource()== mulbutton)
		{
			if(this.operatorClicked=="+")
			{
				if(this.oldValueF==0)
				{
					this.oldValueF=Float.parseFloat(displaylabel.getText());
				}
				else
				{
					this.oldValueF=this.oldValueF+Float.parseFloat(displaylabel.getText());
				}	
			}
			else if(this.operatorClicked=="-")
			{
				if(this.oldValueF==0)
				{
					this.oldValueF=Float.parseFloat(displaylabel.getText());
				}
				else
				{
					this.oldValueF=this.oldValueF-Float.parseFloat(displaylabel.getText());
				}	
			}
			else if(this.operatorClicked=="/")
			{
				if(this.oldValueF==0)
				{
					this.oldValueF=Float.parseFloat(displaylabel.getText());
				}
				else
				{
					this.oldValueF=this.oldValueF/Float.parseFloat(displaylabel.getText());
				}	
			}
			else if(this.operatorClicked=="*")
			{
				if(this.oldValueF==0)
				{
					this.oldValueF=Float.parseFloat(displaylabel.getText());
				}
				else
				{
					this.oldValueF=this.oldValueF*Float.parseFloat(displaylabel.getText());
				}	
			}
			else if(this.operatorClicked=="")
			{
				this.oldValueF=Float.parseFloat(displaylabel.getText());
			}
			isOperatorClicked=true;
			this.operatorClicked="*";
			this.newValue="";
			
			oldValue= displaylabel.getText();
			displaylabel.setText("");
			
		
		}		
		else if(e.getSource()== clearbutton)
		{
			displaylabel.setText("");
		}
		else if(e.getSource()== equalbutton)
		{
			if (this.operatorClicked=="+")
			{
				newValueF= Float.parseFloat(newValue);
				float result=oldValueF+newValueF;
				displaylabel.setText(result+"");
				
			}
			else if (this.operatorClicked=="-")
			{
				newValueF= Float.parseFloat(newValue);
				float result=oldValueF-newValueF;
				displaylabel.setText(result+"");
				
			}
			else if (operatorClicked=="*")
			{
				newValueF= Float.parseFloat(newValue);
				float result=oldValueF*newValueF;
				displaylabel.setText(result+"");
				
			}
			else if (operatorClicked=="/")
			{
				newValueF= Float.parseFloat(newValue);
				float result=oldValueF/newValueF;
				displaylabel.setText(result+"");
				
			}
			this.oldValue="";
			this.newValue="";
			this.oldValueF=0;
			this.newValueF=0;

			
		}
		
	}

}
