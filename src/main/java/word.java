

public class Word {

    private int id;
    private int lv;
    private String word;
    private String mean;


    Word(){}
    Word(int id, int lv, String word, String mean){
        this.id = id;
        this.lv = lv;
        this.word = word;
        this.mean = mean;
    }
    public int getId() {
        return id;
    }

    public int getLv() {
        return lv;
    }

    public String getWord() {
        return word;
    }

    public String getMean() {
        return mean;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLv(int lv) {
        this.lv = lv;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setMean(String mean) {
        this.mean = mean;
    }

    public String toString(){

        String slv = "";
        for(int i=0; i<lv; i++)
            slv += "*";
        String str = String.format("%-3s", slv) + String.format("%15s", word) + "   " + mean; // 왼쪽 정렬을 해야하기 때문에 -3

        return str;
    }

    public String toFileString(){
        return this.lv + "|" + this.word + this.mean;
    }
}
