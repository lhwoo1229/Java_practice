package Java_practice.test1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import calculator.Calc.NorthPanel.CenterPanel;

public class Calc extends JFrame{
	
	static JLabel label;	//모든 클래스에서 공유할 수 있게 전역변수로 선언
	static JLabel info;		//현재 상황 및 연산결과 알려주는 JLabel,
	static int flag = 0;	//상황에 따라 바뀌는 int 변수
	static int check = 0;	//(flag: 계산 결과가 양수인지, check: 10,000,000 미만의 수를 입력했는지)
	
	public Calc() {
		setTitle("계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout(5,5));
		c.setBackground(Color.black);
		
		//BorderLayout으로 배치, 각 위치에 JPanel 부착
		NorthPanel NP = new NorthPanel();	
		c.add(NP, BorderLayout.EAST);		
		
		CenterPanel CP = new CenterPanel();
		c.add(CP, BorderLayout.SOUTH);
		
		setSize(500, 600);
		setVisible(true);
	}
	class NorthPanel extends JPanel{
		
		public NorthPanel() {
			//JPanel로 구성된 NorthPanel 계산결과를 가운데 나타내기 위해 GridLayout으로 설정
			//첫 행에는 상황을 알려주는 JLabel, 
			//두번째 행에는 연산 과정 및 결과를 보여주는 JLabel을 부착
			setLayout(new GridLayout(3, 1));
			setBackground(Color.BLACK);
			info = new JLabel("수식을 입력하시오 ");
			label = new JLabel("");
			
			info.setFont(new Font("맑은 고딕", 0, 20));
			info.setBackground(Color.BLACK);
			info.setBackground(Color.WHITE);
			info.setHorizontalAlignment(SwingConstants.RIGHT);
			
			label.setFont(new Font("맑은 고딕", 0, 40));
			info.setBackground(Color.BLACK);
			info.setBackground(Color.WHITE);
			info.setHorizontalAlignment(SwingConstants.RIGHT);
			
			add(info); add(label);
			label.addMouseListener(new MyMouse());
		}
		class MyMouse extends MouseAdapter{
			public void mousePressed(MouseEvent e) {
				if(e.getClickCount()==2) {	//연산 과정 및 결과 보여주는 label에 부착된 이벤트 리스너
					flag = 0;				// *더블 클릭 시 텍스트 모두 지우기*
					label.setText("");
					info.setText("수식을 입력하시오");
				}
			}
		}
		class CenterPanel extends JPanel{
			public CenterPanel() {
				JButton[] bt = new JButton[16]; //배열로 JButton 선언!
				setBackground(Color.BLACK);
				setLayout(new GridLayout(4,4,5,5)); //GridLayout 사용해서 동일한 크기로 설정 (행,열,레이아웃간 간격)
				
				bt[0] = new JButton("7");
				bt[1] = new JButton("8");
				bt[2] = new JButton("9");
				bt[3] = new JButton("÷");
				
				bt[4] = new JButton("4");
				bt[5] = new JButton("5");
				bt[6] = new JButton("6");
				bt[7] = new JButton("×");
				
				bt[8] = new JButton("1");
				bt[9] = new JButton("2");
				bt[10] = new JButton("3");
				bt[11] = new JButton("-");
				
				bt[12] = new JButton("C");
				bt[13] = new JButton("0");
				bt[14] = new JButton("=");
				bt[15] = new JButton("+");
				
				for(int i=0; i<=15; i++) {
					if(i%4 != 3 && i<11) {
						bt[i].setFont(new Font("맑은 고딕", 0, 30));
						bt[i].setBackground(Color.GRAY);	//숫자 버튼 디자인 설정
						bt[i].setForeground(Color.WHITE); //전경색 설정
						add(bt[i]);
						
						bt[i].addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								if(flag==0) {
									JButton b = (JButton)e.getSource(); //
									String oldtext = label.getText();	// 숫자 버튼 클릭 시 기존 텍스트에 버튼 텍스트 새로 붙이기
									String text = b.getText();			// (flag==()일때만, 즉 계산 결과가 양수일 때만
									String newtext = oldtext + text;	//
									
									//109~111 텍스트 길이에 다라 글자 크기 조절(10자리 넘어가면 40p >>30p)
									int n = newtext.length();
									if(n<=10) label.setFont(new Font("맑은 고딕", 0, 40));
									else if (n>10) label.setFont(new Font("맑은 고딕", 0, 30));
									
									// 텍스트 길이 25 초과시 추가 입력 불가
									if(n<=25) {
										label.setText(newtext);
										info.setText("수식을 계산 중입니다...");
									}else if(n>25) {
										info.setText("입력 가능한 범위를 초과하였습니다.");
									}
								}
							}
						});
					}
					// 125~129 C,= 버튼 디자인 설정
					else if(i==12 || i==14) {
						bt[i].setFont(new Font("맑은 고딕", 0, 30));
						bt[i].setBackground(Color.LIGHT_GRAY);
						bt[i].setForeground(Color.WHITE);
						add(bt[i]);
						
						bt[12].addActionListener(new ActionListener () {
							public void actionPerformed(ActionEvent e) {
								int n = label.getText().length()-1;
								
								if(n==0) {
									label.setText("");
									info.setText("수식을 입력하세요");
									flag =0;
								}
								else if(n>0 && n<=10) {
									label.setFont(new Font("맑은 고딕", 0, 40));
									label.setText(label.getText().substring(0, n));
									info.setText("수식을 지우는 중입니다...");
								}
								else {
									label.setFont(new Font("맑은 고딕", 0, 35));
									label.setText(label.getText().substring(0, n));
									info.setText("수식을 지우는 중입니다...");
								}
							}
						});
						
						bt[14].addActionListener(new CalcListener());
					}
					
					else if(i%4 ==3) {
						bt[i].setFont(new Font("맑은 고딕", 0, 40));
						bt[i].setBackground(Color.WHITE);
						add(bt[i]);
						bt[i].addActionListener(new MyListener());
					}
					
				}
			}
		}
		
		private class MyListener implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton)e.getSource();
				int n = label.getText().length();
				Character ch = label.getText().charAt(n-1);
				if(flag==0 && ch!='+' && ch!='-' && ch!='×' && ch!='÷') {
					String oldtext = label.getText();
					String text = btn.getText();
					String newtext = oldtext + text;
					label.setText(newtext);
					info.setText("수식을 계산 중입니다...");
					
				}
			}
		}
		
		public class CalcListener implements ActionListener{
			public void actionPerFormed(ActionEvent e) {
				String s = label.getText();
				double result = Culculator(s);
				label.setFont(new Font("맑은 고딕", 0, 40));
			}
		}
	}

	public static void main(String[] args) {

		new Calc;
	}

}
