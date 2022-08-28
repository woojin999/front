package practice;

import java.util.Scanner;

public class GameStarter {

	public static void main(String[] args) {
		// 2022-05-20 주말과제
		// midaseye@naver.com > java_2nd_hw_이름_20220523.zip
		// 2022-05-23 14:00 전까지
		// 나머지 캐릭터를 생성하는 코드와 각 캐릭터의 클래스를 생성
		// 현재는 게임을 종료하면 생성한 캐릭터가 사라지고 다시 게임을 시작
		// 이 구조에서 아래와 같은 구조로 만들어 보세요
		
		// 게임 종료 전에는 캐릭터의 정보값이 초기화 되지 않고 사용할 수 있어야함 
		// 게임 종료 전에 캐릭터를 변경할 수 있어야 함
		// 필요한 추상클래스나 일반 클래스를 더 만드는 것도 가능
		
		Scanner sc = new Scanner(System.in);
		Character ch = null; // 캐릭터 추상 클래스 선언
		PlayGame pg = null; // 게임진행 클래스 선언
		
		System.out.println("원하는 캐릭터를 선택하세요 > ");
		System.out.println("1.피카츄 2.꼬북이 3.이상해씨 4.파이리");
		int chNum = sc.nextInt(); // 캐릭터 선택
		
		switch (chNum) {
		case 1:
			ch = new Picachu(); // 1번에 해당하는 피카츄 객체 생성
			break;
		case 2:
			ch = new PyLee(); 
			break;
		case 3:
			ch = new Kobbugi(); 
			break;
		case 4:
			ch = new LeeSangHae(); 
			break;
			
		default:
			break;
		}
		if(ch == null) {
			System.out.println("게임 종료!");
			return;
		}else {
			// 게임 실행을 위한 객체 생성 후 선택한 캐릭터 전달
			pg = new PlayGame(ch); 
		}
		
		while (true) {	// 게임 진행 반복문
			pg.printMenu(sc); // 메뉴 출력
			if(! pg.isFlag()) { // 게임종료 조건
				System.out.println("원하는 캐릭터를 선택하세요 > ");
				System.out.println("1.피카츄 2.꼬북이 3.이상해씨 4.파이리");
				int chNum2 = sc.nextInt(); // 캐릭터 선택
				switch (chNum2) {
				case 1:
					ch = new Picachu(); // 1번에 해당하는 피카츄 객체 생성
					break;
				case 2:
					ch = new PyLee(); 
					break;
				case 3:
					ch = new Kobbugi(); 
					break;
				case 4:
					ch = new LeeSangHae(); 
					break;
					
				default:
					break;
				}
				if(ch == null) {
					System.out.println("게임 종료!");
					return;
				}else {
					// 게임 실행을 위한 객체 생성 후 선택한 캐릭터 전달
					pg = new PlayGame(ch); 
				}
			}
		}
		
	}


}
