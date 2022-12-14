import java.util.Scanner;

public class WordManager {
    Scanner s = new Scanner(System.in);

    WordCRUD wordCRUD;

    WordManager(){
        wordCRUD = new WordCRUD(s);
    }
    public int selectMenu(){
        System.out.println("*** 영단어 마스터 ***\n");
        System.out.println("*********************");
        System.out.println("1. 모든 단어보기");
        System.out.println("2. 수준별 단어 보기");
        System.out.println("3. 단어 검색");
        System.out.println("4. 단어 추가");
        System.out.println("5. 단어 수정");
        System.out.println("6. 단어 삭제");
        System.out.println("7. 파일 저장");
        System.out.println("0. 나가기");
        System.out.println("*********************");
        //------------------------------------------------------
        System.out.print("=> 원하는 메뉴는? ");
        return s.nextInt();
    }
    public void start() {
        wordCRUD.loadFile();

        while(true){
            int menu = selectMenu();
            if (menu == 1){
                wordCRUD.listAll();
            }
            else if (menu == 2){
                wordCRUD.searchLvWord();
            }
            else if (menu == 3){
                wordCRUD.searchWord();
            }
            else if (menu == 4){
                wordCRUD.addWord();
            }
            else if (menu == 5){
                wordCRUD.updateWord();
            }
            else if (menu == 6){
                wordCRUD.deleteWord();
            }
            else if (menu == 7){
                wordCRUD.saveFile();
            }
            else if (menu == 0) {
                System.out.println("프로그램 종료! 다음에 만나요~\n");
                break;
            }
            else{
                System.out.println("다시 입력하세요.\n");
            }
            //System.out.println(menu);
        }

    }
}
