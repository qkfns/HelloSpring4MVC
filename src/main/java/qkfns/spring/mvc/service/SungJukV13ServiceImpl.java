package qkfns.spring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qkfns.spring.mvc.dao.SungJukV12DAO;
import qkfns.spring.mvc.utils.SungJukUI;
import qkfns.spring.mvc.vo.SungJukVO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service("sjsrv13")
public class SungJukV13ServiceImpl implements SungJukV13Service {

    @Autowired
    private SungJukV12DAO sjdao12;

    public void displayMenu() {
    }

    // 입력받은 성적데이터를 처리하고
    // sungjuk 테이블에 새로운 행으로 추가한 뒤 결과 리턴
    public String newSungJuk(SungJukVO sj) {
        computeSungJuk(sj);

        return sjdao12.insertSungJuk(sj);
    }

    public void computeSungJuk(SungJukVO sj) {
        sj.setTot( sj.getKor() + sj.getEng() + sj.getMat() );
        sj.setMean( (double)sj.getTot() / 3 );
        switch((int)(sj.getMean() / 10)) {
            case 10:
            case 9: sj.setGrd('수'); break;
            case 8: sj.setGrd('우'); break;
            case 7: sj.setGrd('미'); break;
            case 6: sj.setGrd('양'); break;
            default: sj.setGrd('가');
        } // switch
    }

    // 조회할 성적데이터를 DAO로부터 넘겨받아 출력
    public List<SungJukVO> readSungJuk() {
        return sjdao12.selectSungJuk();
    }

    public SungJukVO readOneSungJuk(String sjno) {
        return sjdao12.selectOneSungJuk(sjno);
    }

    public String modifySungJuk(SungJukVO sj) {
        computeSungJuk(sj);
        return sjdao12.updateSungJuk(sj);
    }

    public String removeSungJuk(String sjno) {
        return sjdao12.deleteSungJuk(Integer.parseInt(sjno));
    }
}
