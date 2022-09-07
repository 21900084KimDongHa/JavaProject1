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
        String word = s.nextLine();

        System.out.print("뜻 입력 : ");
        String mean = s.nextLine();

        return new Word(0, lv, word, mean);
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
        for(int i=0;i<list.size();i++){
            System.out.print(i+1 + "  ");
            System.out.println((list.get(i).toString()));
        }
        System.out.println("\n");
    }
}
