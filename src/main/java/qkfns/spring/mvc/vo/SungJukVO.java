package qkfns.spring.mvc.vo;

/**
 * 파일명 : SungJukVO
 * 작성일 : 2020.11.20
 *
 * 프로그램 설명 : 성적처리프로그램 v5
 * 이름,국어,영어,수학, 총점,평균,학점에
 * 관한 변수를 정의한 클래스
 *
 */
public class SungJukVO {
    private int sjno;
    private String name;
    private int kor;
    private int eng;
    private int mat;
    private int tot;
    private double mean;
    private char grd;
    private String regdate;


    public SungJukVO() {
    }

    public SungJukVO(
            String name, int kor, int eng, int mat,
            int tot, double mean, char grd) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
        this.tot = tot;
        this.mean = mean;
        this.grd = grd;
    }

    public SungJukVO(int sjno, String name, int kor, int eng, int mat,
                     int tot, double mean, char grd, String regdate) {
        this.sjno = sjno;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
        this.tot = tot;
        this.mean = mean;
        this.grd = grd;
        this.regdate = regdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public int getTot() {
        return tot;
    }

    public void setTot(int tot) {
        this.tot = tot;
    }

    public double getMean() {
        return mean;
    }

    public void setMean(double mean) {
        this.mean = mean;
    }

    public char getGrd() {
        return grd;
    }

    public void setGrd(char grd) {
        this.grd = grd;
    }

    public int getSjno() {
        return sjno;
    }

    public void setSjno(int sjno) {
        this.sjno = sjno;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }
}
