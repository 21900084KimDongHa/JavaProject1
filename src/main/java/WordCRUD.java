import java.util.ArrayList;
import java.util.Scanner;

public class WordCRUD implements ICRUD{

    ArrayList<Word> list;
    Scanner s;


    WordCRUD(Scanner s) {
        list = new ArrayList<>();
        this.s = s;
    }
    @Override
    public Object add() {
        System.out.print("=> 난이도(1,2,3) & 새 단 입력 : ");
        int lv = s.nextInt();
        String word = s.next();

        System.out.print("뜻 입력 : ");
        String mean = s.nextLine();

        return new Word(0, lv, word, mean);
    }
    public Object search(){
        /*
        System.out.print("검색할 단어 입력 : ");
        String word = s.next();
        return new Word();

         */
        return 0;
    }


    public Object del() {
        return 0;
    }

    public void searchWord(){

    }
    public void addWord(){
        Word one = (Word)add();
        list.add(one);
        System.out.println("새 단어가 단어장에 추가되었습니다 !!!\n");
    }
    @Override
    public int update(Object obj) {
        return 0;
    }

    @Override
    public int delete(Object obj) {
        return 0;
    }

    @Override
    public void selectOne(int id) {

    }

    public void listAll(){
        System.out.println("----------------------");
        for(int i=0; i <list.size();i++){
            System.out.print((i+1) + "  ");
            System.out.println(list.get(i).toString());
        }
        System.out.println("----------------------");
    }

    public void updateItem() {
        System.out.print("=> 수정할 단어 검색 : ");
    }
}
