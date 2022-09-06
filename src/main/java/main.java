import java.util.Scanner;

public class main {

    public static void main(String[] args){
        int t = 0;
        int count = 1;
        int[] lv = new int[100];
        String[] word = new String[100];
        String[] mean = new String[100];
        while(count == 1){
            //System.out.println(t+"\n");
            //System.out.println(word[t]);
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
            Scanner c = new Scanner(System.in);
            int menu = c.nextInt();
            if (menu == 1){
                if (t > 0){
                    for(int i=0; i<t; i++){
                        //System.out.println(lv);
                        System.out.print(i+1);
                        for(int j=0; j<lv[i]; j++){
                            System.out.print("*");
                        }
                        System.out.println("    " + word[i] + "  " + mean[i]);
                    }
                    System.out.println("");
                }
            }
            else if (menu == 2){

            }
            else if (menu == 3){

            }
            else if (menu == 4){
                System.out.print("=> 난이도(1,2,3) & 새 단 입력 : ");
                Scanner l = new Scanner(System.in);
                lv[t] = l.nextInt();
                word[t] = l.next();
                //System.out.print(word[t]+"\n");
                //------------------------------------------------------
                System.out.print("뜻 입력 : ");
                Scanner s = new Scanner(System.in);
                mean[t] = s.next();
                System.out.print("\n");
                System.out.println("새 단어가 단어장에 추가되었습니다 !!!\n");
                t++;
            }
            else if (menu == 5){

            }
            else if (menu == 6){

            }
            else if (menu == 7){

            }
            else if (menu == 0) {
                System.out.println("프로그램 종료! 다음에 만나요~\n");
                //System.exit(0);
                break;
            }
            else{
                System.out.println("다시 입력하세요.\n");
            }
        }
    }

}